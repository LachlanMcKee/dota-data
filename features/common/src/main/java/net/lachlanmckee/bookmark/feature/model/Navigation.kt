package net.lachlanmckee.bookmark.feature.model

sealed class Navigation {
  object Back : Navigation()
  object Home : Navigation()
}
