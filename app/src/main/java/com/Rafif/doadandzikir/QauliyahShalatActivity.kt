package com.Rafif.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Rafif.doadandzikir.adapter.DzikirDoaAdapter

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyah: RecyclerView = findViewById(R.id.rv_qouliyah_sholat)
        rvQauliyah.layoutManager = LinearLayoutManager(this)
        rvQauliyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}