package com.example.simpleapifetcher.presentation.activity

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.simpleapifetcher.R
import com.example.simpleapifetcher.presentation.viewmodel.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewmodel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        Toast.makeText(this, "ok!", Toast.LENGTH_SHORT).show()

        viewmodel.userRepoLiveData.observe(this, Observer {
            it?.let {
                Toast.makeText(this, "fetched! ${it.userName}", Toast.LENGTH_LONG).show()
            }
        })
    }
}