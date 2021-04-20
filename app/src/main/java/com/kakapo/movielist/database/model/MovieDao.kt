package com.kakapo.movielist.database.model

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import io.reactivex.rxjava3.core.Observable

@Dao
interface MovieDao {

    @get : Query("SELECT * FROM movie_table")
    val all: Observable<List<Movie>>

    @Insert(onConflict = REPLACE)
    fun insert(movie: Movie)

    @Query("DELETE FROM movie_table WHERE id = :id")
    fun deleted(id: Int)

    @Delete
    fun deleteAll()

    @Update
    fun update(movie: Movie)
}