package me.camilo.quizandroidjuancamilo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.camilo.quizandroidjuancamilo.ui.theme.QuizAndroidJuanCamiloTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimerPantalla()
            SegundaPantalla()



        }
    }
}
@Composable
@Preview(showSystemUi = true)
fun PrimerPantalla() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center


    ) {


        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 16.dp)

        ) {
            Text(
                text = "Encabezado",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(all = 12.dp),







            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 300.dp, bottom = 16.dp, end = 16.dp)
            .background(Color.Magenta)
            .size(80.dp)

        ) {
            Text(text = "Item 1",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(all = 10.dp)
                )
            Text(text = "Item 2",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color.Green)
                    .padding(all = 10.dp)
            )
            Text(text = "Item 3",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color.Red)
                    .padding(all = 10.dp)
            )



        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 300.dp, bottom = 16.dp, end = 16.dp)

            ) {
            Text(
                text = "Pie de pagina",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color.DarkGray)
                    .padding(all = 12.dp),





                )
        }
    }

}

