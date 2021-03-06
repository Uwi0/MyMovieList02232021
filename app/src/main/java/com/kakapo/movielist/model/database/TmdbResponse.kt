package com.kakapo.movielist.model.database

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.kakapo.movielist.model.entities.Movie

class TmdbResponse {
    @SerializedName("page")
    @Expose
    var page: Int? = null
    @SerializedName("total_results")
    @Expose
    var totalResults: Int? = null
    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null
    @SerializedName("results")
    @Expose
    var results: List<Movie>? = null
}