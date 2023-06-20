package com.learning.topics.demo_program


fun main(){
  /*  println("Singleton class is invoked")
    println(DemoClass.name)
    println(DemoClass.add(5,25))
    println(DemoClass.add(15,25))

    println(Demo.name2)
    println(Demo.sub(55,25))
    println(Demo.sub(95,25))*/

    val arr = listOf(2,4,1,5,6)

    for (i in arr.indices){
        println(i)
    }
}

  object DemoClass {
    var name = "Vikrant Singh Rawat"
    fun add(num1:Int, num2:Int) : Int{
        return (num1+num2)
    }
}

class Demo{

    companion object{

        var name2 = "Ram Singh"

        fun sub(num1:Int, num2:Int):Int{

            return (num1 - num2)
        }
    }
}