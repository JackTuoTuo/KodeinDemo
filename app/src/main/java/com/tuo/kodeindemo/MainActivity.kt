package com.tuo.kodeindemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity(), KodeinAware {

    private val appKodein by closestKodein()

    override val kodein: Kodein = Kodein.lazy {
        extend(appKodein)
    }

    val app: App by instance()

    val data: Data by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("onCreate", data.toString())

        Log.i("onCreate", app.toString())
    }


}
