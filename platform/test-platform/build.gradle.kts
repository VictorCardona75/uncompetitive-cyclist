plugins {
    id("java-platform")
}

group = "me.victorcardona.platform"

// Allow the definition of dependencies liek the JUnit BOM
javaPlatform.allowDependencies()

val kotestVersion = "5.4.1"

dependencies {
    api(platform("io.kotest:kotest-bom:$kotestVersion"))

    constraints {
        api("io.mockk:mockk:1.12.5")
    }
}