package com.acedillo.example.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.acedillo.example.R
import com.acedillo.example.repository.RoomUserRepository

class HomeFragment : Fragment() {

    lateinit var greetingTextView: TextView
    lateinit var viewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
         viewModel =
            ViewModelProvider(requireActivity(), PageViewModel.getFactory(RoomUserRepository())).get(
                PageViewModel::class.java
            )

        viewModel.greeting.observe(this,
            //TODO add user dynamically
            Observer<Int> { greetingTextView.text = getString(it, "John") })
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        greetingTextView = view.findViewById(R.id.greeting)

        return view

    }

    override fun onStart() {
        super.onStart()
        viewModel.setGreeting()
    }

}