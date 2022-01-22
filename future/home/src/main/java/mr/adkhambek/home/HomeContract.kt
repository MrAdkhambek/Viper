package mr.adkhambek.home

internal interface HomeContract {

    interface ViewModel {
        fun onClickDetail()
        fun onBackPressed()
    }

    interface Router {
        suspend fun navigateToDetail()
        suspend fun finish()
    }
}