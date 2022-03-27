package net.lachlanmckee.dota.feature.home

import androidx.lifecycle.SavedStateHandle
import io.mockk.every
import io.mockk.mockk
import net.lachlanmckee.dota.test.util.flow.suspendTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.time.ExperimentalTime

@ExperimentalTime
class HomeViewModelImplTest {
  private val savedStateHandle = mockk<SavedStateHandle>(relaxed = true) {
    every { get<String>("folderId") } returns null
  }

  private val homeViewModel = HomeViewModelImpl(
    savedStateHandle
  )

  @Test
  fun whenStateObserved_thenExpectEmptyState() =
    suspendTest(startDispatcher = false) {
      assertEquals(HomeViewModel.State.Loading, homeViewModel.state.value)
    }
}
