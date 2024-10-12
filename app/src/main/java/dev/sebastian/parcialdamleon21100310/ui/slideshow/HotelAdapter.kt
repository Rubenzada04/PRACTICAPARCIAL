package dev.sebastian.parcialdamleon21100310.ui.slideshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.sebastian.parcialdamleon21100310.R

class HotelAdapter (private var lstHotel: List<HotelModel>) :
    RecyclerView.Adapter<HotelAdapter.ViewHolder>(){

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

            val ivHotel: ImageView = itemView.findViewById(R.id.ivHotel)
            val tvName: TextView = itemView.findViewById(R.id.tvName)
            val tvCalificacion: TextView = itemView.findViewById(R.id.tvCalificacion)
            val tvDireccion : TextView = itemView.findViewById(R.id.tvDireccion)
            val tvCosto : TextView = itemView.findViewById(R.id.tvCosto)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(
                R.layout.item_hotel
                , parent, false))
        }

        override fun getItemCount(): Int {
            return lstHotel.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val itemHotel = lstHotel[position]
            holder.ivHotel.setImageResource(itemHotel.image)
            holder.tvName.text = itemHotel.nombre
            holder.tvCalificacion.text = itemHotel.calificacion
            holder.tvDireccion.text = itemHotel.direccion
            holder.tvCosto.text = itemHotel.costo
        }
}