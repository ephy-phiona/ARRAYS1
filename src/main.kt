
fun main(){
name (arrayOf("Ephy","Phiona","Alice","Tamara"))
    capitalcities(arrayOf("harare","mumbai","dodoma","jakarta"))
   number(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
  var answer=info(arrayOf("Alice","Tamara","Phiona"))
    println(answer.contentToString())
}
fun name(name: Array<String>){
    println(name.contentToString())

}
fun capitalcities(name: Array<String>){
    name.forEach {b ->
        println(b.capitalize())
    }
}
fun number(num: Array<Int>){
    var sum=num[2]+num[5]
    println(sum)
    var nums=num.indexOf(158)
    println(nums)
    var nums2=num.sortedArray()
    println(nums2.contentToString())
}
fun info(name: Array<String>):Array<String>{
    var identity=(name)
    return identity
}