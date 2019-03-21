package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Burgers", "Pizza", "McDonalds")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideFoodBtn.setOnClickListener {
            val random = Random.nextInt(foodList.count())
            selectedFoodText.text = foodList[random]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            addFoodText.text.clear()
        }
    }
}
