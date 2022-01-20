package mr.adkhambek.viper.ui.detail

interface DetailContract {

    interface ViewModel {
        fun onBackPressed()
    }

    interface Router {
        suspend fun finish()
    }
}