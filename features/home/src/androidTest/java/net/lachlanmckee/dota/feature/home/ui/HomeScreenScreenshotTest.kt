package net.lachlanmckee.dota.feature.home.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.test.junit4.createComposeRule
import com.karumi.shot.ScreenshotTest
import kotlinx.coroutines.flow.MutableStateFlow
import net.lachlanmckee.dota.feature.home.HomeViewModel
import org.junit.Rule
import org.junit.Test

class HomeScreenScreenshotTest : ScreenshotTest {

  @get:Rule
  val composeRule = createComposeRule()

  @Test
  fun verifyHomeScreenDesign() {
    val state: MutableStateFlow<HomeViewModel.State> = MutableStateFlow(HomeViewModel.State.Loading)

    composeRule.setContent {
      MaterialTheme {
        HomeScreen(state.collectAsState().value) {}
      }
    }

    compareScreenshot(composeRule, "Empty")
  }
}
