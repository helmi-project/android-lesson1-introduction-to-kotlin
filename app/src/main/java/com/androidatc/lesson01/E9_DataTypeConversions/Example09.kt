package com.androidatc.lesson01.E9_DataTypeConversions

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    val x: Int= 55
    val y: Short= x.toShort() // Mengubah tipe data int pada variable x menjadi short
                              // Tidak perlu lagi :Short, bisa langsung val y = x.toShort()

    println("x = $x")
    println("y = $y")
}