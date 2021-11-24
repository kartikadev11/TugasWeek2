fun main(){
    val ArrayNumber : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val myList = ArrayNumber.filter { it>5 }
    val myList2 = myList.filter { it%2==0 }
    println(myList2)

}