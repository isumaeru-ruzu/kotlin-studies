fun main() {
    /*
     Um Map é um tipo de coleção de elementos que possui pares de chaves e valores.
     As chaves sempre vão ser únicas porém, os valores dentro delas podem ser iguais.

     Não há necessidade de especificar os elementos que um mapa vai possuir.
    */
    val map1 = mapOf<Int, String>(
        1 to "Horrível!",
        2 to "Ruim.",
        3 to "Regular.",
        4 to "Bom.",
        5 to "Excelente!"
    )

    println(map1.get(3))

    var mutableMap1 = mutableMapOf(
        1 to "Ruim.",
        2 to "Regular.",
        3 to "Bom.",
    )

    mutableMap1.put(4, "Excelente!")
    mutableMap1[5] = "Fantástico!!" //Outra forma de add uma chave em um Mapa

    println(mutableMap1.get(4))
    println(mutableMap1[5]) //Outra forma de chamar uma chave em um Mapa
    
}