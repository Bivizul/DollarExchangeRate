package aaa.bivizul.dollarexchangerate.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import aaa.bivizul.dollarexchangerate.presentation.ui.theme.DollarExchangeRateTheme
import aaa.bivizul.dollarexchangerate.presentation.viewmodel.DollarViewModel
import androidx.activity.viewModels

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<DollarViewModel>()
        val date1 = "02/03/2001"
        val date2 = "14/03/2001"
        val id = "R01235"


        viewModel.getDollarInfoList(date1,date2,id)

        setContent {
            DollarExchangeRateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DollarExchangeRateTheme {
        Greeting("Android")
    }
}