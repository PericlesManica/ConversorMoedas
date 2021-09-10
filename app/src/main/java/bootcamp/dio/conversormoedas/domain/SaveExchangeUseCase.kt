package bootcamp.dio.conversormoedas.domain

import bootcamp.dio.conversormoedas.core.UseCase
import bootcamp.dio.conversormoedas.data.model.ExchangeResponseValue
import bootcamp.dio.conversormoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}