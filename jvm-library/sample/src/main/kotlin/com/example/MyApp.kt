package com.example

import com.example.library.MyClass

class MyApp {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(MyClass())
        }
    }
}
