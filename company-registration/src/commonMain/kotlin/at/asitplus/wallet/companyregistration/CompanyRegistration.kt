package at.asitplus.wallet.companyregistration

import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.BRANCH
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.REGISTRATION_DATE
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.COMPANY_STATUS
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.COMPANY_EUID
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.COMPANY_ACTIVITY
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.COMPANY_CONTACT_DATA
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.COMPANY_END_DATE
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.COMPANY_NAME
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.COMPANY_TYPE
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.POSTAL_ADDRESS
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.VAT_NUMBER
import at.asitplus.wallet.companyregistration.CompanyRegistrationDataElements.REGISTERED_ADDRESS
import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CompanyRegistration(

    /** This is the primary name of the company. */
    @SerialName(COMPANY_NAME)
    val companyName: String,

    /** Type of the company based on ISO 20275. */
    @SerialName(COMPANY_TYPE)
    val companyType: String,

    /** Company status as defined in BRIS. */
    @SerialName(COMPANY_STATUS)
    val companyStatus: String,

    /** The activity of the company, either described as one or more NACE-codes or as one of more descriptions of the activities. */
    @SerialName(COMPANY_ACTIVITY)
    val companyActivity: CompanyActivity,

    /** Date of registration of the company. */
    @SerialName(REGISTRATION_DATE)
    val registrationDate: LocalDate,

    /** The end date of the company. */
    @SerialName(COMPANY_END_DATE)
    val companyEndDate: LocalDate? = null,

    /** Identification of the company. */
    @SerialName(COMPANY_EUID)
    val companyEuid: String,

    /** The VAT (value added taxes) registration number of the company. */
    @SerialName(VAT_NUMBER)
    val vatNumber: String? = null,

    /** The contact information of the company (email address and / or telephone number) */
    @SerialName(COMPANY_CONTACT_DATA)
    val contactData: ContactData? = null,

    /** The physical address on which the company is registered. */
    @SerialName(REGISTERED_ADDRESS)
    val registeredAddress: Address,

    /** The physical correspondence address of the company. */
    @SerialName(POSTAL_ADDRESS)
    val postalAddress: Address? = null,

    /** The branch information. */
    @SerialName(BRANCH)
    val branch: Branch? = null,

    )

