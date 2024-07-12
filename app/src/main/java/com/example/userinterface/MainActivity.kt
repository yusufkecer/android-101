package com.example.userinterface

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.userinterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        //(R kaynak dosyası içindeki activity_main.xml dosyasını açar) hangi xml dosyasını açacağını belirtir.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //val image = findViewById<ImageView>(R.id.imageView)
        // (R kaynak dosyası içindeki activity_main.xml dosyasındaki imageView id'li nesneyi alır.)
        //tercih edilmemektedir.


        //val textValue = findViewById<TextView>(R.id.textView1)
        //findViewById yerine viewBinding kullanılması daha performanslıdır.
        //bütün görünüm ve idleri kontrol ettiği için findViewById daha az performanslıdır.
//        val textValue = binding.textView1
//        textValue.text = "Hello World"
//
//        binding.button.setOnClickListener {
//            println("Button Clicked")
//            textValue.text = "Button Clicked"
//        }
//        newFunction("Hello")
        super.onCreate(savedInstanceState)
    }

    fun saveData(view: View) {
        println("Data Saved")
    }
    fun deleteData(view: View) {
        println("Data Deleted")
    }
}

fun newFunction(arg: String) {
    println("New Function")
}