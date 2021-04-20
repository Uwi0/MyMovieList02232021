package com.kakapo.movielist.model.database

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.kakapo.movielist.model.entities.Movie
import io.reactivex.rxjava3.core.Observable

@Dao
interface MovieDao {

    @get : Query("SELECT * FROM movie_table")
    val all: Observable<List<Movie>>

    @Insert(onConflict = REPLACE)
    suspend fun insert(movie: Movie)

    @Query("DELETE FROM movie_table WHERE id = :id")
    suspend fun deleted(id: Int)

    @Delete
    suspend fun deleteAll()

    @Update
    suspend fun update(movie: Movie)
}