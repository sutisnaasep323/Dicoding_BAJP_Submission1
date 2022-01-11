package com.example.mymovies.ui.tvshows

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mymovies.R
import com.example.mymovies.data.FilmEntity
import com.example.mymovies.databinding.ItemsListBinding
import com.example.mymovies.ui.detail.DetailMoviesActivity

class TvShowsAdapter : RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder>() {

    private var listMovies = ArrayList<FilmEntity>()

    fun setTvShows(movie: List<FilmEntity>?) {
        if (movie == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movie)
    }

    class TvShowsViewHolder(private val binding: ItemsListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: FilmEntity) {
            with(binding) {
                title.text = movie.title
                date.text = movie.releaseDate
                genre.text = movie.genre
                duration.text = movie.duration
                sinopsis.text = movie.sinopsis
                userScore.text = movie.userScore.toString()
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviesActivity::class.java)
                    intent.putExtra(DetailMoviesActivity.EXTRA_MOVIES, movie.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movie.poster)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(posterDetail)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowsViewHolder {
        val itemsAcademyBinding =
            ItemsListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        return TvShowsViewHolder(itemsAcademyBinding)

    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

}