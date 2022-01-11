package com.example.mymovies.ui.detail

import com.example.mymovies.utils.DataDummy
import org.junit.Assert.*

import org.junit.Test

class DetailViewModelTest {

    private lateinit var detailViewModel: DetailViewModel
    private val dummyMovies = DataDummy.getMovies()[0]
    private val moviesId = dummyMovies.id

    @Test
    fun setSelectedID() {
        detailViewModel = DetailViewModel()
        detailViewModel.setSelectedID(moviesId)
    }

    @Test
    fun getDetail() {
        detailViewModel = DetailViewModel()
        detailViewModel.setSelectedID(dummyMovies.id)
        val moviesEntities = detailViewModel.getDetail()
        assertNotNull(moviesEntities)
        assertEquals(dummyMovies.id, moviesEntities.id)
        assertEquals(dummyMovies.title, moviesEntities.title)
        assertEquals(dummyMovies.releaseDate, moviesEntities.releaseDate)
        assertEquals(dummyMovies.sinopsis, moviesEntities.sinopsis)
        assertEquals(dummyMovies.duration, moviesEntities.duration)
        assertEquals(dummyMovies.genre, moviesEntities.genre)
        assertEquals(dummyMovies.poster, moviesEntities.poster)
        assertEquals(dummyMovies.userScore, moviesEntities.userScore)

    }
}