package mr.adkhambek.viper.ui.detail

import mr.adkhambek.viper.ui.NavigationDispatcher
import javax.inject.Inject

class DetailRouter @Inject constructor(
    private val router: NavigationDispatcher
) : DetailContract.Router {

    override suspend fun finish() {
        router.back()
    }
}