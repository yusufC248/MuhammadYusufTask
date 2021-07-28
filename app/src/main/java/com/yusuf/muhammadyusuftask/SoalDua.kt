package com.yusuf.muhammadyusuftask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalDuaBinding
import com.yusuf.muhammadyusuftask.databinding.ActivitySoalSatuBinding
import java.util.regex.Pattern

class SoalDua : AppCompatActivity() {

    private lateinit var binding: ActivitySoalDuaBinding

    val SYARAT_EMAIL = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                "\\@" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "id" +
                "+|"+
                "co"+
                ")+"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoalDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val email: String = "yusuf@.gmail.co.id"
        val wronge: String = "yusuf@.gmail.com"

        fun isValid(str:String) :Boolean {
           return SYARAT_EMAIL.matcher(str).matches()
        }


        binding.btnn.setOnClickListener {
            val tulisan = binding.tulisan.text.toString()
            binding.hasil.text = "${isValid(tulisan)}"
        }

    }
}