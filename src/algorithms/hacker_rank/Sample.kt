package algorithms

fun main() {


    var a = arrayOf<Int>(5,6,7)
    var b = arrayOf<Int>(3,6,10)

    var result = compareTriplets(a,b)

    println(result)

}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var aliceScore = 0
    var bobScore = 0

    for(i in 0..a.size-1){
        if(a[i]>b[i]){
            aliceScore+=1
        }else if(a[i]<b[i]){
            bobScore+=1
        }
    }
    val result = arrayOf(aliceScore,bobScore)


    return result
}