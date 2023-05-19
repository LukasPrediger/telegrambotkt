rootProject.name = "telegrambotkt"
include("meta")

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    versionCatalogs {
        create("libs") {
            library("kotlin-serialization", "org.jetbrains.kotlinx:kotlinx-serialization-core:1.5.1")
        }
    }
}