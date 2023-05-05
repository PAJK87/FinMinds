package com.example.finminds

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finminds.ui.theme.FinMindsTheme

class TopicActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinMindsTheme {
                Surface(

                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TopicAppBar()
                        TopicBox()
                    }
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopicAppBar(){
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(0xFF4953BB)),
        title = {
            Text(
                "Topics",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = Color.White,
            )
        }
    )

}


@Composable
fun TopicBox(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TaxButton()
        BudgetingButton()
        BuildingCSButton()
        ManagingDebt()
        InvAndRetPlanning()
    }
}


@Composable
fun TaxButton(){
    val context = LocalContext.current
    Button(
        onClick = {
            val intent = Intent(context, TaxActivity::class.java)
            context.startActivity(intent)
        },
        modifier = Modifier
            .height(70.dp)
            .width(250.dp)
            .padding(10.dp)
    ) {
        Text(text = "Tax")
    }
}
@Composable
fun BudgetingButton(){
    val context = LocalContext.current
    Button(
        onClick = {
            val intent = Intent(context, BudgetingActivity::class.java)
            context.startActivity(intent)
                  },
        modifier = Modifier
            .height(70.dp)
            .width(250.dp)
            .padding(10.dp)
    ) {
        Text(text = "Budgeting")
    }
}
@Composable
fun BuildingCSButton(){
    val context = LocalContext.current
    Button(
        onClick = {
            val intent = Intent(context, BuildingcsActivity::class.java)
            context.startActivity(intent)
        },
        modifier = Modifier
            .height(70.dp)
            .width(250.dp)
            .padding(10.dp)
    ) {
        Text(text = "Building Credit Score")
    }
}
@Composable
fun ManagingDebt(){
    val context = LocalContext.current
    Button(
        onClick = {
            val intent = Intent(context, ManageDebtActivity::class.java)
            context.startActivity(intent)
        },
        modifier = Modifier
            .height(70.dp)
            .width(250.dp)
            .padding(10.dp)
    ) {
        Text(text = "Managing Debt")
    }
}
@Composable
fun InvAndRetPlanning(){
    val context = LocalContext.current
    Button(
        onClick = {
            val intent = Intent(context, InvRetPlanActivity::class.java)
            context.startActivity(intent)
        },
        modifier = Modifier
            .height(70.dp)
            .width(250.dp)
            .padding(10.dp)
    ) {
        Text(text = "Investing and Retirement Planning")
    }
}


@Preview(showBackground = true)
@Composable
fun TopicPreview() {
    FinMindsTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MyAppBar()
            ButtonBox()
        }
    }
}