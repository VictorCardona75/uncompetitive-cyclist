plugins {
    id("java-platform")
}

group = "me.victorcardona.platform"

// Allow the inclusion of dependencies to other platforms like the Spring BOM.
javaPlatform.allowDependencies()

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:2.7.2"))
}