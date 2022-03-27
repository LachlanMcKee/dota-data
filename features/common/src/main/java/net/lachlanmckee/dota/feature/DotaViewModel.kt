package net.lachlanmckee.dota.feature

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import net.lachlanmckee.dota.feature.model.Navigation

interface DotaViewModel<STATE, EVENT> {
  val state: StateFlow<STATE>
  val eventConsumer: (EVENT) -> Unit
  val navigation: Flow<Navigation>
}
