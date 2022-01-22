package mr.adkhambek.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@HiltViewModel
class DetailViewModel @javax.inject.Inject constructor(
    private val router: DetailContract.Router
) : ViewModel(), DetailContract.ViewModel {

    override fun onBackPressed() {
        viewModelScope.launch {
            router.finish()
        }
    }
}