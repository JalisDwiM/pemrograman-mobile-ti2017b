package id.chat.sistemgaji

class Dosen : Pegawai {

     var jumlahSKS: Int = 0
     val TARIF_SKS = 120000

    override
     val gaji: Int
        get() {
            val total_gaji = jumlahSKS * TARIF_SKS
            return total_gaji + super.getGaji()
        }

    constructor(nip: String, nama: String, alamat: String) : super(nip, nama, alamat) {}

    fun setSKS(SKS: Int) {
        this.jumlahSKS = SKS
    }
}