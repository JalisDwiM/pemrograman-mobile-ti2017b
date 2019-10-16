package id.chat.sistemgaji

class DaftarGaji(jumlah_pegawai: Int) {

    val listPegawai: Array<Pegawai>
    var jumlahPegawaiSekarang = 0

    init {
        listPegawai = arrayOfNulls(jumlah_pegawai)
    }

    fun addPegawai(p: Pegawai) {
        listPegawai[jumlahPegawaiSekarang] = p
        jumlahPegawaiSekarang++
    }

    fun printSemuaGaji() {
        for (i in 0 until jumlahPegawaiSekarang) {
            print(listPegawai[i].nama + " mendapatkan gaji ")
            println(listPegawai[i].gaji)
        }
    }
}