package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composecourse.presentation.components.ConstraintLayoutExample
import com.example.composecourse.presentation.view.CircularProgressScreen
import com.example.composecourse.presentation.view.ColorBoxStateScreen
import com.example.composecourse.presentation.view.ConstraintsLayoutExampleScreen
import com.example.composecourse.presentation.view.HomeScreen
import com.example.composecourse.presentation.view.ImageCardScreen
import com.example.composecourse.presentation.view.SimpleListScreen
import com.example.composecourse.presentation.view.TextFieldButtonsShowingScreen
import com.example.composecourse.presentation.view.TextFontExternalScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "home"
            ) {
                composable(route = "home") {
                    HomeScreen(
                        toImageCard = {
                            navController.navigate(route = "imagecard")
                        },
                        toCircularProgress = {
                            navController.navigate(route = "circularProgress")
                        },
                        toColorBoxState = {
                            navController.navigate(route = "colorBoxState")
                        },
                        toConstraintExample = {
                            navController.navigate(route = "constraintExample")
                        },
                        toSimpleList = {
                            navController.navigate(route = "simpleList")
                        },
                        toTextFieldButtonsShowing = {
                            navController.navigate(route = "textFieldButtonsShowing")
                        },
                        toTextFontExternal = {
                            navController.navigate(route = "textFontExternal")
                        }
                    )
                }
                composable(route = "imagecard") {
                    ImageCardScreen()
                }
                composable(route = "circularProgress") {
                    CircularProgressScreen()
                }
                composable(route = "colorBoxState") {
                    ColorBoxStateScreen()
                }
                composable(route = "constraintExample"){
                    ConstraintsLayoutExampleScreen()
                }
                composable(route = "simpleList"){
                    SimpleListScreen()
                }
                composable(route = "textFieldButtonsShowing"){
                    TextFieldButtonsShowingScreen()
                }
                composable(route = "textFontExternal"){
                    TextFontExternalScreen()
                }
            }
        }
    }
}



