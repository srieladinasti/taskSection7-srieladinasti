fun main() {
    Rows@ for (r in 1..3){
        println(r)

        Colums@ for (c in 1..6){
            if (c == 6){
                break@Colums
            }
            println(c)
        }
    }
}