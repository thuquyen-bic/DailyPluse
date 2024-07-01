package com.example.dailypluse.article

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticleService(private val httpClient: HttpClient) {
    private val country = "us"
    private val category = "business"
    private val apiKey = "0c8784b059ca4c4a8c650a32c91c59e1"

    suspend fun getArticles(): List<ArticleRaw> {
        val response: ArticlesResponse =
            httpClient.get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey")
                .body()
        return response.articles
    }
}