package com.kakapo.movielist.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakapo.movielist.R
import com.kakapo.movielist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
    }


}