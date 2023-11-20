package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    print("Masukkan angka: ")
    val angka = readLine()?.toIntOrNull()

    println()
    println("Angka yang dimasukkan: $angka")
    if (angka == null) {
        println("Error: Input tidak valid. Mohon masukkan angka dengan benar ^^")
    }
}