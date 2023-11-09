package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        loadFragment(FPerson())
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId){
                R.id.calculate -> {
                    loadFragment(FCalculate())
                    true
                }
                R.id.health -> {
                    loadFragment(FBMI())
                    true
                }
                R.id.person -> {
                    loadFragment(FPerson())
                    true
                }
                R.id.games -> {
                    loadFragment(FGames())
                    true
                }
                R.id.star -> {
                    loadFragment(FStar())
                    true
                }

                else -> {
                    false
                }
            }
        }

    }
    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}