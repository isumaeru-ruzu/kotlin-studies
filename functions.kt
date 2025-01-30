import java.math.BigDecimal

fun main() {
    val productPrices = arrayOf(BigDecimal("1.96"), BigDecimal("2.99"), BigDecimal("23.98"), BigDecimal("59.99")) //88,92 total
    
    println("O preço total dos produtos é de: ${summingTotalPrice(productPrices)}.")
    println("O preço total dos produtos2 é de: ${summingTotalPrice()}.")
}

fun summingTotalPrice(productsArray: Array<BigDecimal> = arrayOf()): BigDecimal{
    var priceTotal = BigDecimal.ZERO

    if (productsArray.isNotEmpty()){
        for(price in productsArray){
            priceTotal += price
        }
        return priceTotal
    }

    println("\nNão foi possível somar o preço dos produtos; o parâmetro \"productsArray\" é vazio!")
    priceTotal = BigDecimal("0.00")
    return priceTotal
}