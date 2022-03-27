package net.lachlanmckee.dota.feature.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import net.lachlanmckee.dota.feature.StandardViewModel
import net.lachlanmckee.dota.feature.home.HomeViewModel.Event
import net.lachlanmckee.dota.feature.home.HomeViewModel.State
import javax.inject.Inject

@HiltViewModel
internal class HomeViewModelImpl @Inject constructor(
  private val savedStateHandle: SavedStateHandle
) : StandardViewModel<State, Event>(), HomeViewModel {

  override val initialState: State = State.Loading

  override fun createState(): Flow<State> = emptyFlow()

  override val eventConsumer: (Event) -> Unit = { event ->
    viewModelScope.launch {
      when (event) {
      }
    }
  }
}
