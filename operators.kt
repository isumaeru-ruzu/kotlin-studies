fun main() {
    println("##--- Operadores em Kotlin ---##")

    //Sinal de atribução de valor ( = )
    var num = 1
    var text = "Olá, operadores!"

    println(num)
    println(text)

    //Sinais de concatenação ( + ou ${} )
    println("Hello, " + "World" + "!")
    println("Outra forma de concatenar é ${"usando essa notação"}")

    println("\n")

    println("--- Operadores Aritméticos ---")
    var num1 = 5
    var num2 = 7
    
    //Sinal de somar ( + )
    println("A soma de num1 + num2 é igual à: " + Integer.toString(num1 + num2))

    //Sinal de subtrair ( - )
    println("A subtração de num2 - num1 é igual à: " + Integer.toString(num2 - num1))

    //Sinal de multiplicar ( * )
    println("A multiplicação de num1 * num2 é igual à: " + Integer.toString(num1 * num2))

    //Sinal de dividir ( / )
    println("A divição de num1 / num2 é igual à: " + Integer.toString(num1 / num2)) //Para retorna um valor com casa decimais, utilize o tipo (Float, Double ou BigDecimal) 

    //Sinal de resto de uma divição ( % )
    println("O resto da divisão de num1 / num2 é igual à: " + Integer.toString(num1 % num2))

    println("\n")

    println("--- Operadores de Comparação ---")
    //Sinal de igualdade ( == )
    num1 = 1
    num2 = 1
    println(num1 == num2) //true

    num1 = 3
    num2 = 12
    println(num1 == num2) //false

    //Sinal de "Maior que" ( > )
    num1 = 5
    num2 = 2
    println(num1 > num2) //true

    //Sinal de "Menor que" ( < )
    num1 = 2
    num2 = 8
    println(num1 < num2) //true

    //Sinal de "Maior que ou Igual" ( >= )
    num1 = 5
    num2 = 5
    println(num1 >= num2) //true

    num1 = 10
    println(num1 >= num2) //true

    //Sinal de "Menor que ou Igual" ( <= )
    num1 = 5
    println(num1 <= num2) //true

    num1 = 1
    print(num1 <= num2) // true

    println("\n")


    //Também é possível comparar Strings
    println("Isumaeru" == "Isumaeru") //true

    //Também é possível comprarar Arrays (Porém em Kotlin é de outra forma)
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)
    println(array1.contentEquals(array2)) //true
}
