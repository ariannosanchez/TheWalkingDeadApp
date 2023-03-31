package pe.edu.idat.ariannosm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import pe.edu.idat.ariannosm.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding:ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fl_navigation, HomeFragment()).commit()
        }
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        binding.bnvNavigation.setOnItemSelectedListener { menuItem ->
            val fragment: Fragment = when (menuItem.itemId){
                R.id.nav_home ->{
                    HomeFragment()
                }
                R.id.nav_list ->{
                    ListFragment()
                }
                else ->{HomeFragment()}
            }
            supportFragmentManager.beginTransaction().replace(R.id.fl_navigation, fragment).commit()
            return@setOnItemSelectedListener true
        }
    }
}