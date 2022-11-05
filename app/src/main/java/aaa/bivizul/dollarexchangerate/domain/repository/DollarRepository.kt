package aaa.bivizul.dollarexchangerate.domain.repository

import aaa.bivizul.dollarexchangerate.domain.model.DollarInfo
import retrofit2.Response

interface DollarRepository {

    suspend fun getDollarInfo()

    suspend fun getDollarInfoList(
        date1: String,
        date2: String,
        id: String
    ): Response<List<DollarInfo>>

    suspend fun loadData()

}