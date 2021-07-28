package com.yusuf.muhammadyusuftask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalEmpatBinding
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalSatuBinding

class SoalEmpat : AppCompatActivity() {

    private lateinit var binding: ActivitySoalEmpatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoalEmpatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnproses.setOnClickListener {
            var kalimatawal = binding.inptKata.text
            var kalimatakhir = kalimatawal?.reversed()
            binding.hasil.text = kalimatakhir
        }

    }
}