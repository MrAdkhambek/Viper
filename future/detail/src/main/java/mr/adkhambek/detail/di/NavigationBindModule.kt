package mr.adkhambek.detail.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import mr.adkhambek.detail.DetailContract
import mr.adkhambek.detail.DetailRouter


@[Module InstallIn(ActivityRetainedComponent::class)]
internal interface NavigationBindModule {

    @[Binds]
    fun bindDetailRouter(binder: DetailRouter): DetailContract.Router
}