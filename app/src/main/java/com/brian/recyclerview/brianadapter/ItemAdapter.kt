package com.brian.recyclerview.brianadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.brian.recyclerview.R
import com.brian.recyclerview.brianmodel.Berita

//Adapter digunakan pada recyclerview untuk menampilkan berita sebagai data objek.
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Berita>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //sumber dari data item
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    //buat tampilan baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //mengubah tampilan konten
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //mengembalikan ukuran dataset
    override fun getItemCount() = dataset.size
}