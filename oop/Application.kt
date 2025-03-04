package oop

import java.time.LocalDate;

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val isumaeru = Person("Isumaeru", LocalDate.of(1999, 1, 24), "99933399900")

            isumaeru.talk("Hello, World!")
        }
    }
}