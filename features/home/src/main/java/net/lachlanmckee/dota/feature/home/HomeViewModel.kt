package net.lachlanmckee.dota.feature.home

import androidx.compose.runtime.Immutable
import net.lachlanmckee.dota.feature.DotaViewModel

internal interface HomeViewModel : DotaViewModel<HomeViewModel.State, HomeViewModel.Event> {

  @Immutable
  sealed class State {

    @Immutable
    object Loading : State()
  }

  sealed class Event {
    object Back : Event()
  }
}
