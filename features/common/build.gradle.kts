plugins {
  id("net.lachlanmckee.dota.library")
}

moduleSetup {
  configuration = ModuleConfiguration(composeEnabled = true)
}

dependencies {
  implementation(libs.bundles.kotlin)
  implementation(libs.bundles.composeCore)

  implementation(libs.bundles.room)
  kapt(libs.room.compiler)

  api(libs.compose.navigation)
  implementation(libs.compose.placeholder)
}
