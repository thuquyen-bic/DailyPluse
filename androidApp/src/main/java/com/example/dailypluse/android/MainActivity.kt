package com.example.dailypluse.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import com.example.dailypluse.article.ArticleViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articlesViewModel: ArticleViewModel by viewModels()

        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppScaffold(articlesViewModel = articlesViewModel)
                }
            }
        }
    }
}

//@Preview
//@Composable
//fun DefaultPreview(){
//
//    MyApplicationTheme {
//        AboutScreen(onUpButtonClick = {
//
//        })
//    }
//}
