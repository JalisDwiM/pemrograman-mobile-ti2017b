package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cvDosen.setOnClickListener { View.OnClickListener {
            var DosenIntent:Intent = Intent(this,StafActivity::class.java)
            startActivity(DosenIntent)
            this.finish()
        } }
        cvStaf.setOnClickListener { View.OnClickListener {
            var stafIntent:Intent = Intent(this,StafActivity::class.java)
            startActivity(stafIntent)
            this.finish()
        } }
    }
}
