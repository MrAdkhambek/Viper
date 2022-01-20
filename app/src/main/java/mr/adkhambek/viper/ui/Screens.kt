@file:Suppress("FunctionName")

package mr.adkhambek.viper.ui

import com.github.terrakok.cicerone.androidx.FragmentScreen
import mr.adkhambek.viper.ui.detail.DetailFragment
import mr.adkhambek.viper.ui.main.HomeFragment

object Screens {

    fun Home(): FragmentScreen = FragmentScreen {
        HomeFragment()
    }

    fun Detail(): FragmentScreen = FragmentScreen {
        DetailFragment()
    }
}