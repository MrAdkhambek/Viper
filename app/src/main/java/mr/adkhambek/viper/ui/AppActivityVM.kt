package mr.adkhambek.viper.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import mr.adkhambek.viper.navigation.NavigationCommand
import mr.adkhambek.viper.navigation.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class AppActivityVM @Inject constructor(
    private val navigationDispatcher: NavigationDispatcher
) : ViewModel() {

    val navigationCommands: Flow<NavigationCommand>
        get() = navigationDispatcher.navigationCommands
}