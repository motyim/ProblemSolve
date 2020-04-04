package me.motyim.codility.lesson6
// https://www.youtube.com/watch?v=HV8tzIiidSw
fun intersect(A: IntArray): Int {
    var intercet = 0
    var openCir = 0
    val max = 10_000_000;
    val startPoints = mutableListOf<Int>()
    val endPoints = mutableListOf<Int>()

    for ((c,r) in A.withIndex() ){
        startPoints.add(c-r)
        endPoints.add(if(max - r < c) max else c+r)
    }

    startPoints.sort()
    endPoints.sort()

    for (it in endPoints) {
        while (!startPoints.isEmpty()){
            if(it >= startPoints[0]){
                openCir++
                intercet+=(openCir-1)
                if(intercet>max) return -1
                startPoints.removeAt(0)
            }else{
                openCir--
                break
            }
        }
    }


    return intercet;
}

