package com.example.dailypluse.article

class ArticleUseCase(private val service: ArticleService) {

    private fun mapArticles(articlesRaw: List<ArticleRaw>): List<Article> = articlesRaw.map { raw -> Article(
        raw.title,
        raw.desc ?: "Click to find out more",
        raw.date,
        raw.imageUrl ?: "https://image.cnbcfm.com/api/v1/image/107407942-1714457371438-gettyimages-1645172439-AFP_33UD3LP.jpeg?v=1714457392&w=1920&h=1080"
    ) }

    suspend fun getArticles(): List<Article>{
        val articlesRaw = service.getArticles()
        return mapArticles(articlesRaw)
    }
}