package com.example.utsmobile

import android.icu.util.Output
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.utsmobile.databinding.FragmentFBMIBinding
import com.example.utsmobile.databinding.FragmentFCalculateBinding
import kotlin.math.pow

class FBMI: Fragment(){

    private lateinit var binding: FragmentFBMIBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFBMIBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.operasi.setOnClickListener {
            operationBMI()
        }
    }

    private fun operationBMI() {
        val weightStr = binding.input1.text.toString()
        val heightStr = binding.input2.text.toString()

        if (weightStr.isNotEmpty() && heightStr.isNotEmpty()) {
            val weight = weightStr.toFloatOrNull()
            val height = heightStr.toFloatOrNull()

            if (weight != null && height != null && weight > 0 && height > 0) {
                val bmi = weight / (height / 100).pow(2)
                val bmiResult = String.format("%.2f", bmi)

                val bmiCategory = when {
                    bmi < 18.5 -> "Berat Badan Rendah"
                    bmi < 25 -> "Berat Bada Ideal"
                    bmi < 30 -> "Berat Tinggi"
                    else -> "Obesitas"
                }

                binding.output.text = "BMI: $bmiResult\nCategory: $bmiCategory"
            } else {
                binding.output.text = "Data Tidak Valid"
            }
        } else {
            binding.output.text = "Data Tidak Valid"
        }
    }
}
