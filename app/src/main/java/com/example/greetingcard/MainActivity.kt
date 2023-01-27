package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                    BirthdayCardGreeting("Happy Birthday!", "from me")
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

@Preview(showBackground = true,
         showSystemUi = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        BirthdayCardGreeting("Preview Happy Birthday", "-from Me")
    }
}