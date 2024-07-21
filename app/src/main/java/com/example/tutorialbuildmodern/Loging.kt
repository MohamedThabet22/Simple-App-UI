package com.example.tutorialbuildmodern


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login( clik: (vissble: Boolean) -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFfBeec))
    ) {

        Image(
            painter = painterResource(id = R.drawable.top_background1),
            contentDescription = null
        )


        Text(
            text = "Welcome\n" ,
            modifier = Modifier.padding( start = 24.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFFFF5722)
        )
        Text(
            text = "Back" ,
            modifier = Modifier.padding( start = 24.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFFFF5722)
        )
        var text by rememberSaveable {
            mutableStateOf("")
        }

        TextField(
            value = text, onValueChange = {
                text = it
            },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.email), contentDescription = null,

                    modifier = Modifier
                        .size(43.dp)
                        .padding(start = 6.dp)
                        .padding(3.dp)
                )
            },
            label = { Text(text = "Email") },
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White,
                focusedBorderColor = Color(0xFFFF5722),
                unfocusedBorderColor = Color(0xFFCCCCCC),
                focusedTextColor = Color(0xFFCCCCCC)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .background(Color.White, CircleShape)
        )
        TextField(
            value = text, onValueChange = {
                text = it
            },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.password), contentDescription = null,

                    modifier = Modifier
                        .size(39.dp)
                        .padding(start = 6.dp)
                        .padding(3.dp)
                )
            },
            label = { Text(text = "Pasword") },
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White,
                focusedBorderColor = Color(0xFFFF5722),
                unfocusedBorderColor = Color(0xFFCCCCCC),
                focusedTextColor = Color(0xFFCCCCCC)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .background(Color.White, CircleShape)
        )
        Image(painter = painterResource(id = R.drawable.btn_arraw1), contentDescription = null,
            modifier = Modifier
                .width(80.dp)
                .padding(top = 24.dp)
                .align(Alignment.End)
                .clickable {
                    clik(false)
                }
                .padding(end = 24.dp)

        )

        Row(
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, start = 24.dp, end = 24.dp)
        ) {

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, end = 8.dp)
                    .weight(0.5f)
                    .height(55.dp),
                border = BorderStroke(
                    1.dp,
                    Color.Black,

                    ),
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,)

            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 14.dp)
                        .weight(0.3f),
                    verticalArrangement =  Arrangement.Center,
                ) {

                    Image(painter = painterResource(id = R.drawable.google), contentDescription =  null)

                }
                Column(
                    modifier = Modifier

                        .padding(start = 14.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Google",
                        color = Color(0xFF3F51B5),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )

                }
            }
        }


    }
}
