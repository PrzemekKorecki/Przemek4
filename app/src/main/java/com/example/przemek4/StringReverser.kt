package com.example.przemek4

class StringReverser {

    fun tringReverser(string: String){
        var stringRev: String = ""
        for (x in string.length downTo 0){
            stringRev +=string[x]
        }
        return stringRev
    }
}