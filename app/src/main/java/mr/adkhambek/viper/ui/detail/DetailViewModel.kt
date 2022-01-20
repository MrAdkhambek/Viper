package mr.adkhambek.viper.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class DetailViewModel @Inject constructor(
    private val router: DetailContract.Router
) : ViewModel(), DetailContract.ViewModel {

    override fun onBackPressed() {
        viewModelScope.launch {
            router.finish()
        }
    }
}