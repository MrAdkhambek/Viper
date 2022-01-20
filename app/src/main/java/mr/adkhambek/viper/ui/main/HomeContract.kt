package mr.adkhambek.viper.ui.main

interface HomeContract {

    interface ViewModel {
        fun onClickDetail()
        fun onBackPressed()
    }

    interface Router {
        suspend fun navigateToDetail()
        suspend fun finish()
    }
}