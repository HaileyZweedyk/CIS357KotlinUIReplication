package edu.gvsu.cis.uiappassignment
import android.R.attr.fontWeight
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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.gvsu.cis.uiappassignment.ui.theme.UiAppAssignmentTheme
import edu.gvsu.cis.uiappassignment.ui.theme.softText
import edu.gvsu.cis.uiappassignment.ui.theme.softerText
import edu.gvsu.cis.uiappassignment.ui.theme.darkerBackground
import edu.gvsu.cis.uiappassignment.ui.theme.divider
import edu.gvsu.cis.uiappassignment.ui.theme.lighterBackground
import edu.gvsu.cis.uiappassignment.ui.theme.quicksand
import edu.gvsu.cis.uiappassignment.ui.theme.shadowColor

@Composable
fun UI(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier
        .background(color = darkerBackground)
        .verticalScroll(scrollState)) {

    /*************** Top Nav *****************/
        Row(modifier = Modifier
            .padding(horizontal = 15.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(40.dp), // controls row height impact
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.backarrow),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp) // visual size
                )
            }

            Row(horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.CenterVertically) {
                Text("Hailey", fontFamily = quicksand, color = softText, fontSize = 15.sp, fontWeight = Bold)

                Spacer(modifier = modifier.width(5.dp))

                Box(
                    modifier = Modifier
                        .size(40.dp), // controls row height impact
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.pfp),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp) // visual size
                    )
                }

                Box(
                    modifier = Modifier
                        .size(30.dp), // controls row height impact
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.menu),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp) // visual size
                    )
                }
            }


        }

    /************** Main Content ***************/
        Row(modifier = modifier
            .fillMaxWidth()
            .height(80.dp),
            horizontalArrangement = Arrangement.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,) {

                Text("112.9", fontSize = 80.sp,
                    style = MaterialTheme.typography.bodyLarge,
                    letterSpacing = (-7).sp,
                    color = softText)
            }
            Column(verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.Start) {
                Box(
                    modifier = Modifier
                        .size(37.dp), // controls row height impact
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.edit),
                        contentDescription = null,
                        modifier = Modifier.size(37.dp) // visual size
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Text("lb",
                    style = MaterialTheme.typography.bodyLarge,
                    color = softText,
                    fontSize = 25.sp)
            }
        }

    /************** Date ******************/
        Text("Feb 02, 2026 8:25", style = MaterialTheme.typography.bodyLarge, color = softerText)


    /************* Disconnected *************/
        Box(contentAlignment = Alignment.Center,
            modifier = modifier
                .padding(horizontal = 35.dp)
                .height(25.dp)
                .background(
                    color = lighterBackground,
                    shape = RoundedCornerShape(6.5.dp)
                )
        ) {
            Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(20.dp), // controls row height impact
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.reddot),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp) // visual size
                    )
                }

                Spacer(modifier = modifier.width(5.dp))

                Text("Disconnected", fontFamily = quicksand, fontSize = 10.sp)

                Spacer(modifier = modifier.width(5.dp))

                Box(
                    modifier = Modifier
                        .size(20.dp), // controls row height impact
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.error),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp) // visual size
                    )
                }
            }

        }


    //********** Compared Section ***************/
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 30.dp, end = 30.dp)
        ) {
            // Shadow
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(
                        color = shadowColor,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .blur(
                        radius = 20.dp,
                        edgeTreatment = BlurredEdgeTreatment.Unbounded
                    )
            )

            // Content
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(lighterBackground)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Compared",
                        color = softText,
                        fontSize = 16.sp
                    )
                    Text(
                        "Jan 29, 2026 23:07",
                        color = softerText,
                        fontFamily = quicksand,
                        fontSize = 11.5.sp
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween, modifier = modifier
                        .padding(top = 5.dp, start = 17.dp, end = 17.dp)
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Column() {
                        Text(
                            "Weight",
                            fontFamily = quicksand,
                            fontSize = 12.sp,
                            color = softerText,
                            fontWeight = Bold
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Row(
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                "0.6",
                                fontFamily = quicksand,
                                fontSize = 25.sp,
                                fontWeight = Bold,
                                color = softText
                            )
                            Spacer(Modifier.width(2.dp))
                            Text(
                                "lb",
                                fontFamily = quicksand,
                                fontSize = 14.sp,
                                fontWeight = Bold,
                                color = softText
                            )
                        }
                    }
                    Column() {
                        Text(
                            "BMI",
                            fontFamily = quicksand,
                            fontSize = 12.sp,
                            color = softerText,
                            fontWeight = Bold
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Row(
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                "0.1",
                                fontFamily = quicksand,
                                fontSize = 25.sp,
                                fontWeight = Bold,
                                color = softText
                            )
                        }
                    }
                    Column() {
                        Text(
                            "Body Fat",
                            fontFamily = quicksand,
                            fontSize = 12.sp,
                            color = softerText,
                            fontWeight = Bold
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Row(
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                "0.2",
                                fontFamily = quicksand,
                                fontSize = 25.sp,
                                fontWeight = Bold,
                                color = softText
                            )
                            Spacer(Modifier.width(2.dp))
                            Text(
                                "%",
                                fontFamily = quicksand,
                                fontSize = 14.sp,
                                fontWeight = Bold,
                                color = softText
                            )
                        }
                    }

                }
            }
        }

        Spacer(Modifier.height(10.dp))

    /************** Body Index Section ****************/
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 30.dp, end = 30.dp)
        ) {
            // Shadow
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(
                        color = shadowColor,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .blur(
                        radius = 20.dp,
                        edgeTreatment = BlurredEdgeTreatment.Unbounded
                    )
            )

            // Content
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(lighterBackground)
            ) {
                Column( /*verticalArrangement = Arrangement.SpaceBetween,*/
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, end = 15.dp, top = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Body Index", color = softText, fontSize = 16.sp)
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 17.dp, end = 17.dp, top = 40.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(50.dp), // controls row height impact
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.bmi),
                                    contentDescription = null,
                                    modifier = Modifier.size(50.dp) // visual size
                                )
                            }

                            Spacer(Modifier.width(6.dp))

                            Text(text = "BMI", fontFamily = quicksand, fontSize = 16.sp, fontWeight = Bold, color = softText
                            )
                        }


                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Text("19.5", fontFamily = quicksand, fontSize = 21.sp, fontWeight = Bold, color = softText)

                            Spacer(Modifier.width(6.dp))

                            Box(
                                modifier = Modifier
                                    .size(10.dp), // controls row height impact
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.greendot),
                                    contentDescription = null,
                                    modifier = Modifier.size(10.dp) // visual size
                                )
                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 17.dp, end = 17.dp, top = 40.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(50.dp), // controls row height impact
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.bodyfat),
                                    contentDescription = null,
                                    modifier = Modifier.size(50.dp) // visual size
                                )
                            }

                            Spacer(Modifier.width(6.dp))

                            Text(text = "Body Fat", fontFamily = quicksand, fontSize = 16.sp, fontWeight = Bold, color = softText
                            )
                        }


                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Text("18.6%", fontFamily = quicksand, fontSize = 21.sp, fontWeight = Bold, color = softText)

                            Spacer(Modifier.width(6.dp))

                            Box(
                                modifier = Modifier
                                    .size(10.dp), // controls row height impact
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.greendot),
                                    contentDescription = null,
                                    modifier = Modifier.size(10.dp) // visual size
                                )
                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 17.dp, end = 17.dp, top = 40.dp, bottom = 40.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(50.dp), // controls row height impact
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.musclerate),
                                    contentDescription = null,
                                    modifier = Modifier.size(50.dp) // visual size
                                )
                            }

                            Spacer(Modifier.width(6.dp))

                            Text(text = "Muscle Rate", fontFamily = quicksand, fontSize = 16.sp, fontWeight = Bold, color = softText
                            )
                        }


                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Text("76.5%", fontFamily = quicksand, fontSize = 21.sp, fontWeight = Bold, color = softText)

                            Spacer(Modifier.width(6.dp))

                            Box(
                                modifier = Modifier
                                    .size(10.dp), // controls row height impact
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.greendot),
                                    contentDescription = null,
                                    modifier = Modifier.size(10.dp) // visual size
                                )
                            }
                        }
                    }
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    UiAppAssignmentTheme() {
        UI()
    }
}

