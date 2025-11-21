import kotlin.random.Random

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241129
 */

fun main() {

    val aDie = Random


    println("Gebe deinen Namen ein")
    var nameAnfrage: String = readln()


    var breakGame : String = "Ja"
    var counterWIN : Int = 0
    var counterLose : Int = 0

    while (breakGame.equals("ja", ignoreCase = true)) {

        val playerScore = aDie.nextInt(1,7)
        val computerScore = aDie.nextInt(1,7)

        println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
        when {
            playerScore > computerScore -> {
                println("$nameAnfrage gewinnt")
                counterWIN += 1
            }
            playerScore < computerScore -> {
                counterLose += 1
                println("Der Computer gewinnt")
            }
            else -> println("Unentschieden")
        }
        println("Möchtest du weiter Spielen ? (Ja/Nein)")

        breakGame = readln()
    }

    println("Runden gewonnen: $nameAnfrage: $counterWIN Runden gewonnen Copmuter: $counterLose")
}

main()