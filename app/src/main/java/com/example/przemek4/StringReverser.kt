package com.example.przemek4

class StringReverser {

    fun stringReverser(string: String): String{
        var stringRev = ""
        for (x in string.length-1 downTo 0){
            stringRev +=string[x]
        }
        return stringRev
    }
}