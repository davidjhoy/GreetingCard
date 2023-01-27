package com.example.greetingcard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage("Happy Birthday!", "from me")
                }
            }
        }
    }
}

@Composable
fun BirthdayCardGreeting(greeting: String, from: String){
    Column{
    Text(
        text = greeting,
        fontSize = 36.sp
    )
    Text(
        text = from,
        fontSize = 24.sp
    )
    }

}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(R.drawable.bdcard)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop

        )
        BirthdayCardGreeting(greeting = message, from = from)
    }
}

@Preview(showBackground = false,
         showSystemUi = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        BirthdayGreetingWithImage("Happy Birthday", "-from S")
    }
}