package aaa.bivizul.dollarexchangerate.domain.usecase

import aaa.bivizul.dollarexchangerate.domain.repository.DollarRepository

class GetDollarInfoListUseCase(private val dollarRepository: DollarRepository) {

    suspend operator fun invoke(date1: String, date2: String, id: String) =
        dollarRepository.getDollarInfoList(date1 = date1, date2 = date2, id = id)

}