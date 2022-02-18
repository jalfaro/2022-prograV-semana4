package gt.edu.galileo.a2022progravsemana4.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import gt.edu.galileo.a2022progravsemana4.adapter.AnimalAdapter
import gt.edu.galileo.a2022progravsemana4.databinding.ActivityMainBinding
import gt.edu.galileo.a2022progravsemana4.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var model: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        model = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.listadoAnimales.layoutManager = LinearLayoutManager(this)
        model.animales.observe(this, {
            binding.listadoAnimales.adapter = AnimalAdapter(it)
        })
        model.getAnimales()
    }
}