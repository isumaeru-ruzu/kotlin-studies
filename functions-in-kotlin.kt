fun main() {
    //Algumas funções prontas para tipo String 
    val name = "Isumaeru"
    
    var nameSize = name.count() //Retorna o número de caracteres.
    println("O nome \"${name}\" contém ${nameSize} letras.")

    var splitName = name.split("") //Separa cada caracteres das palavras e adiciona em um array.
    println(splitName)

    var dropName = name.drop(3) //Remove os caracteres inciais.
    println(dropName)

    var dropLastName = name.dropLast(5) //Remove os caracteres finais.
    println(dropLastName)

    var containsCharM = name.contains("m") //Verifica se existe o caractere dentro da palavra.
    println("Existe a letra \"M\" no nome ${name}? ${containsCharM}") 


    //Algumas funções prontas para tipo Array
    val myArray = arrayOf(31, 22, 1, 7, 9, 12) //82 total

    var sumAllValues = myArray.sumOf{ it } //Soma todos os valores de um array.
    println(sumAllValues)

    var reverseArray = myArray.reversedArray() //Reverte os valores do array.
    println(arrayToString(myArray))

    var sortArray = myArray.sortedArray() //Organiza o valores de dentro de um array em ordem cresente.
    println(arrayToString(sortArray))
}

fun arrayToString(array: Array<Int>) = array.fold("") { acc, i -> "$acc $i" }