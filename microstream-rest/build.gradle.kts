plugins {
    id("io.micronaut.build.internal.module")
}

dependencies {
    annotationProcessor(libs.micronaut.validation)

    implementation(libs.managed.microstream.storage.restservice)
    implementation(libs.micronaut.validation)

    implementation(project(":microstream"))
    implementation(libs.micronaut.jackson.databind)

    testImplementation(libs.micronaut.http.server.netty)
    testImplementation(libs.micronaut.http.client)
}

micronautBuild {
    binaryCompatibility {
        enabled.set(false)
    }
}
