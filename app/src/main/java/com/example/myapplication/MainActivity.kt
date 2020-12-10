package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var mViewModel: MainViewModel
    lateinit var recyclerView: RecyclerView
    lateinit var progress: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        recyclerView = findViewById(R.id.recyclerview)
        progress = findViewById(R.id.progress)

        mViewModel.upateUserSettings().observe(this, Observer { it ->

            val mLayoutManager1: RecyclerView.LayoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
           val customAdapter = CustomAdapter(this,it)
            recyclerView!!.adapter = customAdapter
            recyclerView!!.layoutManager = mLayoutManager1

            progress.visibility = View.GONE
            Log.e("pop", it.size.toString())
        })
    }
}