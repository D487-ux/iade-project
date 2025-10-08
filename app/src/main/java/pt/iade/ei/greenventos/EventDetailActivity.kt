package pt.iade.ei.greenventos

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pt.iade.ei.greenventos.ui.theme.GreenventosTheme

class EventDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreenventosTheme {
                DetailView()
            }
        }
    }
}
@Composable
fun DetailView(){

}

@Preview(showBackground = true)
@Composable
fun DetailViewPreview() {
    GreenventosTheme {
        DetailView()
    }
}