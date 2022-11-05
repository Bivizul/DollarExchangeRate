package aaa.bivizul.dollarexchangerate.data.repository

import aaa.bivizul.dollarexchangerate.data.network.DollarApiService
import aaa.bivizul.dollarexchangerate.domain.repository.DollarRepository
import javax.inject.Inject

class DollarRepositoryImpl @Inject constructor(val dollarApiService: DollarApiService) :
    DollarRepository {

    override suspend fun getDollarInfo() {
        TODO("Not yet implemented")
    }

    override suspend fun getDollarInfoList(date1: String, date2: String, id: String) =
        dollarApiService.getDollarInfoList(
            date1 = date1,
            date2 = date2,
            id = id
        )

    override suspend fun loadData() {
        TODO("Not yet implemented")
    }
}