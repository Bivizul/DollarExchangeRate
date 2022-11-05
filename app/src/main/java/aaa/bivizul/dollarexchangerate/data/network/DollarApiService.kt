package aaa.bivizul.dollarexchangerate.data.network

import aaa.bivizul.dollarexchangerate.domain.model.DollarInfo
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DollarApiService {

    @GET("/scripts/XML_dynamic.asp")
    suspend fun getDollarInfoList(
        @Query(DATE_REQ_1) date1: String = "02/03/2001",
        @Query(DATE_REQ_2) date2: String = "14/03/2001",
        @Query(VAL_NM_RQ) id: String = "R01235",
    ): Response<DollarInfo>

    companion object {
        private const val DATE_REQ_1 = "date_req1"
        private const val DATE_REQ_2 = "date_req2"
        private const val VAL_NM_RQ = "VAL_NM_RQ"
    }
}