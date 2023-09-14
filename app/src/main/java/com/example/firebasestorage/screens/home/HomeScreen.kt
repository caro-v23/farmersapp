package com.example.firebasestorage.screens.home

import android.content.Intent
import android.os.Build
import android.provider.Settings
import android.window.SplashScreen
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.LocationActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CONTACT
import com.example.firebasestorage.navigation.ROUT_LOGIN
import com.example.firebasestorage.navigation.ROUT_MYPROFILE
import com.example.firebasestorage.navigation.ROUT_OURPRODUCTS
import com.example.firebasestorage.navigation.ROUT_PAYMENTS
import com.example.firebasestorage.navigation.ROUT_SERVICES
import com.example.firebasestorage.navigation.ROUT_SIGNUP
import com.example.firebasestorage.screens.myprofile.myprofile

@RequiresApi(Build.VERSION_CODES.S)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {
    val mContext= LocalContext.current
    Column (modifier = Modifier.fillMaxSize()){
        //TopApp Bar
        androidx.compose.material3.TopAppBar(title = {
            androidx.compose.material3.Text(
                text = "Homepage",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Text(text = "Welcome to your famers app")
        },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Green),
            navigationIcon = {
                androidx.compose.material3.IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            SplashScreen::class.java
                        )
                    )
                }) {
                     androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.ArrowBack, contentDescription = ""
                    )

                }
            },
            actions = {
                androidx.compose.material3.IconButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.Share, contentDescription = ""
                    )

                }
                androidx.compose.material3.IconButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.Settings, contentDescription = ""
                    )

                }

            }

        )
        Spacer(modifier = Modifier.height(20.dp))
        //CARDS
            Column {
                Row {
                    //card 1
                    Card(modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                        .clickable {
                            navController.navigate(ROUT_MYPROFILE)
                        }) {
                        Image(
                            painter = painterResource(id = R.drawable.myprofile),
                            contentDescription = ""
                        )
                        Text(text = " My Profile")


                    }

                    Spacer(modifier = Modifier.height(20.dp))
                    //Card 2

                    Card(modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                        .clickable {
                            navController.navigate(ROUT_OURPRODUCTS)

                        }) {
                        Image(
                            painter = painterResource(id = R.drawable.products),
                            contentDescription = ""
                        )
                        Text(text = "Our Products")

                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
        //Card 3
        Row {
            Card(modifier = Modifier
                .padding(20.dp)
                .clickable {
                    navController.navigate(ROUT_PAYMENTS)

                }) {
                Image(painter = painterResource(id = R.drawable.services), contentDescription = "")
                Text(text = "Our Services")

            }
            Spacer(modifier = Modifier.height(20.dp))



            //Card 4
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .clickable {
                    navController.navigate(ROUT_SERVICES)

                }) {
                Image(
                    painter = painterResource(id = R.drawable.payments),
                    contentDescription = ""
                )
                Text(text = "Payments")

            }

        }
        Row {
                //Card 5
                Card(modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize()
                    .clickable {
                        navController.navigate(ROUT_CONTACT)

                    }) {
                    Image(
                        painter = painterResource(id = R.drawable.contactus),
                        contentDescription = ""
                    )
                    Text(text = "Contact Us")
                }
                //card 6
                Card(modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize()
                    .clickable {
                        navController.navigate(ROUT_CONTACT)

                    }) {
                    Image(
                        painter = painterResource(id = R.drawable.contactus),
                        contentDescription = ""
                    )
                    Text(text = "Contact Us")
                }


        }







    }

}

@RequiresApi(Build.VERSION_CODES.S)
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
        HomeScreen(rememberNavController())

}

