package oop

/**
 * Created by r.pek on 04.10.2017.
 */
fun main(a:Array<String>){
 var arrayList = ArrayList<String>()
    arrayList.add("Ratanak Pek")
    arrayList.add("Vorn katort")
    arrayList.add("Sokly tor veng")
    println(arrayList)
    arrayList.love(0, 1)
    println(arrayList)
}

fun ArrayList<String>.love(index1:Int, index2:Int){
    var temp=this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, temp)
}