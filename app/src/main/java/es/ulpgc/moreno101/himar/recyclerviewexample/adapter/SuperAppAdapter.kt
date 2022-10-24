package es.ulpgc.moreno101.himar.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.ulpgc.moreno101.himar.recyclerviewexample.R
import es.ulpgc.moreno101.himar.recyclerviewexample.SuperAppModel

class SuperAppAdapter(val superAppList: List<SuperAppModel>) : RecyclerView.Adapter<SuperAppViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperAppViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperAppViewHolder(layoutInflater.inflate(R.layout.item_sample, parent, false));
    }

    override fun onBindViewHolder(holder: SuperAppViewHolder, position: Int) {
        val item = superAppList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superAppList.size
}