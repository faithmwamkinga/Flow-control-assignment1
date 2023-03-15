fun main() {
numbers()
    println(namesOfPeople(arrayOf("Joy", "Miriam","Marina","Joune")))
    party(2)
    numerals()
}

fun numbers() {
    for (number in 1..100) {
        if (number % 2 == 1) {
            println(number)
        }
    }
}

fun namesOfPeople(names:Array<String>):Int {
    var myname = 0
    for (name in names) {
        if (name.length > 5) {

         myname++
        }
    }
        return myname
    }

fun party(age:Int){
    when{
      age in  0..5-> println("Glass of milk")
        age in 6 ..15-> println("Fanta orange")
        else-> println("Coca-cola")
    }
}

fun numerals(){
    for (numeral in 1..100){
        if (numeral % 3 == 0 && numeral%5==0) {
            println("FizzBuzz")
        }
         else if (numeral%3==0){
             println("fizz")
        }
        else if (numeral%5==0){

            println("Buzz")
        }
        else{
            println(numeral)
        }
    }
}
//
