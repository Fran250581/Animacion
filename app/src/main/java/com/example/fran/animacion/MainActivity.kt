package com.example.fran.animacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var animacion: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        animacion = resources.getDrawable(R.drawable.animacion) as AnimationDrawable
        val imageView = ImageView(this)
        imageView.setBackgroundColor(Color.WHITE)
        imageView.setImageDrawable(animacion)
        imageView.setOnClickListener(this)
        setContentView(imageView)
    }

    override fun onClick(v: View) {
        animacion.start()
    }
}

