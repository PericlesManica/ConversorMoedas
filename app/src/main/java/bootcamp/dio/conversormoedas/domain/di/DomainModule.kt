package bootcamp.dio.conversormoedas.domain.di

import bootcamp.dio.conversormoedas.domain.GetExchangeValueUseCase
import bootcamp.dio.conversormoedas.domain.ListExchangeUseCase
import bootcamp.dio.conversormoedas.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}