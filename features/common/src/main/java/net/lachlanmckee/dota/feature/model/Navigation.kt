package net.lachlanmckee.dota.feature.model

sealed class Navigation {
  object Back : Navigation()
  object Home : Navigation()
}
