package com.tuo.kodeindemo

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2019/1/22 11:05
 *     desc   :
 *     version: 1.0
 * </pre>
 */


class App : Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        bind<App>() with singleton { this@App }
        import(dataModule)
    }


    private val dataModule = Kodein.Module("data") {
        bind<Data>() with singleton { Data() }
    }


}