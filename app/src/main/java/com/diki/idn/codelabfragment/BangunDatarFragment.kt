package com.diki.idn.codelabfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_bangun_datar.*

/**
 * A simple [Fragment] subclass.
 */
class BangunDatarFragment : Fragment() {
    private lateinit var inputOne: String
    private lateinit var inputSecond: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    companion object {
        fun newInstance(): BangunDatarFragment {
            val fragment = BangunDatarFragment()
            val arg = Bundle()
            fragment.arguments = arg
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bangun_datar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        jajargenjang.setOnClickListener {
            val fragment = JajarGenjangFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment).commit()
        }
        lingkaran.setOnClickListener {
            val fragment = LingkaranFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment).commit()
        }
        persegi.setOnClickListener {
            val fragment = PersegiFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment).commit()
        }
        persegipanjang.setOnClickListener {
            val fragment = PersegiPanjangFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment).commit()
        }
        trapesium.setOnClickListener {
            val fragment = TrapesiumFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment).commit()
        }
        segitiga.setOnClickListener {
            val fragment = SegitigaFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment).commit()
        }
    }
}