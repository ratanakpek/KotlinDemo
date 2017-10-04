package file

import java.io.FileWriter

/**
 * Created by r.pek on 04.10.2017.
 */
fun main(a:Array<String>){
    println("Enter your name : ")
    var name:String = readLine().toString()
    writeFile(name)
}

fun writeFile(str:String){
    var fo = FileWriter("test.txt", true)
    fo.write(str+"\n")
    fo.close()
}