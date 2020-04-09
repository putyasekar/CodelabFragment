package com.diki.idn.codelabfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_segitiga.*

/**
 * A simple [Fragment] subclass.
 */
class SegitigaFragment : Fragment() {
    private lateinit var inputOne: String
    private lateinit var inputSecond: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segitiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calculate1.setOnClickListener {
            inputOne = inputsegitiga.text.toString().trim()
            inputSecond = input2.text.toString().trim()

            if (inputOne.isEmpty()) {
                fieldEmpty = true
                inputsegitiga.error = resources.getString(R.string.error_empty_field)
            }
            if (inputSecond.isEmpty()) {
                fieldEmpty = true
                input2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (inputOne.toDouble() * inputSecond.toDouble())
                tv_result_s.setText(result.toString())
            }

        }

    }
}
