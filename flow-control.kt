fun main() {
    var canSearchRoute = true
    var routeType = "Carro" //Tipos de rotas: Andando; Carro; Trem; Metro;

    //if = Se
    //else = Se não
    //when = Quando (Parecido com o Switch de outras linguagens.)
    
    if (canSearchRoute == true){
        when (routeType) {
            "Andando" -> println("Traçando rota andando.")
            "Carro" -> println("Traçando rota de carro.")
            "Trem" -> println("Traçando rota de trem.")
            "Metro" -> println("Traçando rota de metro.")
            else -> println("Rota não implementada.")
        }
    } else{
        println("Pesquisa por rotas não está disponível no momento.")
    }
}