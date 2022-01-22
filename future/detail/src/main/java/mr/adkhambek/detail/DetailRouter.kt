package mr.adkhambek.detail

import mr.adkhambek.viper.navigation.NavigationDispatcher
import javax.inject.Inject


internal class DetailRouter @Inject constructor(
    private val router: NavigationDispatcher
) : DetailContract.Router {

    override suspend fun finish() {
        router.back()
    }
}