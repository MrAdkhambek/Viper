package mr.adkhambek.home.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import mr.adkhambek.home.HomeContract
import mr.adkhambek.home.HomeRouter


@[Module InstallIn(ActivityRetainedComponent::class)]
internal interface NavigationBindModule {

    @[Binds]
    fun bindHomeRouter(binder: HomeRouter): HomeContract.Router
}