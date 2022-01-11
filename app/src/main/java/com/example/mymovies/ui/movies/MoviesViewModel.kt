package com.example.mymovies.ui.movies

import androidx.lifecycle.ViewModel
import com.example.mymovies.data.FilmEntity
import com.example.mymovies.utils.DataDummy

class MoviesViewModel : ViewModel() {
    fun getMovies(): List<FilmEntity> = DataDummy.getMovies()
}