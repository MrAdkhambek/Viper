package mr.adkhambek.viper.navigation

import android.content.Context
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections


class NavigationDispatcher {

    suspend fun emit(navigationCommand: NavigationCommand) {
        throw RuntimeException("Stub")
    }

    suspend fun emit(direction: NavDirections) = emit {
        throw RuntimeException("Stub")
    }

    suspend fun emit(@IdRes destinationId: Int) = emit {
        throw RuntimeException("Stub")
    }

    suspend fun back() = emit {
        throw RuntimeException("Stub")
    }

    suspend fun back(@IdRes destinationId: Int, inclusive: Boolean) = emit {
        throw RuntimeException("Stub")
    }

    suspend fun finishActivity() = emit {
        throw RuntimeException("Stub")
    }
}

typealias NavigationCommand = NavController.(Context) -> Unit