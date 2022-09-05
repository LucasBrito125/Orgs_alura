package br.com.alura.orgs.extensions

import android.widget.ImageView
import br.com.alura.orgs.R
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null){
    load(url) {
        fallback(br.com.alura.orgs.R.drawable.image_alert)
        error(br.com.alura.orgs.R.drawable.image_alert)
        placeholder(br.com.alura.orgs.R.drawable.placeholder)
    }
}