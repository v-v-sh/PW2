package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



val someList = listOf('a','b','c')  //создание коллекции, из которой будут браться элементы

var list = mutableListOf<Char>() //создание пустой коллекции, куда будут класться элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (s in someList){list.add(s)}
        /* с помощью цикла for берем все значения из первой коллекции (someList),
        и записываем во вторую (list) */

        println(list)
    }
}