package com.acedillo.example.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.acedillo.example.R
import com.acedillo.example.repository.UserRepository
import java.util.*

class PageViewModel(private val userRepository: UserRepository) : ViewModel() {

    companion object {
        fun getFactory(userRepository: UserRepository): ViewModelProvider.Factory {
            return object : ViewModelProvider.Factory {
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    return PageViewModel(userRepository) as T
                }
            }
        }
    }

    private val _index = MutableLiveData<Int>()
    private val _greeting = MutableLiveData<Int>()

    val text: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }

    val greeting : LiveData<Int>
    get() = _greeting

    fun setIndex(index: Int) {
        _index.value = index
    }

    fun setGreeting() {
        val c = Calendar.getInstance();
        val timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        when (timeOfDay) {
            in 0..11 -> {
                _greeting.postValue(R.string.morning)
            }
            in 12..15 -> {
                _greeting.postValue(R.string.afternoon)
            }
            in 16..23 -> {
                _greeting.postValue(R.string.evening)
            }

        }
    }
}

