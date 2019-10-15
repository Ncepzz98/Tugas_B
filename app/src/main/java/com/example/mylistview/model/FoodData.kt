package com.example.mylistview.model

import com.example.mylistview.R

object FoodData {
    private val foodName = arrayOf(
        "makan1",
        "makan2",
        "makan3",
        "makan4",
        "makan5",
        "makan6",
        "makan7",
        "makan8",
        "makan9",
        "makan10")

    private val detail = arrayOf(
        "makan 1 makanan yang enak",
        "makan 2 makanan yang enak",
        "makan 3 makanan yang enak",
        "makan 4 makanan yang enak",
        "makan 5 makanan yang enak",
        "makan 6 makanan yang enak",
        "makan 7 makanan yang enak",
        "makan 8 makanan yang enak",
        "makan 9 makanan yang enak",
        "makan 10 makanan yang enak"
    )

    private val foodPoster = intArrayOf(
        R.drawable.images,
        R.drawable.images_1,
        R.drawable.images_2,
        R.drawable.images_3,
        R.drawable.images_4,
        R.drawable.images_5,
        R.drawable.images_6,
        R.drawable.images_7,
        R.drawable.nasi_pecel_madiun,
        R.drawable.photo
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}