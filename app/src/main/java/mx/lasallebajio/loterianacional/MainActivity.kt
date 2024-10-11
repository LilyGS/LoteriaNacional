package mx.lasallebajio.loterianacional

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mx.lasallebajio.loterianacional.ui.theme.LoteriaNacionalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoteriaNacionalTheme {
                NavigationApp()
            }
        }
    }
}

