dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

includeBuild("../platform")

rootProject.name = "build-logic"

include("commons")
include("kotlin-library")
include("spring-boot-application")