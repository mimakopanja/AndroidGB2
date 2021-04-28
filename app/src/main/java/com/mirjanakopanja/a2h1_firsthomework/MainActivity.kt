package com.mirjanakopanja.a2h1_firsthomework

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private val TAG : String = "Homework Kotlin"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pressMeBtn: MaterialButton = findViewById(R.id.button)
        val textView : TextView = findViewById(R.id.textView)
        val movieTextView : TextView = findViewById(R.id.movieTextView)

        pressMeBtn.setOnClickListener {
            textView.text = "My first OnClickListener in Kotlin!"
        }

        val movie1 = MovieDataClass("Titanic", 8.5, 1997)
        movieTextView.text = "Name: ${movie1.movieName}, Rating: ${movie1.movieRating}, Year: ${movie1.year}"

        val newA : Int  = NewObject.a
        Toast.makeText(this, newA.toString(), Toast.LENGTH_SHORT).show()

        for (i in 1..5){
            Log.i(TAG, "One to five")
        }

        for (i in 5 until 7){
            Log.i(TAG, "Five to seven!")
        }

        for (i in 9 downTo 3){
            Log.i(TAG, i.toString())
        }

    }

}