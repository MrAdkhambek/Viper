package mr.adkhambek.detail

internal interface DetailContract {

    interface ViewModel {
        fun onBackPressed()
    }

    interface Router {
        suspend fun finish()
    }
}