package at.asitplus.wallet.companyregistration

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CompanyActivity(
    /** The NACE code of the activities of the company. */
    @SerialName(CompanyRegistrationDataElements.CompanyActivity.NACE_CODE)
    val naceCode: String? = null,

    /** The description of the activities of the company. */
    @SerialName(CompanyRegistrationDataElements.CompanyActivity.ACTIVITY_DESCRIPTION)
    val description: String? = null,
)