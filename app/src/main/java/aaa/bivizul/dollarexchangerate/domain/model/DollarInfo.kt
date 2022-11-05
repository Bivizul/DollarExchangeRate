package aaa.bivizul.dollarexchangerate.domain.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class DollarInfo(

    @SerializedName("Id") val id: String,
    @SerializedName("Date") val date: String,
    @SerializedName("Nominal") val nominal: Int,
    @SerializedName("Value") val value: Double,

)
