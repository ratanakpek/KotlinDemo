package basic

/**
 * Created by r.pek on 02.10.2017.
 */


fun main(a:Array<String>){

    var a=10
    var b=20

    var max = if(a>b) a else b
    println("value $max")

    var isCute=when(max){
        20->{
           true
        }
        else->{
           false
        }
    }

    println("->\nIs she cute : $isCute")

}