package mr.adkhambek.home

import com.github.terrakok.cicerone.Router
import mr.adkhambek.detail.DetailScreens
import javax.inject.Inject

class HomeRouter @Inject constructor(
    private val router: Router
) : HomeContract.Router {

    override suspend fun navigateToDetail() {
        router.navigateTo(DetailScreens.DetailScreens())
    }

    override suspend fun finish() {
        router.exit()
    }
}