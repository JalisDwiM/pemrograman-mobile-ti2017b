package com.example.uts

abstract class pegawai {
    abstract var nip: String
    abstract var nama: String
    abstract var alamat: String

    fun pegawai(){

    }

    fun pegawai(nip: String, nama: String, alamat: String){
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }

    fun setNm(nama: String){
        this.nama = nama
    }

    fun getNm(): String{
        return this.nama
    }

    open fun getGaji(): Int{
        return 1500000
    }

}