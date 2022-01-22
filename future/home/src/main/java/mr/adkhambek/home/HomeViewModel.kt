package mr.adkhambek.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val router: HomeContract.Router
) : ViewModel(), HomeContract.ViewModel {

    override fun onClickDetail() {
        viewModelScope.launch {
            router.navigateToDetail()
        }
    }

    override fun onBackPressed() {
        viewModelScope.launch {
            router.finish()
        }
    }
}