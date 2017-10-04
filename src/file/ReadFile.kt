package file

import java.io.FileReader

/**
 * Created by r.pek on 04.10.2017.
 */
fun main(a:Array<String>){
    readFile()
}

fun readFile() {
    var data = FileReader("test.txt")
    var str = data.readText()
    data.close()
    println(str)
}
