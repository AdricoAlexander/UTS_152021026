package com.example.utsmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.utsmobile.databinding.FragmentFStarBinding

class FStar :Fragment(){

    private lateinit var binding:FragmentFStarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFStarBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.operasi.setOnClickListener {
            Staroperation()
        }
    }
    private fun Staroperation(){

        val sum = binding.input1.text.toString()

        if(sum.isNotEmpty()){
            val jumlah = sum.toIntOrNull()
            if(jumlah != null && jumlah > 0){
                val result = StringBuilder()
                for (i in 1..jumlah.toInt()) {
                    for (j in 1..i){
                        result.append("* ")
                    }
                    result.append("\n")
                }
                binding.output.text = result.toString()
            }
        }
    }
}