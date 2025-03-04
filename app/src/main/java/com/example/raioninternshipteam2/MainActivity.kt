package com.example.raioninternshipteam2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.raioninternshipteam2.presentation.home.HomeScreenApplicants
import com.example.raioninternshipteam2.presentation.home.HomeScreenApplicants
import com.example.raioninternshipteam2.presentation.home.HomeScreenCafe
import com.example.raioninternshipteam2.presentation.registration.AuthViewModel
import com.example.raioninternshipteam2.presentation.registration.LoginScreenApplicants
import com.example.raioninternshipteam2.presentation.registration.LoginScreenCafe
import com.example.raioninternshipteam2.presentation.registration.LoginScreenApplicants
import com.example.raioninternshipteam2.presentation.registration.RegisterNavigation
import com.example.raioninternshipteam2.presentation.registration.RegisterScreenApplicants
import com.example.raioninternshipteam2.presentation.registration.RegisterScreenCafe
import com.example.raioninternshipteam2.presentation.registration.SignupScreenApplicants
import com.example.raioninternshipteam2.presentation.registration.SignupScreenCafe
import com.example.raioninternshipteam2.presentation.registration.UserOption
import com.example.raioninternshipteam2.ui.theme.RaionInternshipTeam2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val authViewModel : AuthViewModel by viewModels()
        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = "UserOption", builder = {
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
                    SignupScreenApplicants(navController,authViewModel)
                }
                composable("SignupScreenCafe"){
                    SignupScreenCafe(navController)
                }
                composable("RegisterScreenApplicants"){
                    RegisterScreenApplicants()
                }
                composable("RegisterScreenCafe"){
                    RegisterScreenCafe()
                }

            })


        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RaionInternshipTeam2Theme {
        Greeting("Android")
    }
}