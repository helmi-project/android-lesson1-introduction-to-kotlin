package com.androidatc.lesson01.E7_Numbers

/**
 * Created by HELMI on 10/29/2019.
 */

var x: Int= 9 // Secara eksplisit mendeklarasikan tipe data integer
var y = 5 // Langsung dianggap integer

var v: Byte= 10 // Byte harus dinyatakan secara eksplisit tipe datanya
var w: Byte= 5

var price: Double= 10.05 // Secara eksplisit mendeklarasikan tipe data double
var tax = 0.05 // Langsung dianggap double

fun main() {
    var z: Int= x+y
    println("z = "+z)

    var z2 = x-y
    println("z2 = "+z2)

    var z3 = v+w
    println("z3 = $z3") // Tipe data z3 adalah integer bukan byte biarpun dari penjumlahan 2 byte

    // var z4: Byte= v-w Tidak bisa mengoperasikan bilangan byte

    println("price = $price and tax = $tax")

    var First_Name: String?= null // Mengisi variable dengan tipe data null(kosong)
    println(First_Name)

    First_Name = "William" // Mengganti value null ke tipe data string
    println(First_Name)

    var harga: Float= 10.05f // Float harus dinyatakan secara eksplisit dan diberi f setelah angka
    println(harga)
}