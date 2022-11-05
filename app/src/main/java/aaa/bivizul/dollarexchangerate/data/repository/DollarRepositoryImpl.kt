package aaa.bivizul.dollarexchangerate.data.repository

import aaa.bivizul.dollarexchangerate.data.network.DollarApiService
import aaa.bivizul.dollarexchangerate.domain.repository.DollarRepository
import javax.inject.Inject

class DollarRepositoryImpl @Inject constructor(val dollarApiService: DollarApiService) : DollarRepository {

    override fun getDollarInfo() {
        TODO("Not yet implemented")
    }

    override fun getDollarInfoList() = dollarApiService.getDollarInfoList()

    override fun loadData() {
        TODO("Not yet implemented")
    }
}