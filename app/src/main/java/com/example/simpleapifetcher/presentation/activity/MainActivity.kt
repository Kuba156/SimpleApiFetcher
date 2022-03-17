package com.example.simpleapifetcher.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.simpleapifetcher.R
import com.example.simpleapifetcher.presentation.di.obtainViewModel
import com.example.simpleapifetcher.presentation.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewmodel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewmodel = viewModelFactory.obtainViewModel(this)
        viewmodel.shareLiveData.observe(this, Observer {
            it?.let {
                Toast.makeText(this, "fetched! ${it.userName}", Toast.LENGTH_LONG).show()
            }
        })
    }
}