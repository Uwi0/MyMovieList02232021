package com.kakapo.movielist.model.database

import androidx.annotation.WorkerThread
import com.kakapo.movielist.model.entities.Movie

open class LocalDataSource(private val movieDao: MovieDao) {

    @WorkerThread
    suspend fun insert(movie: Movie){
        movieDao.insert(movie)
    }

    @WorkerThread
    suspend fun delete(movie: Movie){
        movie.id?.let { movieDao.deleted(it) }
    }

    @WorkerThread
    suspend fun update(movie: Movie){
        movieDao.update(movie)
    }
}