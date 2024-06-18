package com.example.composecourse.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.presentation.model.DataHomeOptionsSelect

@Composable
fun HomeScreen(
    toImageCard: () -> Unit,
    toCircularProgress: () -> Unit,
    toColorBoxState: () -> Unit,
    toConstraintExample: () -> Unit,
    toSimpleList: () -> Unit,
    toTextFieldButtonsShowing: () -> Unit,
    toTextFontExternal: () -> Unit
) {

    val dataButtons = listOf(
        DataHomeOptionsSelect(
            title = "ImageCard",
            color = Color.Blue,
            route = toImageCard
        ),
        DataHomeOptionsSelect(
            title = "CircularProgress",
            color = Color.Black,
            route = toCircularProgress
        ),

        DataHomeOptionsSelect(
            title = "CircularProgress",
            color = Color.DarkGray,
            route = toColorBoxState
        ),

        DataHomeOptionsSelect(
            title = "CircularProgress",
            color = Color.DarkGray,
            route = toConstraintExample
        ),

        DataHomeOptionsSelect(
            title = "CircularProgress",
            color = Color.DarkGray,
            route = toSimpleList
        ),

        DataHomeOptionsSelect(
            title = "CircularProgress",
            color = Color.DarkGray,
            route = toTextFieldButtonsShowing
        ),

        DataHomeOptionsSelect(
            title = "CircularProgress",
            color = Color.DarkGray,
            route = toTextFontExternal
        )
    )

    Column(modifier = Modifier.fillMaxSize()) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding =
            PaddingValues(
                start = 8.dp,
                end = 8.dp,
                bottom = 16.dp
            ),
            modifier = Modifier.wrapContentHeight()
        ) {
            items(dataButtons.size) {
                HomeScreenItems(dataButtons[it])
            }
        }
    }
}

@Composable
fun HomeScreenItems(data: DataHomeOptionsSelect) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .aspectRatio(1.2f)
            .clip(RoundedCornerShape(8.dp))
            .background(data.color)
            .clickable {
                data.route()
            }
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(
                    vertical = 8.dp,
                    horizontal = 8.dp
                ),
            fontWeight = FontWeight.Bold,
            text = data.title,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}