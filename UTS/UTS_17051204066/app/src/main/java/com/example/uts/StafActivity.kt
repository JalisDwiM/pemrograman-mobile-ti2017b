package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_staf.*

class StafActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staf)
        cvHitungStaff.setOnClickListener { View.OnClickListener {
            var aStaff:Pegawai= Pegawai(
                edtNamaStaff.text.toString().trim(),
                edtNipStaff.text.toString().trim(),
                edtAlamatStaff.text.toString().trim())
            var staff:Staff= aStaff as Staff
            staff.kehadiran=edtSKS.text.toString().trim() as Int

            tvResultStaff.text=staff.gaji as String
        } }
    }
}
