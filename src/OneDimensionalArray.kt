/**
 * Created by r.pek on 02.10.2017.
 */
fun main(a:Array<String>) {
    var arr = Array<Int>(5) { 5 };


    //Loop by object
    println("Loop by object")
    for (item in arr) {
        print("$item")
    }
    println()
    //Loop by index
    println("Loop by Index")

    for (i in 0..4) {
        print("$i")
    }
    println()



}


