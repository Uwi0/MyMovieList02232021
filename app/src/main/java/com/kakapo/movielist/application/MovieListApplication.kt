package com.kakapo.movielist.application

import android.app.Application
import com.kakapo.movielist.model.database.LocalDataSource
import com.kakapo.movielist.model.database.LocalDatabase

class MovieListApplication: Application() {

    private val database by lazy{
        LocalDatabase.getInstance(this)
    }

    val repository by lazy{
        LocalDataSource(database.movieDao())
    }
}