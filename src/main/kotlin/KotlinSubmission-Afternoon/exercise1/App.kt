package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan : String = "Nela Dwi"
    val namaBelakang : String = "Anggraini"
    val umur: Number = 20
    val status : Boolean = true

    println("======   MY PROFILE   ======")
    println("  Nama: $namaDepan $namaBelakang")
    println("  Umur: $umur tahun")
    println("============================")

    if (status) {
        println("STATUS: ")
        println("stay halal brother")
    } else {
        println("menunggu dilamar doi")
    }

    println("----------------------------")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println()
    println("ID Grup: $groupId")
    println("Nama Anggota: $groupMember")
    println("Sesi: $session")

    for (item in groupMember) println(" - $item")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggotaTim = listOf(
        "Ixan Delina",
        "Muhammad Chairur Rijal",
        "Nela Dwi Anggraini",
        "Patrick Paulus",
        "Siti Musrifah")
    println()

    return listOf(anggotaTim[2])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Prayoga", "Kak Nisyah")
    val countOfGroup = arrayOf<String>(
        "Ixan Delina",
        "Muhammad Chairur Rijal",
        "Nela Dwi Anggraini",
        "Patrick Paulus",
        "Siti Musrifah")

    return mentor.count() + countOfGroup.count()
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println()
    println("Total Member Group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Vortex",
        listOf(
            "Ixan Delina",
            "Muhammad Chairur Rijal",
            "Nela Dwi Anggraini",
            "Patrick Paulus",
            "Siti Musrifah"),
        "Afternoon B")
}