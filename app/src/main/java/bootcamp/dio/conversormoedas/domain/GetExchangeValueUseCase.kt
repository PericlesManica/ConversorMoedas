package bootcamp.dio.conversormoedas.domain

import bootcamp.dio.conversormoedas.core.UseCase
import bootcamp.dio.conversormoedas.data.model.ExchangeResponseValue
import bootcamp.dio.conversormoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }
}