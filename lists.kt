fun main() {
    var myArray = arrayOf(1, 2, 3, 4, 5) //Tamanho fixo dos elementos, falta de suporte para manipulação dos elementos; porém, mais rápido para ser lido.
    var myList = arrayListOf(5, "Hello", 7, 3, "Okay")//Tamanho dinânmico e suporte a manipulações dos elementos; porém, um pouquinho mais lento. (Você também pode utilizar o "MutableList")

    println(myArray.contentToString()) //Para não me retornar só a referência de memória.
    myArray[0] = 10
    println(myArray[0])

    println(myList) //Não precisa fazer o mesmo ao array um array normal em Kotlin.
    myList.add(0, "Hi")
    println(myList)
    myList.removeAt(4)
    println(myList)
}