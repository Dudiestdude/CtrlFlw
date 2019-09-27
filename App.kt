package com.dicoding.kotlin
///Hello World///



fun main (){
    val listOfInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val listOfEven = listOf(2, 4, 6, 8)

    for (i in listOfInt) {
        if (i == listOfEven ) continue
        print(i)
    }
}