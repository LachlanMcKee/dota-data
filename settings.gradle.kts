pluginManagement {
  repositories {
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
    gradlePluginPortal()
  }

  resolutionStrategy {
    eachPlugin {
      if (requested.id.id == "app.cash.paparazzi") {
        useModule("app.cash.paparazzi:paparazzi-gradle-plugin:1.3.0-SNAPSHOT")
      }
    }
  }
}

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "DotaData"
include(
  ":app",
  ":utils:instrumentation-utils",
  ":utils:kotlin-utils",
  ":utils:flow-test-utils",
  ":features:common",
  ":features:home"
)
includeBuild("plugins")
