package com.example.learnoopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.learnoopkotlin.com.shreks.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var string1 = "Hej "
        var string2 = "Adriana "
        var string3 = "Larsson  "

        var string4 =  string1 + string2 + string3

        var stringss = string4.addStrings(string1,string2, string3)
        Log.w("AddsStrings", "Strings added togehter " + stringss)

        val x: Int = 6
        val y: Int = 10


        var graterValue =x.graterValue(y)
        Log.w("Grater", "Value: " + graterValue)






         run()
        range()
        value()
        whenis()

        var sum = add()
        println( "Sum is $sum")

        Log.w("TAG", "$sum")
        Log.w("TAG", "${double(23)}")

        var stringSum = singelAdd("Hej","Adriana")
        Log.w("SingelAdd ", "StringSum: " + stringSum)


        var sumMax = max(4,6)

        Log.w("MaxValue", "Larges Value is :" + sumMax)

        var student = Student()
       var s = student.hasPassed(1)
        Log.w("HasPassed", "Passed Status " + s )

        Log.w("Scholarship","Status: " + student.isScholar(67))



    }

    fun run(){
        var objectPerson = Person("Adriana")
        txtId.text =   objectPerson.name
        objectPerson.display()
    }

    fun range(){
        var range =1..5
        var counTd = 10.rangeTo(1)

        Log.w("Tag", "Count: " + counTd)

        Log.w("Tag", "Count: " + range)
    }



    fun value(){

        var a = 80
        var b = 19

        var maxvalue: Int =0

        if (a > b){
            maxvalue = a
            Log.w("TAG ","A is grater " + maxvalue )

            
            a
        } else{
            maxvalue = b
            Log.w("TAG ","B is grater " + maxvalue)
            b

        }




    }

    fun whenis(){

        var x = 0

        when (x){

           in 1..0-> Log.w("TAG", "X is $x or $x")
            6-> Log.w("TAG", "X is 6")
            8-> Log.w("TAG", "X is 8")
            4-> Log.w("TAG", "X is 4")
            else -> Log.w("TAG", "X value is unknown")


        }


    }

    fun add() : Triple<Int, Int, String>  {
        var a = 8
        var b = 29
        var h = "Adriana"
        return Triple(a,b,h)


    }


    fun double(num : Int): Int{
        return num * 2


    }

    fun singelAdd(a: String, b : String): String{

        return a + b

    }

    fun max(a: Int, b: Int): Int = if (a > b) { Log.w("A", " IS GRATER " + a) } else
        Log.w("B", " IS GRATER " + b)



    fun String.addStrings(str1: String, str2: String, str3: String): String{
        return str1 + str2 + str3

    }

    fun Int.graterValue(other: Int): Int{

        if (this > other){
            return this
        }else
            return other

    }



}


fun Student.isScholar(marks: Int): Boolean{

    return marks > 95

}

class Student{
    fun hasPassed(marks: Int): Boolean{


        return marks > 40

    }
}