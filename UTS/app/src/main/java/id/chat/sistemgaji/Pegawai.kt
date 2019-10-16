package id.chat.sistemgaji

class Pegawai {

    var nip: String
    var nama: String
    val alamat: String
    val gaji: String


    fun Pegawai(nip: String, nama: String, alamat: String) {
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }

    fun setNama(nama: String) {
        this.nama = nama
    }

    fun getNama(): String {
        return this.nama
    }

    fun getGaji(): Int {
        return 1500000
    }
}