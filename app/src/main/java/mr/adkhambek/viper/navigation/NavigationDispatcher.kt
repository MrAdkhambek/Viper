package mr.adkhambek.viper.navigation

import android.app.Activity
import android.content.Context
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NavigationDispatcher @Inject constructor() {

    private val navigationEmitter: MutableSharedFlow<NavigationCommand> = MutableSharedFlow()
    val navigationCommands: Flow<NavigationCommand> = navigationEmitter.asSharedFlow()

    suspend fun emit(navigationCommand: NavigationCommand) {
        navigationEmitter.emit(navigationCommand)
    }

    suspend fun emit(direction: NavDirections) = emit {
        navigate(direction)
    }

    suspend fun emit(@IdRes destinationId: Int) = emit {
        navigate(destinationId)
    }

    suspend fun back() = emit {
        popBackStack()
    }

    suspend fun back(@IdRes destinationId: Int, inclusive: Boolean) = emit {
        popBackStack(destinationId, inclusive)
    }

    suspend fun finishActivity() = emit {
        (it as? Activity?)?.finish()
    }
}

typealias NavigationCommand = NavController.(Context) -> Unit