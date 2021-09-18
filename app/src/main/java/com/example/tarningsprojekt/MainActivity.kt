package com.example.tarningsprojekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun setRandom (start: Int , end: Int): Int
    {

            require(start <= end) { "Illegal Argument" }

            return (start..end).random()


    }
    fun changetext(view: View)
    {
        val changetxt = findViewById<TextView>(R.id.textView)
        changetxt.text = setRandom(1,6).toString()

    }
    fun changeImage(view : View)
    {
        val diceView= findViewById<ImageView>(R.id.imageView2)
        val randomnumber =setRandom(1,6)
        when (randomnumber)
        {
            1 -> diceView.setImageResource(R.drawable.one)
            2 -> diceView.setImageResource(R.drawable.two)
            3 -> diceView.setImageResource(R.drawable.tree)
            4 -> diceView.setImageResource(R.drawable.four)
            5 -> diceView.setImageResource(R.drawable.five)
            6 -> diceView.setImageResource(R.drawable.six)

        }
    }
}