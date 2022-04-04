package com.brian.recyclerview.brianmodel
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
//class berita
data class Berita(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)