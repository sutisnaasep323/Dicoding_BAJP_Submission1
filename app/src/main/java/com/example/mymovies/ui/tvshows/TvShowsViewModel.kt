package com.example.mymovies.ui.tvshows

import androidx.lifecycle.ViewModel
import com.example.mymovies.data.FilmEntity
import com.example.mymovies.utils.DataDummy

class TvShowsViewModel : ViewModel() {
    fun getTvShows(): List<FilmEntity> = DataDummy.getTvShows()
}