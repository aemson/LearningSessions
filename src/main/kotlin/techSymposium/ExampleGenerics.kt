package techSymposium

/*
interface Human<in T> {
    fun eatFood(food: T)
}

interface Restaurant<out T> {
    fun produceFood(): T
}

class Man<T> : Human<T> {
    override fun eatFood(food: T) = println("Man consumed $food")
}

class BurgerKing<T> : Restaurant<T> {
    override fun produceFood(): T = ("Meals" as T).also { println("Restaurant produced $it") }
}

fun main() {
    val burgerKing: Restaurant<String> = BurgerKing<String>()
    val producedFood = burgerKing.produceFood()
    Man<String>().eatFood(producedFood)
}*/

/*
fun main() {


    */
/***out type A = B, B = C then A = C okay ***//*

    val dog: AnimalShelterOut<Animal> = AnimalShelterOut<Dog>()
    val dog2: AnimalShelterOut<Dog> = AnimalShelterOut<Labrador>()
    val dog3: AnimalShelterOut<Animal> = AnimalShelterOut<Labrador>()

    */
/**** in type A = B then foo<B> = foo<A> **//*

    val buyerPerson: AnimalShelterIn<Dog> = AnimalShelterIn<Animal>()
    val buyerPerson1: AnimalShelterIn<Labrador> = AnimalShelterIn<Dog>()
    val buyerPerson2: AnimalShelterIn<Labrador> = AnimalShelterIn<Animal>()

    */
/** invariant type **//*

    val trainer: AnimalShelterInOut<Dog> = AnimalShelterInOut<Dog>()
}


open class Animal
open class Dog : Animal()
class Labrador : Dog()

class AnimalShelterInOut<T> {
    fun train(input: T): T {
        TODO()
    }
}

class AnimalShelterOut<out T> {
    fun adopt(): T {
        TODO()
    }
}

class AnimalShelterIn<in T> {
    fun register(input: T) {
        TODO()
    }
}

*/
