package es.ulpgc.moreno101.himar.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.ulpgc.moreno101.himar.recyclerviewexample.adapter.SuperAppAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SuperAppProvider.superAppModelLists
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerMain)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperAppAdapter(SuperAppProvider.superAppModelLists)
    }
}