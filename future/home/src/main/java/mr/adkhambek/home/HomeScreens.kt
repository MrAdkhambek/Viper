@file:Suppress("FunctionName")

package mr.adkhambek.home

import com.github.terrakok.cicerone.androidx.FragmentScreen

object HomeScreens {

    fun HomeScreen(): FragmentScreen = FragmentScreen {
        HomeFragment()
    }
}