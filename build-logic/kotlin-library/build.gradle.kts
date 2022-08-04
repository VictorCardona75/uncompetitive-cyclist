plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.victorcardona.platform:plugins-platform"))

    implementation(project(":commons"))
}