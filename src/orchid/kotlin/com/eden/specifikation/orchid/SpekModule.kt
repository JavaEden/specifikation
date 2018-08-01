package com.eden.specifikation.orchid

import com.eden.orchid.api.OrchidContext
import com.eden.orchid.api.registration.OrchidModule
import com.eden.orchid.api.resources.resourceSource.FileResourceSource
import com.google.inject.name.Named
import java.io.File
import javax.inject.Inject

class SpekModule : OrchidModule() {

    override fun configure() {
//        addToSet(
//                FileResourceSource::class.java,
//                DokkaResourceSource::class.java
//        )
    }

}

class DokkaResourceSource
@Inject
constructor(context: OrchidContext, @Named("resourcesDir") private val resourcesDir: String) : FileResourceSource(context, 100) {

    override fun getDirectory(): String {
        return File(resourcesDir).resolve("../../../build/docs/dokka").absolutePath
    }

}