package mx.lasallebajio.loterianacional.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mx.lasallebajio.loterianacional.R

@Composable
fun CardsScreen(navController: NavController){
    /*
    val cards = listOf("el_alacran", "el_apache", "el_arbol", "el_arpa", "el_bandolon", "el_barril",
        "el_borracho", "el_camaron", "el_cantarito", "el_catrin", "el_cazo", "el_corazon",
        "el_cotorro", "el_diablito", "el_gallo", "el_gorrito", "el_melon", "el_mundo",
        "el_musico", "el_negrito", "el_nopal", "el_pajaro", "el_paraguas", "el_pescado",
        "el_pino", "el_sol", "el_soldado", "el_tambor", "el_valiente", "el_venado",
        "el_violoncello", "la_arania", "la_bandera", "la_bota", "la_botella", "la_calavera",
        "la_campana", "la_chalupa", "la_corona", "la_dama", "la_escalera", "la_estrella",
        "la_garza", "la_luna", "la_maceta", "la_mano", "la_muerte", "la_palma",
        "la_pera", "la_rana", "la_rosa", "la_sandia", "la_sirena", "las_jaras"
    )
    */

    val cards = listOf(R.drawable.el_alacran, R.drawable.el_apache, R.drawable.el_arbol,
            R.drawable.el_arpa, R.drawable.el_bandolon, R.drawable.el_barril,
        R.drawable.el_borracho, R.drawable.el_camaron, R.drawable.el_cantarito,
        R.drawable.el_catrin, R.drawable.el_cazo, R.drawable.el_corazon,
                R.drawable.el_cotorro, R.drawable.el_diablito, R.drawable.el_gallo,
        R.drawable.el_gorrito, R.drawable.el_melon, R.drawable.el_mundo,
                R.drawable.el_musico, R.drawable.el_negrito, R.drawable.el_nopal,
        R.drawable.el_pajaro, R.drawable.el_paraguas, R.drawable.el_pescado,
                R.drawable.el_pino, R.drawable.el_sol, R.drawable.el_soldado,
        R.drawable.el_tambor, R.drawable.el_valiente, R.drawable.el_venado,
        R.drawable.el_violoncello, R.drawable.la_arania, R.drawable.la_bandera,
        R.drawable.la_bota, R.drawable.la_botella, R.drawable.la_calavera,
        R.drawable.la_campana, R.drawable.la_chalupa, R.drawable.la_corona,
        R.drawable.la_dama, R.drawable.la_escalera, R.drawable.la_estrella,
        R.drawable.la_garza, R.drawable.la_luna, R.drawable.la_maceta,
        R.drawable.la_mano, R.drawable.la_muerte, R.drawable.la_palma,
        R.drawable.la_pera, R.drawable.la_rana, R.drawable.la_rosa,
        R.drawable.la_sandia, R.drawable.la_sirena, R.drawable.las_jaras
    )
    var currentCard by remember { mutableStateOf(cards.random()) }


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.Center)
    {
        Image(
            painter = painterResource(id = currentCard),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().size(
                width = 202.dp,
                height = 320.dp
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { currentCard = cards.random()  }, modifier = Modifier.fillMaxWidth()) {
            Text("Siguiente Carta")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }, modifier = Modifier.fillMaxWidth()) {
            Text("Terminar Juego")
        }


    }

}



@Preview( showBackground = true )
@Composable
fun PreviewDetailScreen(){
    val navController = rememberNavController()
    CardsScreen(navController)
}