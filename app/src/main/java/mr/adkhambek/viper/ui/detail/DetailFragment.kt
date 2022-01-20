package mr.adkhambek.viper.ui.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.viper.R
import mr.adkhambek.viper.databinding.DetailFragmentBinding


@AndroidEntryPoint
class DetailFragment : Fragment(R.layout.detail_fragment) {

    private val vm: DetailViewModel by viewModels()
    private val vb: DetailFragmentBinding by viewBinding(DetailFragmentBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vb.button.setOnClickListener {
            vm.onBackPressed()
        }
    }
}