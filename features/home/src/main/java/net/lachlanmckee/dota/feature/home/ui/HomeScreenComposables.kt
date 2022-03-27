package net.lachlanmckee.dota.feature.home.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.lachlanmckee.dota.components.chip.layout.ChipFlowRowPlaceholder
import net.lachlanmckee.dota.feature.home.HomeViewModel

@Composable
internal fun HomeScreen(
  state: HomeViewModel.State,
  events: (HomeViewModel.Event) -> Unit
) {
  BackHandler {
    events(HomeViewModel.Event.Back)
  }

  Scaffold(
    topBar = {
      TopAppBar(
        title = { Text("Dota Data") }
      )
    },
    content = { innerPadding ->
      Box(modifier = Modifier.padding(innerPadding)) {
        HomeContent(
          state = state
        )
      }
    }
  )
}

@Composable
private fun HomeContent(
  state: HomeViewModel.State
) {
  when (state) {
    is HomeViewModel.State.Loading -> {
      LazyColumn {
        items(count = 3) {
          Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            ChipFlowRowPlaceholder(
              count = 3
            )
          }
          Divider()
        }
      }
    }
  }
}
