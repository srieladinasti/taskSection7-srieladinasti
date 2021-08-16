fun main() {
    var nilai = 50
    var keterangan1 = when (nilai){
        in 0..20 -> "E"
        in 21..40 -> "D"
        in 41..60 -> "C"
        in 61..80 -> "B"
        in 81..100 -> "A"
        else -> "Tidak Diketahui"
    }
    println(keterangan1)

    println()

    var umur = 23
    when{
        umur % 2 == 0 -> println("Anda berada di kelompok Genap")
        else -> println("Anda berada di kelompok Ganjil")
    }

    println()

    var ph = 5
    var keterangan2 = when (ph){
        in 0..6 -> "Asam"
        7 -> "Normal"
        in 8..14 -> "Basa"
        else -> "Tidak Diketahui"
    }
    println(keterangan2)

    println()

    var plat = 55
    when{
        plat % 2 == 0 -> println("Kendaraan anda melewati jalan Genap")
        else -> println("Kendaraan anda melewati jalan Ganjil")
    }

    println()

    var umur1 = 23
    var keterangan3 = when (umur1){
        in 0..4 -> "Balita"
        in 5..11 -> "Kanak-Kanak"
        in 12..25 -> "Remaja"
        in 26..45 -> "Dewasa"
        in 46..65 -> "Lansia"
        else -> "Tidak Diketahui"
    }
    println(keterangan3)

    println()

    var atribut = "Laptop"
    when{
        atribut == "Laptop" -> println("Anda dibolehkan untuk mengikuti ujian")
        else -> println("Anda tidak dibolehkan untuk mengikuti ujian")
    }

    println()

    var risk = 5
    var keterangan4 = when (risk){
        in 0..3 -> "Low Risk"
        in 4..7 -> "Medium Risk"
        in 8..10 -> "High Risk"
        else -> "Tidak Diketahui"
    }
    println(keterangan4)

    println()

    var angka = 18
    when{
        angka % 2 == 0 -> println("Termasuk bilangan Genap")
        else -> println("Termasuk bilangan Ganjil")
    }

    println()

    var level = 5
    var keterangan5 = when (level){
        in 1..3 -> "Low Spicy"
        in 4..7 -> "Medium Spicy"
        in 8..10 -> "Very Spicy"
        else -> "Tidak Diketahui"
    }
    println(keterangan5)

    println()

    var peliharaan = "Hamster"
    when{
        peliharaan == "Kucing" -> println("Peliharaan anda dibolehkan mengikuti lomba")
        else -> println("Peliharaan anda tidak dibolehkan mengikuti lomba")
    }
}