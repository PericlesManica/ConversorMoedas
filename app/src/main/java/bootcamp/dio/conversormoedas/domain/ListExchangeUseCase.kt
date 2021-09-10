package bootcamp.dio.conversormoedas.domain

import bootcamp.dio.conversormoedas.core.UseCase
import bootcamp.dio.conversormoedas.data.model.ExchangeResponseValue
import bootcamp.dio.conversormoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}