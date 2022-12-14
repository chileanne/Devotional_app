package cub360.sys.devotionalapp.presentation.Splashscreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cub360.sys.devotionalapp.R
import cub360.sys.devotionalapp.ui.theme.Purple200
import cub360.sys.devotionalapp.ui.theme.orangecolor

@Composable
fun SplashScreen(){
  Items(
      painterResource(id = R.drawable.ebele),
      headerTitle = "Start Your Day With\n a Reading Plan",
      headerDescription = "365 days reading plan that would help strenghten your spirit life for the year that keeps us in the word daily",
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

      Spacer(modifier = Modifier.height(7.dp))


      Text(
          text = headerTitle,
          fontWeight = FontWeight.W400,
          fontSize = 25.sp,
          textAlign = TextAlign.Center

          )

      Spacer(modifier = Modifier.height(7.dp))

      Text(
          text = headerDescription,
          fontWeight = FontWeight.W300,
          fontSize = 18.sp,
          textAlign = TextAlign.Center

      )

      Spacer(modifier = Modifier.height(77.dp))


      Row(
          horizontalArrangement = Arrangement.SpaceEvenly
      ){
          NextButton(title = "Previous")
          NextButton(title = "Next")
      }



  }
}


/** next Buttons **/
@Composable
fun NextButton(title : String){
    Card(
        shape = RoundedCornerShape(5.dp),
        elevation = 4.dp,
        backgroundColor = orangecolor,
        modifier = Modifier
            .width(120.dp)
            .height(70.dp)
            .padding(10.dp)


    ) {
        Text(
            text = title,
            fontWeight = FontWeight.W400,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier
                .padding(10.dp)


        )
    }
}