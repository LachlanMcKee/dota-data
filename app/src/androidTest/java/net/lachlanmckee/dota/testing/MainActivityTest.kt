package net.lachlanmckee.dota.testing

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import net.lachlanmckee.dota.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain

@HiltAndroidTest
class MainActivityTest {
  private val composeRule = createAndroidComposeRule<MainActivity>()

  @get:Rule
  val chain: RuleChain = RuleChain
    .outerRule(HiltAndroidRule(this))
    .around(composeRule)

  @Test
  fun verifyHomeScreen() {
    with(composeRule) {
      // Home
      onNodeWithText("Dota Data").assertIsDisplayed()
    }
  }
}
