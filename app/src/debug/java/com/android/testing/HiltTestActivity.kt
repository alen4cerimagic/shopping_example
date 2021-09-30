package com.android.testing

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class HiltTestActivity : AppCompatActivity() {

    private val TAG = HiltTestActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        Timber.tag(TAG).v("onCreate")
    }

    override fun onStart() {
        Timber.tag(TAG).v("onStart")
        super.onStart()
    }

    override fun onResume() {
        super.onResume()

        Timber.tag(TAG).v("onResume")
    }

    override fun onPause() {
        super.onPause()

        Timber.tag(TAG).v("onPause")
    }

    override fun onStop() {
        super.onStop()

        Timber.tag(TAG).v("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Timber.tag(TAG).v("onDestroy")
    }
}