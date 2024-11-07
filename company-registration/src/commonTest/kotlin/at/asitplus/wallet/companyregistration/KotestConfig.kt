package at.asitplus.wallet.companyregistration

import io.kotest.core.config.AbstractProjectConfig

class KotestConfig : AbstractProjectConfig() {
    init {
        Initializer.initWithVCK()
    }
}