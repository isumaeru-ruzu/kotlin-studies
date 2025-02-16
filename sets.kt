fun main() {
    /*
     Set é um outro tipo de coleção de elementos parecido com um Array ou List.
     Porém, a diferença é que com o Set você não pode adcionar elementos duplicado, exp: [1, 2, 3, 2]

     Existem 3 tipos de Sets com suas caracteristicas e performace diferentes.
     */

     var hashSet = hashSetOf<Int>(1, 2, 3, 4, 5) //O HashSet não mantém a ordem dos elementos, mas sua performace é a mais rápida.
     var sortedSet = sortedSetOf<Int>(1, 2, 3, 4, 5) //O SortedSet ordena os elementos da listas deacordo com a ordem crescente númerica ou alfabética. Sua performace é a mais lenta.
     var linkedSet = linkedSetOf<Int>(1, 2, 3, 4, 5) //O LinkedSet mantém a ordem dos elementos que foram inseridos e sua performace é bem mais rápida comparado ao do SortedSet.


    //Adicinando um elemento não existente
     hashSet.add(6)
     printAllSetElements(hashSet) //[1, 2, 3, 4, 5, 6]

    //Tentando adicinando um elemento já existente
     hashSet.add(2)
     printAllSetElements(hashSet) //[1, 2, 3, 4, 5, 6] Em uma Array ou List, seria adcionado um outro elemento 2
}


fun printAllSetElements(set:Set<Int>) {
    println("[${set.joinToString(", ")}]")
}