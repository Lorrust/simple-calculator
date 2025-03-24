package com.example.simplecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculatorScreen()
        }
    }
}

@Composable
fun CalculatorButton(buttonText: String) {
    Button(
        onClick = {},
        modifier = Modifier
            .padding(8.dp)
            .width(70.dp)
    ) {
        Text(text = buttonText)
    }
}

@Composable
fun Calculator() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Display
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            text = "0",
            textAlign = TextAlign.Center
        )

        // Calculator buttons (Grid)
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Row 1
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton("7")
                CalculatorButton("8")
                CalculatorButton("9")
                CalculatorButton("/")
            }

            // Row 2
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton("4")
                CalculatorButton("5")
                CalculatorButton("6")
                CalculatorButton("*")
            }

            // Row 3
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton("1")
                CalculatorButton("2")
                CalculatorButton("3")
                CalculatorButton("-")
            }

            // Row 4
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton("C")
                CalculatorButton("0")
                CalculatorButton("=")
                CalculatorButton("+")
            }
        }
    }
}

@Composable
fun CalculatorScreen() {
    Calculator()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorScreen()
}