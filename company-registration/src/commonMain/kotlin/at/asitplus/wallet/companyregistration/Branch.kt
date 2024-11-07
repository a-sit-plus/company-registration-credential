package at.asitplus.wallet.companyregistration

import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.Branch.ACTIVITY
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.Branch.EUID
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.Branch.NAME
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.Branch.POSTAL_ADDRESS
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.Branch.REGISTERED_ADDRESS
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.ContactData.EMAIL
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.ContactData.TELEPHONE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Branch(
    /** This is the primary name of the branch of the company. */
    @SerialName(NAME)
    val name: String,

    /** Identification of the branch of the company. */
    @SerialName(EUID)
    val euid: String,

    /** The activity of the branch of the company. */
    @SerialName(ACTIVITY)
    val activity: CompanyActivity? = null,

    /** The physical address on which the company is registered. */
    @SerialName(REGISTERED_ADDRESS)
    val registeredAddress: Address,

    /** The physical correspondence address of the company. */
    @SerialName(POSTAL_ADDRESS)
    val postalAddress: Address? = null,
)