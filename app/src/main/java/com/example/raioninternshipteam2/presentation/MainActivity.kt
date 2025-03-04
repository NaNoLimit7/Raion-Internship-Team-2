package com.example.raioninternshipteam2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.raioninternshipteam2.presentation.registration.LoginScreenCafe
import com.example.raioninternshipteam2.presentation.registration.LoginScreenUser
import com.example.raioninternshipteam2.presentation.registration.UserOption
import com.example.raioninternshipteam2.presentation.theme.RaionInternshipTeam2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = "UserOption", builder = {
                composable("UserOption"){
                    UserOption(navController)
                }
                composable("LoginScreenUser"){
                    LoginScreenUser(navController)
                }
                composable("LoginScreenCafe"){
                    LoginScreenCafe(navController)
                }
            })


        }
    }
}