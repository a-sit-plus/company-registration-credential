package at.asitplus.wallet.companyregistration

import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.ContactData.EMAIL
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.ContactData.TELEPHONE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ContactData(
    /** The main email address of the company. */
    @SerialName(EMAIL)
    val email: String? = null,

    /** The main telephone number of the company. */
    @SerialName(TELEPHONE)
    val telephone: String? = null,
)