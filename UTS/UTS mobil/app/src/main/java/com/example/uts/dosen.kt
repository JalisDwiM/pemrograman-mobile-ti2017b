package com.example.uts

abstract class dosen: pegawai() {
    abstract var jumlSKS: Int

    fun dosen(){

    }

    fun dosen(nip: String, nama: String, alamat: String){
        super.pegawai(nip, nama, alamat)
    }

    fun setSKS(sks: Int){
        this.jumlSKS = sks
    }

    override fun getGaji(): Int {
        val total_gaji = jumlSKS*120000
        return total_gaji+super.getGaji()
    }
}