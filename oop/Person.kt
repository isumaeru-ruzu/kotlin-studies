package oop

import java.time.LocalDate;

class Person(val name:String, val dateBirth:LocalDate, val cpf:String) {

    var age:Int = LocalDate.now().year - dateBirth.year

    fun talk(message:String){
        println("$name falou: ${message}")
    }
}