package com.example.myappcolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myappcolumn.ui.theme.MyAppColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyColumn()
                }
            }
        }
    }
}

@Composable
fun MyColumn(){

    /* Utilizando todo el Ancho y con pesos */
   /* Column (Modifier.fillMaxSize()){
        Text(text = "Ejemplo 1", modifier = Modifier.background(Color.Red).weight(1f))
        Text(text = "Ejemplo 2", modifier = Modifier.background(Color.Blue).weight(2f))
        Text(text = "Ejemplo 3", modifier = Modifier.background(Color.Yellow).weight(3f))
        Text(text = "Ejemplo 4", modifier = Modifier.background(Color.Green).weight(4f))
    }*/

    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Ejemplo 1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 2", modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 3", modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 4", modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 5", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 6", modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 7", modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 8", modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 9", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 10", modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 11", modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .height(100.dp))
        Text(text = "Ejemplo 12", modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
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
    MyAppColumnTheme {
        MyColumn()
    }
}