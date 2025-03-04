package com.example.raioninternshipteam2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.raioninternshipteam2.presentation.home.HomeScreenApplicants
import com.example.raioninternshipteam2.presentation.home.HomeScreenApplicants
import com.example.raioninternshipteam2.presentation.home.HomeScreenCafe
import com.example.raioninternshipteam2.presentation.registration.LoginScreenApplicants
import com.example.raioninternshipteam2.presentation.registration.LoginScreenCafe
import com.example.raioninternshipteam2.presentation.registration.LoginScreenApplicants
import com.example.raioninternshipteam2.presentation.registration.SignupScreenApplicants
import com.example.raioninternshipteam2.presentation.registration.SignupScreenCafe
import com.example.raioninternshipteam2.presentation.registration.UserOption
import com.example.raioninternshipteam2.presentation.theme.RaionInternshipTeam2Theme
import com.google.firebase.FirebaseApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        FirebaseApp.initializeApp(this)
        setContent {
            val navController: NavHostController = rememberNavController()

            NavHost(navController = navController, startDestination = "UserOption", builder = {
                composable("UserOption"){
                    UserOption(navController)
                }
                composable("LoginScreenApplicants"){
                    LoginScreenApplicants(navController)
                }
                composable("LoginScreenCafe"){
                    LoginScreenCafe(navController)
                }
                composable("HomeScreenCafe"){
                    HomeScreenCafe(navController)
                }
                composable("HomeScreenApplicants"){
                    HomeScreenApplicants(navController)
                }
                composable("SignupScreenApplicants"){
                    SignupScreenApplicants(navController)
                }
                composable("SignupScreenCafe"){
                    SignupScreenCafe(navController)
                }

            })


        }
    }
}