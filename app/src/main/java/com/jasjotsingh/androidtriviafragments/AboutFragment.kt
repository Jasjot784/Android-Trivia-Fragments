package com.jasjotsingh.androidtriviafragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.jasjotsingh.androidtriviafragments.databinding.FragmentAboutBinding
import com.jasjotsingh.androidtriviafragments.databinding.FragmentGameWonBinding

class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentAboutBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_about, container, false)
        binding.buttonPlay.setOnClickListener { view: View? ->
            if (view != null) {
                view.findNavController().navigate(R.id.action_aboutFragment_to_gameFragment)
            }
        }
        return binding.root
    }
}
