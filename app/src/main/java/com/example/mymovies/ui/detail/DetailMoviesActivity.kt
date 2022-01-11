package com.example.mymovies.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.mymovies.R
import com.example.mymovies.data.FilmEntity
import com.example.mymovies.databinding.ActivityDetailMoviesBinding

class DetailMoviesActivity : AppCompatActivity() {

    private lateinit var detailMoviesBinding: ActivityDetailMoviesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailMoviesBinding = ActivityDetailMoviesBinding.inflate(layoutInflater)

        setContentView(detailMoviesBinding.root)

        detailMoviesBinding.detailContent.backButton.setOnClickListener {
            onBackPressed()
        }

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val moviesId = extras.getString(EXTRA_MOVIES)
            if (moviesId != null) {
                viewModel.setSelectedID(moviesId)
                populateCourse(viewModel.getDetail())
            }
        }

        window.statusBarColor = ContextCompat.getColor(this, R.color.purple_700)
    }

    private fun populateCourse(movieEntity: FilmEntity) {
        detailMoviesBinding.detailContent.titleDetail.text = movieEntity.title
        detailMoviesBinding.detailContent.sinopisDetail.text = movieEntity.sinopsis
        detailMoviesBinding.detailContent.date.text = movieEntity.releaseDate
        detailMoviesBinding.detailContent.genreDetail.text = movieEntity.genre
        detailMoviesBinding.detailContent.durationDetail.text = movieEntity.duration
        detailMoviesBinding.detailContent.scoreDetail.text = movieEntity.userScore.toString()

        Glide.with(this)
            .load(movieEntity.poster)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(detailMoviesBinding.detailContent.posterDetail)

    }

    companion object {
        const val EXTRA_MOVIES = "extra_movies"
    }
}

