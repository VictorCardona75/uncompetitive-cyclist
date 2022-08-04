plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.victorcardona.platform:plugins-platform"))

    // Must include a dependency for third-party plugins applied by this plugin.
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
    implementation("org.jetbrains.dokka:org.jetbrains.dokka.gradle.plugin")
}