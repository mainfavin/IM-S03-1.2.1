package com.example.felizcumpleanos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.felizcumpleanos.ui.theme.FelizCumpleanosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FelizCumpleanosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithText(mensage = "Felicidades Marcos", de = "-De parte de nadie :D")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(mensage: String, de: String){
    Column{
        Text(text = mensage, fontSize = 40.sp)
        Text(text = de, fontSize = 24.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true )
@Composable
fun BirthdayCardPreview() {
    FelizCumpleanosTheme {
        BirthdayGreetingWithText(mensage = "Felicidades Marcos","- De parte de Nadie")
    }
}