package aaa.bivizul.dollarexchangerate.domain.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

//@Keep
@Root
data class DollarInfo(

    @field : Element(name = "Id") val id: String,
    @field : Element(name = "Date") val date: String,
    @field : Element(name = "Nominal") val nominal: Int,
    @field : Element(name = "Value") val value: Double,

    )
