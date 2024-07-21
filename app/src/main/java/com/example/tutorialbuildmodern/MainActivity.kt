@file:Suppress("DEPRECATION")

package com.example.tutorialbuildmodern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.tutorialbuildmodern.ui.theme.TutorialBuildModernTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TutorialBuildModernTheme {


                MainScreen()
            }
        }


    }
}
@Composable
fun MainScreen() {
    val isVisible = rememberSaveable { mutableStateOf(true) }
    if (isVisible.value) {
        Login { visibility -> isVisible.value = visibility }
    } else {
        dashBoard() // Assuming you have a DashBoard composable
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun dashBoard() {
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(0xFFfBeec)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ConstraintLayout {

            val (topImg, prefile) = createRefs()
            Box(Modifier
                .fillMaxWidth()
                .height(245.dp)
                .constrainAs(topImg) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)

                }
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFFEA6035),
                            Color(0xFF3B608C)
                        ),

                        ),
                    shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp)
                )
            )

            Row(
                modifier = Modifier
                    .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                    .fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier
                        .height(100.dp)
                        .padding(start = 14.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Hellow",
                        color = Color.White,
                        fontSize = 18.sp
                    )

                    Text(
                        text = "Eren Yeager",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 14.dp)
                    )
                }

                Image(painter = painterResource(id = R.drawable.prfile), contentDescription = null,
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .clickable { }
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier

                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 24.dp, end = 24.dp)
                    .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                    .background(
                        color = Color.White, shape = RoundedCornerShape(20.dp)


                    )
                    .constrainAs(prefile) {
                        top.linkTo(topImg.bottom)
                        bottom.linkTo(topImg.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }

            ) {

                Column(
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 12.dp, end = 12.dp)
                        .height(90.dp)
                        .width(90.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(color = Color(android.graphics.Color.parseColor("#ffe0c8"))),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 8.dp, bottom = 8.dp)
                    )


                    Text(
                        text = "Notification",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        color = Color(android.graphics.Color.parseColor("#c77710"))
                    )

                }

                Column(
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 12.dp, end = 12.dp)
                        .height(90.dp)
                        .width(90.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(color = Color(android.graphics.Color.parseColor("#ffe0c8"))),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.video_call),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 8.dp, bottom = 8.dp)
                    )


                    Text(
                        text = "Video Call",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        color = Color(android.graphics.Color.parseColor("#c77710"))
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 12.dp, end = 12.dp)
                        .height(90.dp)
                        .width(90.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(color = Color(android.graphics.Color.parseColor("#ffe0c8"))),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.voice_call),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 8.dp, bottom = 8.dp)
                    )


                    Text(
                        text = "Vace Call",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        color = Color(android.graphics.Color.parseColor("#c77710"))
                    )

                }


            }
        }
        var text by rememberSaveable {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = {
                text = it
            },
            label = {
                Text(text = "Searching for...")

            },
            trailingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.search_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(43.dp)
                        .padding(end = 8.dp)
                )
            },
            shape = RoundedCornerShape(50.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color(0xFFCCCCCC),
                unfocusedTextColor = Color(0xFFCCCCCC),
                unfocusedLabelColor = Color(0xFFCCCCCC)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, end = 24.dp, start = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(50.dp))
                .background(Color.White)





        )
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, end = 24.dp, start = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(25.dp))
                .height(145.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF4C6184), // لون #4c6184
                            Color(0xFFF9C177)  // لون #f9c177
                        ),
                    ),
                    shape = RoundedCornerShape(12.dp) // استخدام شكل دائري
                )
        ){
            val (img , text1 , text2) = createRefs()

            Image(painter = painterResource(id = R.drawable.logo), contentDescription = null ,
                modifier = Modifier.constrainAs(img){
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)

                },

                )

            Text(text = "To Get Unlimtied",

                fontSize =  18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 32.dp)
                    .constrainAs(text1) {
                        top.linkTo(parent.top)
                        end.linkTo(img.start)
                        start.linkTo(parent.start)
                    }
            )
            Text(text = "Upgrad Your Account",

                fontSize =  18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 32.dp)
                    .constrainAs(text2) {
                        top.linkTo(text1.bottom)
                        end.linkTo(text1.end)
                        start.linkTo(text1.start)
                    }
            )
        }

        Row (
            verticalAlignment =  Alignment.CenterVertically,
            horizontalArrangement =  Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp, end = 16.dp, top = 16.dp
                )

        ){
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_1), contentDescription = null

                ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(16.dp)
                )
                Text(text = "Index",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                    )

            }
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_2), contentDescription = null

                    ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(16.dp)
                )
                Text(text = "Maps",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                )

            }
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_3), contentDescription = null

                    ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(16.dp)
                )
                Text(text = "Chets",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                )

            }
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_4), contentDescription = null

                    ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(16.dp)
                )
                Text(text = "Report",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                )

            }

        }


        Row (
            verticalAlignment =  Alignment.CenterVertically,
            horizontalArrangement =  Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp, end = 16.dp, top = 24.dp
                )

        ){
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_8), contentDescription = null

                    ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(start = 16.dp, end = 16.dp, top = 32.dp, bottom = 32.dp)
                )
                Text(text = "More",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                )

            }
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_7), contentDescription = null

                    ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(16.dp)
                )
                Text(text = "Settings",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                )

            }
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_6), contentDescription = null

                    ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(16.dp)
                )
                Text(text = "Tips",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                )

            }
            Column (
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Image(painter = painterResource(id = R.drawable.ic_5), contentDescription = null

                    ,modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(18.dp))

                        .padding(16.dp)
                )
                Text(text = "Calender",
                    fontSize = 13.sp,
                    modifier =  Modifier.padding(8.dp)
                    ,
                    fontWeight = FontWeight.Bold,
                    color =  Color(0xFF2E3D6D)
                )

            }

        }

    }
}