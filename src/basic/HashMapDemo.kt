package basic

/**
 * Created by r.pek on 02.10.2017.
 */

fun main(s:Array<String>){
    var map = HashMap<Int, String>()
    map.put(0, "LONELY_NESS")
    map.put(1, "SAD_NESS")
    map.put(2, "WEAK_NESS")

   /* println(map.get(0))*/
    for(key in map.keys){
        println(map.get(key))
    }
}
