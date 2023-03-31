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
        setContentView(R.layout.activity_start)
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        binding.bnvNavigation.setOnItemSelectedListener { menuItem ->
            val fragment:Fragment = when (menuItem.itemId){
                R.id.nav_home ->{
                    HomeFragment()
                }
                else ->{HomeFragment()}
            }
            supportFragmentManager.beginTransaction().replace(R.id.fl_navigation, fragment).commit()
            return@setOnItemSelectedListener true
        }
        binding.bnvNavigation.selectedItemId = R.id.nav_home
    }
}