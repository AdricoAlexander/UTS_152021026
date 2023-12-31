package com.example.utsmobile

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.utsmobile.databinding.FragmentFCalculateBinding

class FCalculate : Fragment() {
    private lateinit var binding: FragmentFCalculateBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFCalculateBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var pilihan  = 0

        var gEdt1 = binding.bilangan1
        var gEdt2 = binding.bilangan2
        var gSpin = binding.proses
        var gBtnCal = binding.hitung
        var gTvHasil = binding.output


        binding.hitung.setOnClickListener {
            var nilai1 = gEdt1.text.toString().toDouble()
            var nilai2 = gEdt2.text.toString().toDouble()
            var hasil = 0.0

            Log.d("alex", "nilai1: " + nilai1 +
                    ", nilai 2:" + nilai2)

            if (pilihan.equals(0)){
                hasil = nilai1 + nilai2
            }
            else if (pilihan.equals(1)){
                hasil = nilai1 - nilai2
            }
            else if (pilihan.equals(2)){
                hasil = nilai1 * nilai2
            }
            else if (pilihan.equals(3)){
                hasil = nilai1 / nilai2
            }

            gTvHasil.text = hasil.toString()
        }
        gSpin.setOnItemSelectedListener(

            object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                    Log.d("alex","pilih item:" + p2)
                    pilihan = p2
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            })
    }

}