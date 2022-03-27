package net.lachlanmckee.dota.feature.home.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import net.lachlanmckee.dota.feature.home.HomeViewModel

@Composable
internal fun HomeScreen(
  state: HomeViewModel.State,
  events: (HomeViewModel.Event) -> Unit
) {
  BackHandler {
    events(HomeViewModel.Event.Back)
  }

  HomeScreenContent(state, events)
}

@Composable
internal fun HomeScreenContent(
  state: HomeViewModel.State,
  events: (HomeViewModel.Event) -> Unit
) {
  Scaffold(
    topBar = {
      TopAppBar(
        title = { Text("Dota Data") }
      )
    },
    content = { innerPadding ->
      Box(modifier = Modifier.fillMaxSize().padding(innerPadding).background(Color.Gray)) {
        Text("Loading State")
      }
    }
  )
}
