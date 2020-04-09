package com.diki.idn.codelabfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bangunruang -> {
                    val fragment = BangunRuangFragment()
                    addFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bangundatar -> {
                    val fragment = BangunDatarFragment()
                    addFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fm_main, fragment, fragment::class.java.simpleName)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        val mainFragment = BangunDatarFragment.newInstance()
        addFragment(mainFragment)
    }
}