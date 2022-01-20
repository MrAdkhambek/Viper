package mr.adkhambek.viper.ui.main

import mr.adkhambek.viper.ui.NavigationDispatcher
import javax.inject.Inject


class HomeRouter @Inject constructor(
    private val router: NavigationDispatcher
) : HomeContract.Router {

    override suspend fun navigateToDetail() {
        val direction = HomeFragmentDirections.toDetailFragment()
        router.emit(direction)
    }

    override suspend fun finish() {
        router.back()
    }
}