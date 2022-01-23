package com.example.lesson10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0
    var listElement = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val randomKitty = listOf(R.drawable.kitty, R.drawable.kittylitty, R.drawable.kittykittykitty, R.drawable.cutekitty)
//
//        if (savedInstanceState != null){
//            counter = savedInstanceState.getInt("counterKey")
//            tvCounter.text = counter.toString()
//            ivCat.setImageResource(savedInstanceState.getInt("imageKey"))
//        }
//
//        btnAction.setOnClickListener {
//            counter++
//            tvCounter.text = counter.toString()
//            listElement = randomKitty.random()
//            ivCat.setImageResource(listElement)
//        }

        btnAction.setOnClickListener {
            val color = etChooseColor.text.toString()
            when (color){
                "blue" -> ivCat.setBackgroundResource(R.color.blue)
                "green" -> ivCat.setBackgroundResource(R.color.green)
                "red" -> ivCat.setBackgroundResource(R.color.red)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counterKey", counter)
        outState.putInt("imageKey", listElement)
    }
}