package id.chat.sistemgaji

class Staf : Pegawai {

     var jumlah_kehadiran: Int = 0
     val TARIF_HARIAN = 75000

    override val gaji: Int
        get() {
            val total_gaji = jumlah_kehadiran * TARIF_HARIAN
            return total_gaji + super.gaji
        }

    constructor(nip: String, nama: String, alamat: String) : super(nip, nama, alamat) {}

    fun setKehadiran(jumlah_kehadiran: Int) {
        this.jumlah_kehadiran = jumlah_kehadiran
    }
}