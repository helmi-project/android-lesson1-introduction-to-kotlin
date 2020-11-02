package com.androidatc.lesson01.E10_InputOfInformationToKotlinProgram

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    println("=========================================")
    println("Welcome to Android ATC Calculator")
    println("=========================================")
    println("Enter the first number:")
    var x = Integer.valueOf(readLine()!!) // Untuk memasukkan bilangan pakai Integer.valueOf()
    println("Enter the second number:")
    var y = Integer.valueOf(readLine()!!) // Tambahkan non-null asserted (!!)
                                          // Bisa juga var y = readline()!!.toInt()

    var z = x+y // Atau z = x.plus(y)
    var a = x*y // Atau a = x.times(y)
    var b = x/y // Atau b = x.div(y)

    println("The Sum Result= $z")
    println("The Multiplication Result= ${x*y}") // Langsung melakukan operasi hitung di println
    println("The Division Result= ${x/y}")       // Tanpa menyimpannya terlebih dahulu di variable
    println("===================================================")
}