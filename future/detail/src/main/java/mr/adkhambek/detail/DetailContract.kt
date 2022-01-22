package mr.adkhambek.detail

interface DetailContract {

    interface ViewModel {
        fun onBackPressed()
    }

    interface Router {
        suspend fun finish()
    }
}