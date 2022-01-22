package mr.adkhambek.viper.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import mr.adkhambek.viper.R


@AndroidEntryPoint
class AppActivity : AppCompatActivity(R.layout.app_activity) {

    private val viewModel: AppActivityVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.nav_host
        ) as NavHostFragment

        val navController = navHostFragment.navController

        viewModel
            .navigationCommands
            .onEach { command ->
                command(navController, this)
            }.launchIn(lifecycleScope)
    }
}