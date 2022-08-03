plugins {
    id("java-platform")
}

group = "me.victorcardona.platform"

val kotlinVersion = "1.7.10"
val springBootVersion = "2.7.2"

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinVersion")
        api("org.jetbrains.kotlin.plugin.spring:org.jetbrains.kotlin.plugin.spring.gradle.plugin:$kotlinVersion")
        api("org.springframework.boot:org.springframework.boot.gradle.plugin:$springBootVersion")
    }
}