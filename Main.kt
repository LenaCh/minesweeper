package minesweeper
import java.util.*


fun main() {
    println("How many mines do you want on the field?")
    val minesField = Array(9) { arrayOf(".", ".", ".", ".", ".", ".", ".", ".", ".") }
    placeBombs(minesField)
    countMinesNumbers(minesField)
    printField(minesField)
}


fun placeBombs(minesField: Array<Array<String>>){
    val scanner = Scanner(System.`in`)
    var minesNumber = scanner.nextInt()
    while (minesNumber > 0) {
        val x = (0..8).random()
        val y = (0..8).random()
        if (minesField[x][y] !== "X") {
            minesField[x][y] = "X"
            minesNumber -= 1
        }
    }
}
fun countMinesNumbers(minesField: Array<Array<String>>) {
    val count = CountMines()
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            count.currentLinePreviousStep(minesField, i, j)
            count.currentLineNextStep(minesField, i, j)
            count.previousLinePreviousStep(minesField, i, j)
            count.previousLineCurrentStep(minesField, i, j)
            count.previousLineNextStep(minesField, i, j)
            count.nextLinePreviousStep(minesField, i, j)
            count.nextLineLineCurrentStep(minesField, i, j)
            count.nextLineLineNextStep(minesField, i, j)
        }
    }
}


fun printField(minesField: Array<Array<String>>) {
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            print(minesField[i][j])
        }
        println()
    }
}


