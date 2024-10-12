package dev.sebastian.parcialdamleon21100310.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.sebastian.parcialdamleon21100310.R
import dev.sebastian.parcialdamleon21100310.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_gallery, container, false)

        val empresas = arrayOf(
            "GlobeGuard Insurance",
            "SafeJourney Coverage",
            "TravelShield Protection",
            "VoyogaSecure",
            "WanderSure Travel Insurance"
        )

        val listView: ListView = view.findViewById(R.id.lvEmpresas)

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, empresas)
        listView.adapter = adapter

        return view
    }
}