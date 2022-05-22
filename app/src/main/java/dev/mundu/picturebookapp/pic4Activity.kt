package dev.mundu.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic4Activity : AppCompatActivity() {
    lateinit var btnNext3:Button
    lateinit var btnPrev2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic4)

        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this,pic5Activity::class.java)
            startActivity(intent)
        }

        btnPrev2 = findViewById(R.id.btnPrev2)
        btnPrev2.setOnClickListener {
            val intent = Intent(this,pic3Activity::class.java)
            startActivity(intent)
    }
    }
}