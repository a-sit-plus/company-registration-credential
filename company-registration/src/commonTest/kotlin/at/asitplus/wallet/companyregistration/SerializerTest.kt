package at.asitplus.wallet.companyregistration

import at.asitplus.wallet.lib.data.vckJsonSerializer
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.serialization.encodeToString
import kotlin.random.Random

class SerializerTest : FunSpec({

    test("serialize credential") {
        val credential = CompanyRegistration(
            companyName = randomString(),
            companyType = randomString(),
            companyStatus = randomString(),
            companyActivity = CompanyActivity(
                naceCode = randomString(),
                description = randomString(),
            ),
            registrationDate = randomDate(),
            companyEndDate = randomDate(),
            companyEuid = randomString(),
            vatNumber = randomString(),
            contactData = ContactData(
                email = randomString(),
                telephone = randomString(),
            ),
            registeredAddress = Address(
                poBox = randomString(),
                thoroughfare = randomString(),
                locatorDesignator = randomString(),
                postCode = randomString(),
                postName = randomString(),
                adminUnitLevel1 = randomString(),
                adminUnitLevel2 = randomString(),
            ),
            postalAddress = Address(
                poBox = randomString(),
                thoroughfare = randomString(),
                locatorDesignator = randomString(),
                postCode = randomString(),
                postName = randomString(),
                adminUnitLevel1 = randomString(),
                adminUnitLevel2 = randomString(),
            ),
            branch = Branch(
                name = randomString(),
                euid = randomString(),
                activity = CompanyActivity(
                    naceCode = randomString(),
                    description = randomString()
                ),
                registeredAddress = Address(
                    poBox = randomString(),
                    thoroughfare = randomString(),
                    locatorDesignator = randomString(),
                    postCode = randomString(),
                    postName = randomString(),
                    adminUnitLevel1 = randomString(),
                    adminUnitLevel2 = randomString(),
                ),
                postalAddress = Address(
                    poBox = randomString(),
                    thoroughfare = randomString(),
                    locatorDesignator = randomString(),
                    postCode = randomString(),
                    postName = randomString(),
                    adminUnitLevel1 = randomString(),
                    adminUnitLevel2 = randomString(),
                ),
            )
        )
        val serialized = vckJsonSerializer.encodeToString(credential)
            .also { println(it) }

        val parsed: CompanyRegistration = vckJsonSerializer.decodeFromString(serialized)

        parsed shouldBe credential
    }

})

private fun randomDate() = LocalDate.fromEpochDays(Random.nextInt(0, 1024))

private fun randomInstant() = Instant.fromEpochSeconds(Random.nextLong(0, 1024 * 1024 * 1024))


val charPool = ('A'..'Z') + ('a'..'z') + ('0'..'9')

fun randomString() = (1..16)
    .map { Random.nextInt(0, charPool.size).let { charPool[it] } }
    .joinToString("")
