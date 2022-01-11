package com.example.mymovies.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilmEntity(
    val id: String,
    val title: String,
    val releaseDate: String,
    val sinopsis: String,
    val duration: String,
    val genre: String,
    val poster: Int,
    val userScore: Int,
) : Parcelable