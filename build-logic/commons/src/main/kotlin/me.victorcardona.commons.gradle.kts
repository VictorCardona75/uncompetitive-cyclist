import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
    id("me.victorcardona.jacoco")
}

group = "me.victorcardona.uncompetitive-cyclist"

dependencies {
    implementation(platform("me.victorcardona.platform:product-platform"))
    testImplementation(platform("me.victorcardona.platform:test-platform"))

    // Kotest
    testImplementation("io.kotest:kotest-runner-junit5")
    testImplementation("io.kotest:kotest-framework-datatest")
    testImplementation("io.kotest:kotest-assertions-core")
    testImplementation("io.kotest:kotest-property")

    // Mockk
    testImplementation("io.mockk:mockk")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        allWarningsAsErrors = true
        apiVersion = "1.7"
        languageVersion = "1.7"
        javaParameters = true
        jvmTarget = "18"
        freeCompilerArgs + listOf("-Xuse-k2", "-Xjsr305=strict")

    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
