package techSymposium

/*****
                       _______
                      |__   __|
                        | |     _   _   _ __     ___   ___
                        | |    | | | | | '_ \   / _ \ / __|
                        | |    | |_| | | |_) | |  __/ \__ \
                        |_|     \__, | | .__/   \___| |___/
                                __/ |  | |
                               |___/   |_|
 * ***/



fun main() {
    val abc: Any? = null
    breakMyCode()
}

fun breakMyCode(): Nothing = throw NullPointerException("NPE")