package com.yusuf.muhammadyusuftask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yusuf.muhammadyusuftask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.menusatu.setOnClickListener {
            val intent = Intent(this@MainActivity, SoalSatu::class.java)
            startActivity(intent)
        }
        binding.menudua.setOnClickListener {
            val intent = Intent(this@MainActivity, SoalDua::class.java)
            startActivity(intent)
        }
        binding.menutiga.setOnClickListener {
            val intent = Intent(this@MainActivity, SoalTiga::class.java)
            startActivity(intent)
        }
        binding.menuempat.setOnClickListener {
            val intent = Intent(this@MainActivity, SoalEmpat::class.java)
            startActivity(intent)
        }
        binding.menulima.setOnClickListener {
            val intent = Intent(this@MainActivity, SoalLima::class.java)
            startActivity(intent)
        }
    }
}