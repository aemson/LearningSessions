package techSymposium

/****
 *
               _____                                 _
              / ____|                              (_)
             | |  __    ___   _ __     ___   _ __   _    ___   ___
            | | |_ |  / _ \ | '_ \   / _ \ | '__| | |  / __| / __|
           | |__| | |  __/ | | | | |  __/ | |    | | | (__  \__ \
           \_____|  \___| |_| |_|  \___| |_|    |_|  \___| |___/
 *
 */




/**
            ______             _
           | ___ \            (_)
           | |_/ /  __ _  ___  _   ___  ___
           | ___ \ / _` |/ __|| | / __|/ __|
           | |_/ /| (_| |\__ \| || (__ \__ \
           \____/  \__,_||___/|_| \___||___/
 ***/























/****
               _____                                  _                   _
              |_   _|                                (_)                 | |
               | |    _ __   __   __   __ _   _ __   _    __ _   _ __   | |_
              | |   | '_ \  \ \ / /  / _` | | '__| | |  / _` | | '_ \  | __|
            _| |_  | | | |  \ V /  | (_| | | |    | | | (_| | | | | | | |_
           |_____| |_| |_|   \_/    \__,_| |_|    |_|  \__,_| |_| |_|  \__|

 ****/


























/**
__  __           _   _     _           _             _____                         _                    _           _
|  \/  |         | | | |   (_)         | |           / ____|                       | |                  (_)         | |
| \  / |  _   _  | | | |_   _   _ __   | |   ___    | |        ___    _ __    ___  | |_   _ __    __ _   _   _ __   | |_   ___
| |\/| | | | | | | | | __| | | | '_ \  | |  / _ \   | |       / _ \  | '_ \  / __| | __| | '__|  / _` | | | | '_ \  | __| / __|
| |  | | | |_| | | | | |_  | | | |_) | | | |  __/   | |____  | (_) | | | | | \__ \ | |_  | |    | (_| | | | | | | | | |_  \__ \
|_|  |_|  \__,_| |_|  \__| |_| | .__/  |_|  \___|    \_____|  \___/  |_| |_| |___/  \__| |_|     \__,_| |_| |_| |_|  \__| |___/
                               | |
                               |_|
 ***/


























/****
               _______                           ______
              |__   __|                         |  ____|
                | |    _   _   _ __     ___    | |__     _ __    __ _   ___   _   _   _ __    ___
               | |    | | | | | '_ \  / _ \    |  __|   | '__|  / _` | / __| | | | | | '__|  / _ \
              | |    | |_| | | |_) | |  __/   | |____  | |    | (_| | \__ \ | |_| | | |    |  __/
             |_|     \__, | | .__/   \___|   |______| |_|     \__,_| |___/  \__,_| |_|     \___|
                     __/ |  | |
                    |___/  |_|
 * i.e at Run time u can't query types
 * ****/

fun main() {

}

























/****
            __      __                _
           \ \    / /                (_)
            \ \  / /    __ _   _ __   _    __ _   _ __     ___    ___
             \ \/ /    / _` | | '__| | |  / _` | | '_ \   / __|  / _ \
              \  /    | (_| | | |    | | | (_| | | | | | | (__  |  __/
               \/     \__,_| |_|    |_|  \__,_| |_| |_|  \___|  \___|
 * `in` and `out`
 *
 * How they relate to each other
 *                        A vs B  ? nope
 * foo<A> vs foo<B>
 *
 *     invariant -> myInterface<A> is neither subtype of supertype myInterface<B>
 *     covariant `out` ->  A is subtype of B, so foo<A> is subtype of food<B>
 *     contravariant `in` -> A is subtype of B, so foo<B> is subtype of food<A> (inverted)
 * ****/

fun variance() {
//    val in1 : Both<Two> = Both<One>()  // invariant
//    val in2 : Both<Two> = Both<Two>()  // invariant
//    val in3 : Both<Two> = Both<Three>()  // invariant
//
//    val covariant1 : Producer<Two>  = Producer<One>()  // covariant
//    val covariant2 : Producer<Two>  = Producer<Two>()  // covariant
//    val covariant3 : Producer<Two>  = Producer<Three>()  // covariant
//
//    val contravariant1 : Consumer<Two>  = Consumer<One>() // contravariant
//    val contravariant2 : Consumer<Two>  = Consumer<Two>() // contravariant
//    val contravariant3 : Consumer<Two>  = Consumer<Three>() // contravariant
}

open class One
open class Two : One()
class Three : Two()

class Both<T> {
    fun both(input : T) : T{ TODO() }
}

class Producer<out T>{
    fun produce() :T{ TODO() }
}

class Consumer<in T>{
    fun consume(input: T){ TODO() }
}
















/**
             ______                                      _
            |  ____|                                    | |
            | |__    __  __   __ _   _ __ ___    _ __   | |   ___
            |  __|   \ \/ /  / _` | | '_ ` _ \  | '_ \  | |  / _ \
            | |____   >  <  | (_| | | | | | | | | |_) | | | |  __/
            |______| /_/\_\  \__,_| |_| |_| |_| | .__/  |_|  \___|
                                                | |
                                                |_|
 * ***/

fun genericFunExamples() {

    //invariant so should match types
//    val mutableList: MutableList<Any> = mutableListOf<String>()

//    val example1: Invariant<Number> = Invariant<Int>()
//    val example2: Invariant<Int> = Invariant<Number>()

//    val example3: List<Any> = listOf<String>()
}

class Invariant<T>