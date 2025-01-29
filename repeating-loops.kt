import java.math.BigDecimal

fun main() {
    val productPrices = arrayOf(BigDecimal("1.96"), BigDecimal("2.99"), BigDecimal("23.98"), BigDecimal("59.99"))

    //For = Para
    var totalPrice = BigDecimal.ZERO

    for(price in productPrices){
        totalPrice += price
    }
    println("O preço total dos produtos é de: ${totalPrice}; Utilizando o loop For.")


    //While = Enquanto
    var count = 0
    totalPrice = BigDecimal.ZERO

    while(count < productPrices.size){
        totalPrice += productPrices[count]
        count += 1
    }
    println("O preço total dos produtos é de: ${totalPrice}; Utilizando o loop While.")


    //Do While
    count = 0
    totalPrice = BigDecimal.ZERO

    do{
        totalPrice += productPrices[count]
        count += 1
    } while(count < productPrices.size)
    println("O preço total dos produtos é de: ${totalPrice}; Utilizando o loop Do While.")
}