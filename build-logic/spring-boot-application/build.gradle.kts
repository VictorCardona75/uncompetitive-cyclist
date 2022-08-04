plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.victorcardona.platform:plugins-platform"))

    implementation(project(":commons"))

    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin")
    implementation("org.jetbrains.kotlin.plugin.spring:org.jetbrains.kotlin.plugin.spring.gradle.plugin")
}