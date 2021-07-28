package com.yusuf.muhammadyusuftask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalLimaBinding

class SoalLima : AppCompatActivity() {
    private lateinit var binding: ActivitySoalLimaBinding

    fun isPalindrome(kalimat: String): Boolean {
        val sb = StringBuilder(kalimat)

        val reverseKalimat = sb.reverse().toString()

        return kalimat.equals(reverseKalimat, ignoreCase = true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoalLimaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnproses.setOnClickListener {
            val kalimatawal = binding.inptKata.text.toString()
            if (isPalindrome(kalimatawal)){
                binding.hasil.text = "True Polindrome $kalimatawal"
            }else{
                binding.hasil.text = "false"
            }
        }

    }
}