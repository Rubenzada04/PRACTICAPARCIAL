package dev.sebastian.parcialdamleon21100310.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.sebastian.parcialdamleon21100310.R
import dev.sebastian.parcialdamleon21100310.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View =  inflater.inflate(R.layout.fragment_slideshow, container, false)

        val rvPlayer: RecyclerView = view.findViewById(R.id.recyclerView)
        rvPlayer.layoutManager = LinearLayoutManager(requireContext())
        rvPlayer.adapter = HotelAdapter(getSongs())
        return view

    }

    private fun getSongs(): List<HotelModel>{
        val lstHotel: ArrayList<HotelModel> = ArrayList()

        lstHotel.add(
            HotelModel(1, R.drawable.imagen1, "Skyline Haven Hotel"
                , "4.5 de 5 (1955 opiniones)", "123 Horizon Ave", "98")
        )
        lstHotel.add(
            HotelModel(2, R.drawable.imagen2, "Oceanview Retreat"
                , "4.2 de 5 (741 opiniones)", "456 Soniside Blud", "90")
        )
        lstHotel.add(
            HotelModel(3, R.drawable.imagen3, "Golden Palm Resort"
                , "3.9 de 5 (2500 opiniones)", "789 Paradise Road", "88")
        )
        lstHotel.add(
            HotelModel(4, R.drawable.imagen4, "Royal Horizon Suites"
                , "3.5 de 5 (7844 opiniones)", "654 Royal Plaza", "60")
        )

        return lstHotel
    }
}