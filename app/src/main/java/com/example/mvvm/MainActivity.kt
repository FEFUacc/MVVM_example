package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var vm: MyVm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this).get(MyVm::class.java)

        findViewById<Button>(R.id.button).setOnClickListener {
            vm.updateCount()
        }

        vm.count.observe(this) {
            findViewById<TextView>(R.id.tv).text = it.toString()
        }
    }
}