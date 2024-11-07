package at.asitplus.wallet.companyregistration


object CompanyRegistrationDataElements {

    /** This is the primary name of the company. */
    const val COMPANY_NAME = "company_name"

    /** Type of the company based on ISO 20275. */
    const val COMPANY_TYPE = "company_type"

    /** Company status as defined in BRIS. */
    const val COMPANY_STATUS = "company_status"

    /** The activity of the company, either described as one or more NACE-codes or as one of more descriptions of the activities. */
    const val COMPANY_ACTIVITY = "company_activity"

    /** Date of registration of the company. */
    const val REGISTRATION_DATE = "registration_date"

    /** The end date of the company. */
    const val COMPANY_END_DATE = "company_end_date"

    /** Identification of the company. */
    const val COMPANY_EUID = "company_EUID"

    /** The VAT (value added taxes) registration number of the company. */
    const val VAT_NUMBER = "vat_number"

    /** The contact information of the company (email address and / or telephone number) */
    const val COMPANY_CONTACT_DATA = "company_contact_data"

    /** The physical address on which the company is registered. */
    const val REGISTERED_ADDRESS = "registered_address"

    /** The physical correspondence address of the company. */
    const val POSTAL_ADDRESS = "postal_address"

    /** The branch information. */
    const val BRANCH = "branch"

    object Address {
        /** A location designator for a postal delivery point at a post office, usually a number (ex: “9383”). */
        const val PO_BOX = "po_box"

        /** The name of a passage or way through from one location to another. A thoroughfare is usually a street. */
        const val THOROUGHFARE = "thoroughfare"

        /** Number or sequence of characters that uniquely identifies the locator within the relevant scope
         * (building number, apartment number, etc). For an address such as "Flat 3, 17 Bridge Street",
         * the locator is "flat 3, 17". */
        const val LOCATOR_DESIGNATOR = "locator_designator"

        /** Code created and maintained for postal purposes to identify a subdivision of addresses and postal
         *  delivery points (ex: “7500”). */
        const val POST_CODE = "post_code"

        /** Name created and maintained for postal purposes to identify a subdivision of addresses and postal delivery
         * points (ex: “Paris”). */
        const val POST_NAME = "post_name"

        /** Name of the uppermost level of the address. Almost always this is a country, which then must be the
         * Alpha-2 country code as specified in ISO 3166-1. */
        const val ADMIN_UNIT_L_1 = "admin_unit_L1"

        /** Name of a secondary level/region of the address. This is usually a county, state, region, province or
         * other such area that typically encompasses several localities */
        const val ADMIN_UNIT_L_2 = "admin_unit_L2"

        val ALL_ELEMENTS = listOf(
            PO_BOX,
            THOROUGHFARE,
            LOCATOR_DESIGNATOR,
            POST_CODE,
            POST_NAME,
            ADMIN_UNIT_L_1,
            ADMIN_UNIT_L_2,
        )
    }

    object CompanyActivity {
        /** The NACE code of the activities of the company. */
        const val NACE_CODE = "nace_code"

        /** The description of the activities of the company. */
        const val ACTIVITY_DESCRIPTION = "activity_description"

        val ALL_ELEMENTS = listOf(NACE_CODE, ACTIVITY_DESCRIPTION)
    }

    object ContactData {
        /** The main email address of the company. */
        const val EMAIL = "email"

        /** The main telephone number of the company. */
        const val TELEPHONE = "telephone"

        val ALL_ELEMENTS = listOf(EMAIL, TELEPHONE)
    }

    object Branch {
        /** This is the primary name of the branch of the company. */
        const val NAME = "branch_name"

        /** Identification of the branch of the company. */
        const val EUID = "branche_euid"

        /** The activity of the branch of the company. */
        const val ACTIVITY = "branch_activity"

        /** The physical address on which the company is registered. */
        const val REGISTERED_ADDRESS = "branch_registered_address"

        /** The physical correspondence address of the company. */
        const val POSTAL_ADDRESS = "branch_postal_address"

        val MANDATORY_ELEMENTS = listOf(
            NAME,
            EUID,
            REGISTERED_ADDRESS
        )

        val ALL_ELEMENTS = listOf(
            NAME,
            EUID,
            ACTIVITY,
            REGISTERED_ADDRESS,
            POSTAL_ADDRESS
        )
    }

    val MANDATORY_ELEMENTS = listOf(
        COMPANY_NAME,
        COMPANY_TYPE,
        COMPANY_STATUS,
        COMPANY_ACTIVITY,
        REGISTRATION_DATE,
        COMPANY_EUID,
        REGISTERED_ADDRESS,
    )

    val ALL_ELEMENTS = listOf(
        COMPANY_NAME,
        COMPANY_TYPE,
        COMPANY_STATUS,
        COMPANY_ACTIVITY,
        REGISTRATION_DATE,
        COMPANY_END_DATE,
        COMPANY_EUID,
        VAT_NUMBER,
        COMPANY_CONTACT_DATA,
        REGISTERED_ADDRESS,
        POSTAL_ADDRESS,
        BRANCH
    )

}
