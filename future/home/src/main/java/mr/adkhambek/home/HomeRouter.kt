package mr.adkhambek.home

import mr.adkhambek.viper.home.R
import mr.adkhambek.viper.navigation.NavigationDispatcher
import javax.inject.Inject

internal class HomeRouter @Inject constructor(
    private val router: NavigationDispatcher
) : HomeContract.Router {

    override suspend fun navigateToDetail() {
        router.emit(R.id.detailFragment)
    }

    override suspend fun finish() {
        router.finishActivity()
    }
}