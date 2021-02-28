fun main() {
    name()
    add()
    var result=module(22,7)
        println(result)
    string()
}

fun name(){
    println("hello jane")
}
fun add(){
    var num1= 22
    var num2=7
    var num3=30
    var num4=14
    var sum =num1+num2+num3+num4
    println(sum)
}
fun module(num1:Int,num2:Int): Int{
    var module=num1%num2
    return module
}
fun string(){
    println("i enjoy eating")
}
