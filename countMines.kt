package minesweeper

import java.lang.IndexOutOfBoundsException

class CountMines() {
    fun currentLinePreviousStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i][j - 1] == ".") {
                    minesField[i][j - 1] = 1.toString()
                } else if (minesField[i][j - 1] == "1") {
                    minesField[i][j - 1] = 2.toString()
                } else if (minesField[i][j - 1] == "2") {
                    minesField[i][j - 1] = 3.toString()
                } else if (minesField[i][j - 1] == "2") {
                    minesField[i][j - 1] = 3.toString()
                } else if (minesField[i][j - 1] == "3") {
                    minesField[i][j - 1] = 4.toString()
                } else if (minesField[i][j - 1] == "4") {
                    minesField[i][j - 1] = 5.toString()
                } else if (minesField[i][j - 1] == "5") {
                    minesField[i][j - 1] = 6.toString()
                } else if (minesField[i][j - 1] == "6") {
                    minesField[i][j - 1] = 7.toString()
                } else if (minesField[i][j - 1] == "7") {
                    minesField[i][j - 1] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }

    fun currentLineNextStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i][j + 1] == ".") {
                    minesField[i][j + 1] = 1.toString()
                } else if (minesField[i][j + 1] == "1") {
                    minesField[i][j + 1] = 2.toString()
                } else if (minesField[i][j + 1] == "2") {
                    minesField[i][j + 1] = 3.toString()
                } else if (minesField[i][j + 1] == "2") {
                    minesField[i][j + 1] = 3.toString()
                } else if (minesField[i][j + 1] == "3") {
                    minesField[i][j + 1] = 4.toString()
                } else if (minesField[i][j + 1] == "4") {
                    minesField[i][j + 1] = 5.toString()
                } else if (minesField[i][j + 1] == "5") {
                    minesField[i][j + 1] = 6.toString()
                } else if (minesField[i][j + 1] == "6") {
                    minesField[i][j + 1] = 7.toString()
                } else if (minesField[i][j + 1] == "7") {
                    minesField[i][j + 1] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }

    fun previousLinePreviousStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i - 1][j - 1] == ".") {
                    minesField[i - 1][j - 1] = 1.toString()
                } else if (minesField[i - 1][j - 1] == "1") {
                    minesField[i - 1][j - 1] = 2.toString()
                } else if (minesField[i - 1][j - 1] == "2") {
                    minesField[i - 1][j - 1] = 3.toString()
                } else if (minesField[i - 1][j - 1] == "2") {
                    minesField[i - 1][j - 1] = 3.toString()
                } else if (minesField[i - 1][j - 1] == "3") {
                    minesField[i - 1][j - 1] = 4.toString()
                } else if (minesField[i - 1][j - 1] == "4") {
                    minesField[i - 1][j - 1] = 5.toString()
                } else if (minesField[i - 1][j - 1] == "5") {
                    minesField[i - 1][j - 1] = 6.toString()
                } else if (minesField[i - 1][j - 1] == "6") {
                    minesField[i - 1][j - 1] = 7.toString()
                } else if (minesField[i - 1][j - 1] == "7") {
                    minesField[i - 1][j - 1] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }

    fun previousLineCurrentStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i - 1][j] == ".") {
                    minesField[i - 1][j] = 1.toString()
                } else if (minesField[i - 1][j] == "1") {
                    minesField[i - 1][j] = 2.toString()
                } else if (minesField[i - 1][j] == "2") {
                    minesField[i - 1][j] = 3.toString()
                } else if (minesField[i - 1][j] == "2") {
                    minesField[i - 1][j] = 3.toString()
                } else if (minesField[i - 1][j] == "3") {
                    minesField[i - 1][j] = 4.toString()
                } else if (minesField[i - 1][j] == "4") {
                    minesField[i - 1][j] = 5.toString()
                } else if (minesField[i - 1][j] == "5") {
                    minesField[i - 1][j] = 6.toString()
                } else if (minesField[i - 1][j] == "6") {
                    minesField[i - 1][j] = 7.toString()
                } else if (minesField[i - 1][j] == "7") {
                    minesField[i - 1][j] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }

    fun previousLineNextStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i - 1][j + 1] == ".") {
                    minesField[i - 1][j + 1] = 1.toString()
                } else if (minesField[i - 1][j + 1] == "1") {
                    minesField[i - 1][j + 1] = 2.toString()
                } else if (minesField[i - 1][j + 1] == "2") {
                    minesField[i - 1][j + 1] = 3.toString()
                } else if (minesField[i - 1][j + 1] == "2") {
                    minesField[i - 1][j + 1] = 3.toString()
                } else if (minesField[i - 1][j + 1] == "3") {
                    minesField[i - 1][j + 1] = 4.toString()
                } else if (minesField[i - 1][j + 1] == "4") {
                    minesField[i - 1][j + 1] = 5.toString()
                } else if (minesField[i - 1][j + 1] == "5") {
                    minesField[i - 1][j + 1] = 6.toString()
                } else if (minesField[i - 1][j + 1] == "6") {
                    minesField[i - 1][j + 1] = 7.toString()
                } else if (minesField[i - 1][j + 1] == "7") {
                    minesField[i - 1][j + 1] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }

    fun nextLinePreviousStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i + 1][j - 1] == ".") {
                    minesField[i + 1][j - 1] = 1.toString()
                } else if (minesField[i + 1][j - 1] == "1") {
                    minesField[i + 1][j - 1] = 2.toString()
                } else if (minesField[i + 1][j - 1] == "2") {
                    minesField[i + 1][j - 1] = 3.toString()
                } else if (minesField[i + 1][j - 1] == "2") {
                    minesField[i + 1][j - 1] = 3.toString()
                } else if (minesField[i + 1][j - 1] == "3") {
                    minesField[i + 1][j - 1] = 4.toString()
                } else if (minesField[i + 1][j - 1] == "4") {
                    minesField[i + 1][j - 1] = 5.toString()
                } else if (minesField[i + 1][j - 1] == "5") {
                    minesField[i + 1][j - 1] = 6.toString()
                } else if (minesField[i + 1][j - 1] == "6") {
                    minesField[i + 1][j - 1] = 7.toString()
                } else if (minesField[i + 1][j - 1] == "7") {
                    minesField[i + 1][j - 1] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }

    fun nextLineLineCurrentStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i + 1][j] == ".") {
                    minesField[i + 1][j] = 1.toString()
                } else if (minesField[i + 1][j] == "1") {
                    minesField[i + 1][j] = 2.toString()
                } else if (minesField[i + 1][j] == "2") {
                    minesField[i + 1][j] = 3.toString()
                } else if (minesField[i + 1][j] == "2") {
                    minesField[i + 1][j] = 3.toString()
                } else if (minesField[i + 1][j] == "3") {
                    minesField[i + 1][j] = 4.toString()
                } else if (minesField[i + 1][j] == "4") {
                    minesField[i + 1][j] = 5.toString()
                } else if (minesField[i + 1][j] == "5") {
                    minesField[i + 1][j] = 6.toString()
                } else if (minesField[i + 1][j] == "6") {
                    minesField[i + 1][j] = 7.toString()
                } else if (minesField[i + 1][j] == "7") {
                    minesField[i + 1][j] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }

    fun nextLineLineNextStep(minesField: Array<Array<String>>, i: Int, j: Int) {
        try {
            if (minesField[i][j] == "X") {
                if (minesField[i + 1][j + 1] == ".") {
                    minesField[i + 1][j + 1] = 1.toString()
                } else if (minesField[i + 1][j + 1] == "1") {
                    minesField[i + 1][j + 1] = 2.toString()
                } else if (minesField[i + 1][j + 1] == "2") {
                    minesField[i + 1][j + 1] = 3.toString()
                } else if (minesField[i + 1][j + 1] == "2") {
                    minesField[i + 1][j + 1] = 3.toString()
                } else if (minesField[i + 1][j + 1] == "3") {
                    minesField[i + 1][j + 1] = 4.toString()
                } else if (minesField[i + 1][j + 1] == "4") {
                    minesField[i + 1][j + 1] = 5.toString()
                } else if (minesField[i + 1][j + 1] == "5") {
                    minesField[i + 1][j + 1] = 6.toString()
                } else if (minesField[i + 1][j + 1] == "6") {
                    minesField[i + 1][j + 1] = 7.toString()
                } else if (minesField[i + 1][j + 1] == "7") {
                    minesField[i + 1][j + 1] = 8.toString()
                }
            }
        } catch (e: IndexOutOfBoundsException) {
        }
    }
}