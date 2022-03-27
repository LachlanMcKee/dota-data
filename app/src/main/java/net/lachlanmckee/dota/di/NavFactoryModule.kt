package net.lachlanmckee.dota.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.lachlanmckee.dota.NavigationDelegationNavFactoryImpl
import net.lachlanmckee.dota.feature.NavigationDelegationNavFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NavFactoryModule {
  @Singleton
  @Binds
  fun bindNavigationDelegationNavFactory(navFactory: NavigationDelegationNavFactoryImpl): NavigationDelegationNavFactory
}
