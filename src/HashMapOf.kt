/**
 * Created by r.pek on 02.10.2017.
 */

fun main(s:Array<String>){
    var map = hashMapOf(1 to "Ratanak", 2 to "Chivorn")
    map.put(3, "Java")

    println(map.get(1))


    //Normal Array
    var ar = arrayOf(1, 2, 3, 4, 5, 6, 7)
    for(f in ar){
        print("$f ")
    }
    ar[1]=0

    //listOf can not change value if you want to edit the element
    //use mutableListOf instead
    var list = listOf(11, 22, 33)

    var mutable = mutableListOf(12, 2,3, 3)
    mutable[12]=342



}
