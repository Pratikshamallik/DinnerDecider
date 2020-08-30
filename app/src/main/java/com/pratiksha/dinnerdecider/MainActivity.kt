package com.pratiksha.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList= arrayListOf("Chinese","Hamburger","Pizza","McDonalds","KFC Meal","Samosha")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DecideButton.setOnClickListener {
            val random = Random()
            val randomfoood=random.nextInt(foodList.count())
            SelectedFoodTxt.text=foodList[randomfoood]

        }

        buttonAddFood.setOnClickListener{
            val newFood=adFoodtxt.text.toString()
            foodList.add(newFood)
            adFoodtxt.text.clear()
            println(foodList)


        }



    }
}