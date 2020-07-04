fun main(){
    nbYear(1500, 5.0, 100, 5000)
    nbYear(1500000, 2.5, 10000, 2000000)
}

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    var years = 0
    var newPopulation = pp0
    do{
        newPopulation = (newPopulation + newPopulation * (percent / 100) + aug).toInt()
        years++
    }while(newPopulation < p)
    return years
}