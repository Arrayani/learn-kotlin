import java.util.*

fun main(){

     var file1 =  arrayOf(1,2,3,4) // ini tipe angka semua
     var file2:  Array<Any> = arrayOf(1,2,3,4,"roni reynal") // ini bisa berbagai tipe variable
    println(Arrays.toString(file1)) //
    println(file1)   // ini malah keluar bahasa goib nya
    println(file1[0]) // ini print isi index 0
    file1[1] = 100    // mengupdate isi index 1
    println(file1[1]) // ini print isi index 1
    println(file1.first())  /// print index pertama tanpa isi pakai bracket
    println(file1.last())  // print index terakhir tanpa isi pakai bracket

    file1.set(3,999) // mengupdate index ke 3
    println(Arrays.toString(file1)) //

}