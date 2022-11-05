package aaa.bivizul.dollarexchangerate.presentation.viewmodel

import aaa.bivizul.dollarexchangerate.domain.model.DollarInfo
import aaa.bivizul.dollarexchangerate.domain.repository.DollarRepository
import aaa.bivizul.dollarexchangerate.domain.usecase.GetDollarInfoListUseCase
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject


class DollarViewModel @Inject constructor(private val dollarRepository: DollarRepository) :
    ViewModel() {

    private val getDollarInfoListUseCase = GetDollarInfoListUseCase(dollarRepository)

    private val _dollarInfoList = MutableLiveData<List<DollarInfo>>()
    val dollarInfoList: LiveData<List<DollarInfo>> = _dollarInfoList

    fun getDollarInfoList(date1: String, date2: String, id: String) {
        viewModelScope.launch {
            val response = getDollarInfoListUseCase.invoke(
                date1 = date1,
                date2 = date2,
                id = id
            )
            if (response.isSuccessful){
                Log.e("qwer","response ${response.body()}")
            }
//            _dollarInfoList.postValue(response.body())
        }
    }

}