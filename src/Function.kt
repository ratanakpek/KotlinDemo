/**
 * Created by r.pek on 03.10.2017.
 */
fun main(s:Array<String>){

    println(sum(400, 100))
    callHello()
}

//Return value
fun sum(a:Int, b:Int):Int{
    var total = a+b
    return total
}

//No return, u can use :Unit
fun callHello():Unit{
    println("Hello World from Cambodia!")
}