package com.kakapo.movielist.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.movielist.model.entities.Movie
import com.kakapo.movielist.databinding.ItemMovieMainBinding

class MovieListAdapter(
    private val fragment: Fragment,
    private var movieList: List<Movie>
) : RecyclerView.Adapter<MovieListAdapter.ViewHolder>(){

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
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}


















