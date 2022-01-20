package mr.adkhambek.viper.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.viper.R
import mr.adkhambek.viper.databinding.MainFragmentBinding

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.main_fragment) {

    private val vm: HomeViewModel by viewModels()
    private val vb: MainFragmentBinding by viewBinding(MainFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vb.message.setOnClickListener {
            vm.onClickDetail()
        }

        vb.finish.setOnClickListener {
            vm.onBackPressed()
        }
    }
}