package com.androidatc.lesson01.E8_Array

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    var x = arrayOf(5, 7, 9) // Tipe data tergantung dari elemen yang dimasukkan
    var y:IntArray= intArrayOf(5, 7, 9) // Secara eksplisit mendeklarasikan array bertipe data int

    println(x[0])
    println(x[1])
    println(x[2])

    y[2] = y[0]+y[1]
    println(y[2])

    var z = arrayOf(1, "January", '#') // Secara implisit menyatakan tipe data int, string, char
}