package es.ulpgc.moreno101.himar.recyclerviewexample.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import es.ulpgc.moreno101.himar.recyclerviewexample.R
import es.ulpgc.moreno101.himar.recyclerviewexample.SuperAppModel


class SuperAppViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val superApp = view.findViewById<TextView>(R.id.title)
    val creator = view.findViewById<TextView>(R.id.creator)
    val description = view.findViewById<TextView>(R.id.description)
    val photo = view.findViewById<ImageView>(R.id.imSuperApp)

    fun render(superAppModel: SuperAppModel) {
        superApp.text = superAppModel.app
        creator.text = superAppModel.creator
        description.text = superAppModel.description
        Glide.with(photo.context).load(superAppModel.photo).into(photo)
    }
}