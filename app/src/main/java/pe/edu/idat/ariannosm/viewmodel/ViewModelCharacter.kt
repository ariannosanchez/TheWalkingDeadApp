package pe.edu.idat.ariannosm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import pe.edu.idat.ariannosm.model.Character
import pe.edu.idat.ariannosm.retrofit.RetrofitBuilder

class ViewModelCharacter : ViewModel() {
    val characters : MutableLiveData<List<Character>> = MutableLiveData()

    fun getCharacters(){
        CoroutineScope(Dispatchers.IO).launch {
            val response = RetrofitBuilder.apiService.getCharacters()
            withContext(Dispatchers.Main){
                characters.postValue(response)
            }
        }
    }
}