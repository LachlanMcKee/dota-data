pluginManagement {
  repositories {
    gradlePluginPortal()
  }

  resolutionStrategy {
    eachPlugin {
      if (requested.id.id == "shot") {
        useModule("com.karumi:shot:5.13.0")
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
  ":components:chip-layouts",
  ":components:list",
  ":components:row",
  ":features:common"
)
includeBuild("plugins")
