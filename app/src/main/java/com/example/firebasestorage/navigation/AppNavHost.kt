package com.example.firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.screens.contact.ContactScreen
import com.example.firebasestorage.screens.home.HomeScreen
import com.example.firebasestorage.screens.login.LoginScreen
import com.example.firebasestorage.screens.myprofile.myprofile
import com.example.firebasestorage.screens.ourproducts.products
import com.example.firebasestorage.screens.payments.payments
import com.example.firebasestorage.screens.services.services
import com.example.firebasestorage.screens.signup.SignupScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_LOGIN) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_CONTACT){
            ContactScreen(navController)
        }

        composable(ROUT_UPLOAD){
            ContactScreen(navController)
        }
        composable(ROUT_UPLOAD){
            ContactScreen(navController)
        }
        composable(ROUT_MYPROFILE){
            myprofile(navController)
        }
        composable(ROUT_OURPRODUCTS){
            products(navController)
        }
        composable(ROUT_PAYMENTS){
            payments(navController)
        }
        composable(ROUT_SERVICES){
            services(navController)
        }

    }
}