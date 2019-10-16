package com.example.uts

class Dosen(nama:String,nip:String,alamat:String):Pegawai(nip,nama, alamat) {
    override var nama:String? = super.nama
    override var nip:String?=super.nip
    override var alamat:String?=super.alamat
    var SKS:Int
        get() {
           return SKS
        }
        set(value) {SKS=value}
    var gaji:Double=1500000.0
        get() {
            return gaji+(SKS*(gaji*0.1))
        }


}