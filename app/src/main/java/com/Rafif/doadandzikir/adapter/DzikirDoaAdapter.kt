package com.Rafif.doadandzikir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Rafif.doadandzikir.DzikirDoa
import com.Rafif.doadandzikir.R

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>) :
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>(){

    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        // inisialisasi view dari layout row_item_dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvlafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvterjemahan: TextView = view.findViewById(R.id.tv_terjemahan)
    }

    // digunakan untuk menampilakan data sesuai dengan view yang ada/
    // sesuai dengan posisi data didalam layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    // untuk mengikat view dengan data class
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvlafaz.text = listDzikirDoa[position].lafaz
        holder.tvterjemahan.text = listDzikirDoa[position].terjemahan
    }

    // menentukan jumlah item
    override fun getItemCount() = listDzikirDoa.size


}