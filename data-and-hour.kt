import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

fun main(){
   /* 
    Existem 3 tipos de dados para se trabalhar com datas em Koltin que são: Date, LocalDate, LocalDateTime.

    O Date fui a primeira API do Java Linguage e esta prensete desde a verdão 1.0 da mesma.
    Enquato o LocalDate e o LocalDateTime vieram depois, apartir da versão 1.8, então são API mais recentes.
    */ 

    val date = Date()
    val localDate = LocalDate.now() //Caso esteja trabalhando com projetos mais novos, recomendasse utilizar o LocalDate e o LocalDateTime.
    val localDateTime = LocalDateTime.now()


    //Transformar um tipo String para um tipo Date
    var today = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("03/03/2025"))
    println(today)

    var todayAndHour = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("03/03/2025 19:00"))
    println(todayAndHour)
}