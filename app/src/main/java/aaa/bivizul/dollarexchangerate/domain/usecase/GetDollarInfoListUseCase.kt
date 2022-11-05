package aaa.bivizul.dollarexchangerate.domain.usecase

import aaa.bivizul.dollarexchangerate.domain.repository.DollarRepository

class GetDollarInfoListUseCase(private val dollarRepository: DollarRepository) {

    operator fun invoke() = dollarRepository.getDollarInfoList()

}