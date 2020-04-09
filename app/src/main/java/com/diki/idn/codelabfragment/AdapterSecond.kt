package com.diki.idn.codelabfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterSecond(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val pages = listOf(
        BalokFragment(),
        LimasFragment(),
        KubusFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Balok"
            1 -> "Limas"
            else -> "Kubus"
        }
    }

}