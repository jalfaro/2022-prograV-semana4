package gt.edu.galileo.a2022progravsemana4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import gt.edu.galileo.a2022progravsemana4.model.Animal

class MainViewModel: ViewModel() {
    private val _animales = MutableLiveData<List<Animal>>()
    val animales: LiveData<List<Animal>>
      get() = _animales

    fun getAnimales() {
        _animales.value = poblarDatos()
    }
    private fun poblarDatos(): List<Animal> {
        val arreglo = ArrayList<Animal>()
        arreglo.add(Animal(1,"Tigre", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 3000))
        arreglo.add(Animal(2,"Leon", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 500))
        arreglo.add(Animal(3,"Jaguar", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 1500))
        arreglo.add(Animal(4,"Elefante", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 300))
        arreglo.add(Animal(5,"Elefante", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 300))
        arreglo.add(Animal(7,"Elefante", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 300))
        arreglo.add(Animal(8,"Elefante", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 300))
        arreglo.add(Animal(9,"Elefante", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 300))
        arreglo.add(Animal(10,"Elefante", "Es un animal salvaje que existe en las praderas de Guatemala, esta en peligro de extincion blabla bal", 300))
        return arreglo
    }
}