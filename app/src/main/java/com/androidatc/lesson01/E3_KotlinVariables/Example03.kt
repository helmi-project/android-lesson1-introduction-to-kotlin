package com.androidatc.lesson01.E3_KotlinVariables

/**
 * Created by HELMI on 10/29/2019.
 */

var X = 1 // the value of X = 1 is mutable(bisa diubah)
val Y = 4 // the value of Y = 4 is immutable(tidak bisa diubah)

fun main() {
    X = 4 // Variable X bisa diubah dari 1 menjadi 4
    // Y = 7 // Variable Y tidak bisa diubah dari 4 menjadi 7

    println(X)
    println(Y)
}