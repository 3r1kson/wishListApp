package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "start company", description = "soon as possible"),
        Wish(title = "start company", description = "soon as possible"),
        Wish(title = "start company", description = "soon as possible"),
        Wish(title = "start company", description = "soon as possible"),
        Wish(title = "start company", description = "soon as possible"),
        Wish(title = "start company", description = "soon as possible"),
        Wish(title = "make first product to sell", description = "soon as possible")
    )
}
