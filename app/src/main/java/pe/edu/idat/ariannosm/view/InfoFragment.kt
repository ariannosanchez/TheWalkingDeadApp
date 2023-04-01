package pe.edu.idat.ariannosm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.edu.idat.ariannosm.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {
    private lateinit var binding:FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater,container, false)
        return binding.root
    }

}