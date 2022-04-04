package com.brian.recyclerview.briandata
//class data yang ditampilkan
import com.brian.recyclerview.R
import com.brian.recyclerview.brianmodel.Berita

class Datasource() {

    fun loadAffirmations(): List<Berita> {
        return listOf<Berita>(
            Berita(R.string.berita1, R.drawable.gambar_1),
            Berita(R.string.berita2, R.drawable.gambar_2),
            Berita(R.string.berita3, R.drawable.gambar_3),
            Berita(R.string.berita4, R.drawable.gambar_4),
            Berita(R.string.berita5, R.drawable.gambar_5),
            Berita(R.string.berita6, R.drawable.gambar_6),
            Berita(R.string.berita7, R.drawable.gambar_7),
            Berita(R.string.berita8, R.drawable.gambar_8),
            Berita(R.string.berita9, R.drawable.gambar_9),
            Berita(R.string.berita10, R.drawable.gambar_10)
        )
    }
}