plugins {
  id("net.lachlanmckee.dota.library")
}

moduleSetup {
  configuration = ModuleConfiguration()
}

dependencies {
  implementation(libs.kotlin.stdlib.jdk7)
}
