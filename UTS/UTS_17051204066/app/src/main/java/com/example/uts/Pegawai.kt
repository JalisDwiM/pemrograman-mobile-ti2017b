package com.example.uts

open class Pegawai(nama:String, nip:String, alamat:String) {
    open var nip: String? =null
        get() = field
    open var nama : String? = null
        get() = field
    open var alamat : String?=null
        get() = field

    init {
        this.nip=nip
        this.alamat=alamat
        this.nama=nama
    }






}