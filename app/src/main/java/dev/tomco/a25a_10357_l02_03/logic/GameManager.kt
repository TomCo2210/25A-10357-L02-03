package dev.tomco.a25a_10357_l02_03.logic

import dev.tomco.a25a_10357_l02_03.model.Country
import dev.tomco.a25a_10357_l02_03.model.DataManager
import dev.tomco.a25a_10357_l02_03.utilities.Constants

class GameManager(private val lifeCount: Int = 3) {
    var score: Int = 0
        private set

    private val allCountries: List<Country> = DataManager.getAllCountries()

    var currentIndex: Int = 0
        private set

    var wrongAnswers: Int = 0
        private set

    val currentCountry: Country
        get() = allCountries[currentIndex]

    val isGameEnded: Boolean
        get() = currentIndex == allCountries.size

    val isGameOver: Boolean
        get() = wrongAnswers == lifeCount

    fun checkAnswer(expected: Boolean) {
        // check answer and add score
        if (expected == currentCountry.canEnter)
            score += Constants.GameLogic.ANSWER_POINTS

        //else : add 1 to wrong answers
        else
            wrongAnswers++

        // go to next index.
        currentIndex++
    }
}