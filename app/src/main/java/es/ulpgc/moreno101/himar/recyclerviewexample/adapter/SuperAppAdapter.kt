package es.ulpgc.moreno101.himar.recyclerviewexample.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.ulpgc.moreno101.himar.recyclerviewexample.SuperApp

class SuperAppAdapter(val superAppList: List<SuperApp>) : RecyclerView.Adapter<SuperAppViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperAppViewHolder {

    }

    override fun onBindViewHolder(holder: SuperAppViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = superAppList.size
}