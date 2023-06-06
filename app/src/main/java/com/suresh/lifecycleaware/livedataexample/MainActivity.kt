package com.suresh.lifecycleaware.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myViewModel = ViewModelProvider(this)[MyViewModel::class.java]
        textView = findViewById(R.id.txtData)

        myViewModel.liveData.observe(this, Observer {
            textView.text = it
        })

    }

    fun onUpdate(view: View) {
        myViewModel.updateData()

    }
}