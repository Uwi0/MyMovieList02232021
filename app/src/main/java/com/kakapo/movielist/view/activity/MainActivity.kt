package com.kakapo.movielist.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.movielist.R
import com.kakapo.movielist.databinding.ActivityMainBinding
import com.kakapo.movielist.model.database.LocalDataSource
import com.kakapo.movielist.view.adapter.MovieListAdapter
import io.reactivex.disposables.CompositeDisposable

class MainActivity : AppCompatActivity() {

    private lateinit var movieRecyclerView: RecyclerView
    private val adapter: MovieListAdapter? = null

    private lateinit var dataSource: LocalDataSource
    private val compositeDisposable = CompositeDisposable()

    private var mBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onStart() {
        super.onStart()
//        dataSource = LocalDataSource(application)
    }

    override fun onStop() {
        super.onStop()
        compositeDisposable.clear()
    }

    private fun setupViews(){
        movieRecyclerView
    }
}