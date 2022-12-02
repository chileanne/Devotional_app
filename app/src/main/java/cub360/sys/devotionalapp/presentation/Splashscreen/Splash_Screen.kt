package cub360.sys.devotionalapp.presentation.Splashscreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cub360.sys.devotionalapp.R

@Composable
fun SplashScreen(){
  Items(
      painterResource(id = R.drawable.ebele),
      headerTitle = "Start Your Day With\n a Reading Plan",
      headerDescription = "365 days reading plan that would help strenghten your spirit for the year",
      index = 0,

  )
}



/*** Re Usable splash screen widget**/
@Composable
fun Items(
    headerimage: Painter,
    headerTitle: String,
    headerDescription: String,
    index: Int,

){
  Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
          .fillMaxWidth()

  ){
      Image(
          painter = headerimage ,
          contentDescription ="Header Image",
          contentScale = ContentScale.FillBounds,
          modifier = Modifier
              .height(400.dp)
              .fillMaxWidth()


      )

      Spacer(modifier = Modifier.height(10.dp))


      Text(
          text = headerTitle,
          fontWeight = FontWeight.W500,
          fontSize = 25.sp,

          )
  }
}