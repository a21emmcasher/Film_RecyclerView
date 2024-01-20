package com.example.exemple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exemple.ui.theme.ExempleTheme
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var mRecyclerView : RecyclerView
    val mAdapter : FilmAdapter = FilmAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
    }

    fun setUpRecyclerView(){
        mRecyclerView = findViewById(R.id.filmList) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.FilmAdapter(getFilming(), this)
        mRecyclerView.adapter = mAdapter
    }

    fun getFilming(): MutableList<Films>{
        var filming:MutableList<Films> = ArrayList()
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        filming.add(Films("Madagascar 2", "https://upload.wikimedia.org/wikipedia/en/7/7f/Madagascar2poster.jpg"))
        return filming
    }


}