package mr.adkhambek.viper.ui.detail

import com.github.terrakok.cicerone.Router
import javax.inject.Inject

class DetailRouter @Inject constructor(
    private val router: Router
) : DetailContract.Router {

    override suspend fun finish() {
        router.exit()
    }
}