package com.yusuf.muhammadyusuftask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalSatuBinding
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalTigaBinding

class SoalTiga : AppCompatActivity() {
    private lateinit var binding: ActivitySoalTigaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoalTigaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnProses.setOnClickListener {
            val radioGroup: RadioGroup = binding.formatwaktu
            val jam = binding.inptJam.text.toString()
            val menit = binding.inptMenit.text.toString()
            val detik = binding.inptDetik.text.toString()
            val format: Int = radioGroup.checkedRadioButtonId

            if(format!= -1 ){
                var radio : RadioButton = findViewById(format)
                if(jam.toInt() <= 12){
                    if(radio.text.toString() == "AM"){
                        binding.hasil.text = jam +":"+ menit +":"+ detik
                    }else if(radio.text.toString() == "PM"){
                        var konversi = jam.toInt() + 12
                        if(konversi == 24){
                            binding.hasil.text = "00" +":"+ menit +":"+ detik
                        }else {
                            binding.hasil.text = konversi.toString() + ":" + menit + ":" + detik
                        }
                    }
                }else{
                    binding.hasil.text = "jam error"
                }
            }
        }
    }
}