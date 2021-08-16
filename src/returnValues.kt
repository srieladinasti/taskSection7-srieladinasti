fun main() {
    var nilai = 50
    var keterangan1 = when (nilai){
        10 , 20 -> "E"
        30 , 40 -> "D"
        50 , 60 -> "C"
        70 , 80 -> "B"
        90 , 100 -> "A"
        else -> "Tidak Diketahui"
    }
    println(keterangan1)

    println()

    var ph = 5
    var keterangan2 = when (ph){
        0 , 1 , 2 -> "Really bad"
        3 , 4 -> "Bad"
        5 , 6 -> "Normal"
        7 , 8 -> "Bad"
        9 , 10 -> "Really Bad"
        else -> "Unknown"
    }
    println(keterangan2)

    println()

    var level = 5
    var keterangan3 = when (level){
        1 -> "Not Spicy"
        3 -> "Not too Spicy"
        5 -> "Spicy"
        else -> "Unknown"
    }
    println(keterangan3)

    println()

    var risk = 0
    var keterangan4 = when (risk){
        0 -> "None"
        1 -> "Low"
        3 -> "Medium"
        5 -> "High"
        else -> "Unknown"
    }
    println(keterangan4)

    println()

    var warna = 3
    var keterangan5 = when (warna){
        0 -> "netral"
        1 -> "Merah"
        2 -> "Kuning"
        3 -> "Hijau"
        4 -> "Hitam"
        5 -> "Biru"
        else -> "Tidak terdefinisi"
    }
    println(keterangan5)
}