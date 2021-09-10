package bootcamp.dio.conversormoedas

import android.app.Application
import bootcamp.dio.conversormoedas.data.di.DataModules
import bootcamp.dio.conversormoedas.domain.di.DomainModule
import bootcamp.dio.conversormoedas.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}