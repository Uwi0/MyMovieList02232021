package com.kakapo.movielist.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kakapo.movielist.R
import com.kakapo.movielist.model.entities.Movie
import com.kakapo.movielist.databinding.ItemMovieMainBinding
import com.kakapo.movielist.utils.Constants

class MovieListAdapter(
    private val fragment: Fragment,
    private var movieList: List<Movie>
) : RecyclerView.Adapter<MovieListAdapter.ViewHolder>(){

    private val selectedMovies = HashSet<Movie>()

    class ViewHolder(view: ItemMovieMainBinding) : RecyclerView.ViewHolder(view.root){
        val ivImageMovie = view.movieImageview
        val tvReleaseDate = view.releaseDateTextview
        val tvTitle = view.titleTextview
        val checkBox = view.checkbox
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemMovieMainBinding =
            ItemMovieMainBinding
                .inflate(LayoutInflater.from(fragment.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = movieList[position].title
        holder.tvReleaseDate.text = movieList[position].releaseDate
        holder.checkBox.setOnClickListener {
            if (!selectedMovies.contains(movieList[position])) {
                holder.checkBox.isChecked = true
                selectedMovies.add(movieList[position])
            } else {
                holder.checkBox.isChecked = false
                selectedMovies.add(movieList[position])
            }
        }
        if(movieList[position].posterPath.equals("")){
            Glide.with(fragment)
                .load(R.drawable.ic_local_movies_gray)
                .into(holder.ivImageMovie)
        }else{
            Glide.with(fragment)
                .load(Constants.TMDB_IMAGE_URL + movieList[position].posterPath)
                .into(holder.ivImageMovie)
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}
