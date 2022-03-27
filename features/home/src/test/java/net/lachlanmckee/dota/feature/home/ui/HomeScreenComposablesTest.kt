package net.lachlanmckee.dota.feature.home.ui

import androidx.compose.material.MaterialTheme
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import net.lachlanmckee.dota.feature.home.HomeViewModel
import org.junit.Rule
import org.junit.Test

class HomeScreenComposablesTest {
  @get:Rule
  val paparazzi = Paparazzi()

  @Test
  fun homeScreenLoading() {
    paparazzi.snapshot(name = "test", deviceConfig = DeviceConfig.PIXEL) {
      MaterialTheme {
        HomeScreenContent(HomeViewModel.State.Loading) {}
      }
    }
  }
}
