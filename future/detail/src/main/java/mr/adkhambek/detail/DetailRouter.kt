package mr.adkhambek.detail

import com.github.terrakok.cicerone.Router


class DetailRouter @javax.inject.Inject constructor(
    private val router: Router
) : DetailContract.Router {

    override suspend fun finish() {
        router.exit()
    }
}