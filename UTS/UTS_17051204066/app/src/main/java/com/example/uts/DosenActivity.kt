package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dosen.*
import kotlinx.android.synthetic.main.activity_staf.*

import kotlinx.android.synthetic.main.activity_staf.edtSKS

class DosenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosen)
        cvHitungDosen.setOnClickListener { View.OnClickListener {
            var aStaff:Pegawai= Pegawai(
                edtNamaDosen.text.toString().trim(),
                edtNipDosen.text.toString().trim(),
                edtAlamatDosen.text.toString().trim())
            var staff:Dosen= aStaff as Dosen
            staff.SKS=edtSKS.text.toString().trim() as Int

            tvResultDosen.text=staff.gaji as String
        } }
    }
}
