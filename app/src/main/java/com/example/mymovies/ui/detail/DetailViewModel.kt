package com.example.mymovies.ui.detail

import androidx.lifecycle.ViewModel
import com.example.mymovies.data.FilmEntity
import com.example.mymovies.utils.DataDummy

class DetailViewModel : ViewModel() {
    private lateinit var id: String

    fun setSelectedID(id: String) {
        this.id = id
    }

    fun getDetail(): FilmEntity {
        lateinit var movie: FilmEntity
        val entityList = ArrayList<FilmEntity>()
        entityList.addAll(DataDummy.getMovies())
        entityList.addAll(DataDummy.getTvShows())
        for (movieEntities in entityList) {
            if (movieEntities.id == id) {
                movie = movieEntities
            }
        }
        return movie
    }
}