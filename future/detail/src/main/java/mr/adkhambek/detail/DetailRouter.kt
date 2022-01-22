package mr.adkhambek.detail

import com.github.terrakok.cicerone.Router

internal class DetailRouter @javax.inject.Inject constructor(
    private val router: Router
) : DetailContract.Router {

    override suspend fun finish() {
        router.exit()
    }
}