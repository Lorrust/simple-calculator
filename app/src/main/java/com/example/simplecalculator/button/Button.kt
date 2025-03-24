//package com.example.simplecalculator.button
//
//import android.os.Bundle
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.sp
//import androidx.core.app.ComponentActivity
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Set the content of the activity to the Calculator UI
//        setContent {
//            // Call the CalculatorScreen composable to show the calculator UI
//            CalculatorScreen()
//        }
//    }
//}
//
//@Composable
//fun CalculatorButton(buttonText: String) {
//    Button(
//        onClick = { /* No action for now */ },
//        modifier = Modifier
//            .padding(8.dp)
//            .width(70.dp) // Set a width for all buttons
//    ) {
//        Text(text = buttonText)
//    }
//}
//
//@Composable
//fun Calculator() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        // Display
//        Text(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            text = "0", // Just showing a placeholder value for the display
//            style = androidx.compose.ui.text.TextStyle(fontSize = 32.sp),
//            textAlign = androidx.compose.ui.text.input.TextAlign.End
//        )
//
//        // Calculator buttons (Grid)
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.spacedBy(8.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            // Row 1
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("7")
//                CalculatorButton("8")
//                CalculatorButton("9")
//                CalculatorButton("/")
//            }
//
//            // Row 2
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("4")
//                CalculatorButton("5")
//                CalculatorButton("6")
//                CalculatorButton("*")
//            }
//
//            // Row 3
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("1")
//                CalculatorButton("2")
//                CalculatorButton("3")
//                CalculatorButton("-")
//            }
//
//            // Row 4
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("C")
//                CalculatorButton("0")
//                CalculatorButton("=")
//                CalculatorButton("+")
//            }
//        }
//    }
//}
//
//@Composable
//fun CalculatorScreen() {
//    Calculator()
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    CalculatorScreen()
//}