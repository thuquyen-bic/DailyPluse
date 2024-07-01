package com.example.dailypluse.android

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dailypluse.android.screens.AboutScreen
import com.example.dailypluse.android.screens.ArticlesScreen
import com.example.dailypluse.android.screens.Screens
import com.example.dailypluse.article.ArticleViewModel

@Composable
fun AppScaffold(articlesViewModel: ArticleViewModel) {
    val navController = rememberNavController();

    Scaffold {
        AppNavHost(
            navController = navController,
            modifier = Modifier.fillMaxSize().padding(it),
            articlesViewModel = articlesViewModel
        )
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    articlesViewModel: ArticleViewModel,
) {
    NavHost(
        navController = navController,
        startDestination = Screens.ARTICLES.route,
        modifier = modifier,
    ) {
        composable(Screens.ARTICLES.route) {
            ArticlesScreen(
                articlesViewModel,
                onAboutButtonClick = { navController.navigate(Screens.ABOUT_DEVICE.route) }
            )
        }

        composable(Screens.ABOUT_DEVICE.route) {
            AboutScreen(
                onUpButtonClick = { navController.popBackStack() }
            )
        }
    }
}