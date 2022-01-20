package mr.adkhambek.viper.ui.main

import com.github.terrakok.cicerone.Router
import mr.adkhambek.viper.ui.Screens
import javax.inject.Inject


class HomeRouter @Inject constructor(
    private val router: Router
) : HomeContract.Router {

    override suspend fun navigateToDetail() {
        router.navigateTo(Screens.Detail())
    }

    override suspend fun finish() {
        router.exit()
    }
}