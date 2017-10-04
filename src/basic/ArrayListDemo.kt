package basic

/**
 * Created by r.pek on 02.10.2017.
 */
fun main(a:Array<String>){
    var arrString = ArrayList<String>()

    arrString.add("Vorn katort")
    arrString.add("Broh Saart")
    arrString.add("Loy Nas")

    for(item in arrString){
        println("$item")
    }

    for(item in 0..arrString.size-1){
        println(arrString[item])
    }
}
