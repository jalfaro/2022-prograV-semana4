package gt.edu.galileo.a2022progravsemana4.adapter

import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import gt.edu.galileo.a2022progravsemana4.R
import gt.edu.galileo.a2022progravsemana4.model.Animal

class AnimalAdapter(private var arreglo: List<Animal>) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>(), clickBorrarAnimal
{
    class ViewHolder(view: View, click: clickBorrarAnimal) : RecyclerView.ViewHolder(view) {
        val nombreText: TextView
        val descripcionText : TextView
        val cantidadText : TextView
        val btnEliminar : Button
        var idAnimal : Int = 0

        init {

            nombreText = view.findViewById(R.id.txtNombre)
            descripcionText = view.findViewById(R.id.txtDescripcion)
            cantidadText = view.findViewById(R.id.txtCantidad)
            btnEliminar = view.findViewById(R.id.btnBorrar)
            btnEliminar.setOnClickListener{
                click.clickBorrar(idAnimal)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.animal_item, parent, false)
        return ViewHolder(view, this)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.descripcionText.text = arreglo.get(position).descripcion
        holder.nombreText.text = arreglo.get(position).nombre
        holder.cantidadText.text = "Cantidad : ${arreglo.get(position).cantidad}"
        holder.idAnimal = arreglo.get(position).id
    }

    override fun getItemCount() = arreglo.size

    fun eliminar(id: Int) {
        arreglo = arreglo.filter{it.id != id}
        notifyDataSetChanged()
    }

    override fun clickBorrar(id: Int) {
        eliminar(id);
    }

}