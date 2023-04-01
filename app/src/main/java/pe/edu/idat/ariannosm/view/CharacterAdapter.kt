package pe.edu.idat.ariannosm.view
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.ariannosm.databinding.CharacterItemBinding
import pe.edu.idat.ariannosm.model.Character

class CharacterAdapter(val characters: List<Character>): RecyclerView.Adapter<CharacterAdapter.VHAdapter>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHAdapter {
        val binding = CharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VHAdapter(binding)
    }

    override fun onBindViewHolder(holder: VHAdapter, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount(): Int = characters.size

    class VHAdapter(val binding: CharacterItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(character:Character) {
            binding.txtNombre.text = character.Name
            binding.txtGender.text = character.Gender
            binding.txtStatus.text = character.Status
            binding.txtEthnicity.text = character.Ethnicity
            Glide
                .with(binding.root)
                .load(character.Image)
                .centerCrop()
                .into(binding.ivcharacter)
        }
    }
}