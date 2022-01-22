package mr.adkhambek.home.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import DetailContract
import DetailRouter
import mr.adkhambek.viper.ui.main.HomeContract
import mr.adkhambek.viper.ui.main.HomeRouter


@[Module InstallIn(ActivityRetainedComponent::class)]
interface NavigationBindModule {

    @[Binds]
    fun bindHomeRouter(binder: HomeRouter): HomeContract.Router

    @[Binds]
    fun bindDetailRouter(binder: DetailRouter): DetailContract.Router
}