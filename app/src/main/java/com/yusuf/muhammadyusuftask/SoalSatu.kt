package com.yusuf.muhammadyusuftask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusuf.muhammadyusuftask.databinding.ActivityMainBinding
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalSatuBinding

class SoalSatu : AppCompatActivity() {

    private lateinit var binding: ActivitySoalSatuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoalSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnGo.setOnClickListener {
            var angka = binding.inputsatu.text.toString()
            if((angka.toInt() % 3 == 0) && (angka.toInt() % 5 == 0)){
                binding.txtResult.text = "Hello World"
            }else if(angka.toInt() % 5 == 0){
                binding.txtResult.text = "World"
            }else if(angka.toInt() % 3 == 0){
                binding.txtResult.text = "Hello"
            }else{
                binding.txtResult.text = "angka tidak valid"
            }
        }


    }
}