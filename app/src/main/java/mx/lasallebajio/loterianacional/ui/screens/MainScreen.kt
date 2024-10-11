package mx.lasallebajio.loterianacional.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mx.lasallebajio.loterianacional.R


@Composable
fun MainScreen(navController: NavController){


    Column (modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.Center)
    {
        Image(
            painter = painterResource(id = R.drawable.portada),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().size(
                width = 500.dp,
                height = 500.dp
            ),
            contentScale = ContentScale.FillBounds
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("cards_screen")

        }, modifier = Modifier.fillMaxWidth()) {
            Text("Iniciar Juego")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewMainScreen(){
    val navController = rememberNavController()
    MainScreen(navController)
}
