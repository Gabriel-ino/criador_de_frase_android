package com.example.frase_do_dia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var text: TextView
    val phrases = arrayOf(
        "O segredo do sucesso é começar", "Para de desejar e comece a ir atrás",
        "Reclame menos, alcance mais", "Acorda, o sucesso te espera", "Quanto maior" +
                "sua luta, maior sua vitória", "Os sonhos existem para se tornarem realidade",
        "Todo sucesso começa com a decisão de tentar"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById<TextView>(R.id.textView2)
    }


    fun createPhrase(view: View){
        val total = phrases.size
        val random = Random().nextInt(total)

        text.setText(phrases[random])
        



    }

}