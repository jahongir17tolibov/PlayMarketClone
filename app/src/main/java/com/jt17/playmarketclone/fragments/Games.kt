package com.jt17.playmarketclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.jt17.playmarketclone.R
import com.jt17.playmarketclone.adapters.ParentAdapter
import com.jt17.playmarketclone.databinding.FragmentGamesBinding
import com.jt17.playmarketclone.models.ParentModel

class Games : Fragment() {
    private var _binding: FragmentGamesBinding? = null
    private val bind get() = _binding!!
    private var mylist =  mutableListOf<ParentModel>()
    private var childList =  mutableListOf<ParentModel.ChildModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGamesBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        childList.add(
            ParentModel.ChildModel(
                R.drawable.img1,
                "Uyin emckl",
                R.drawable.img1,
                "action"
            )
        )
        childList.add(
            ParentModel.ChildModel(
                R.drawable.img2,
                "lkneejwn pungg",
                R.drawable.img2,
                "action"
            )
        )
        childList.add(
            ParentModel.ChildModel(
                R.drawable.ic_launcher_background,
                "Game emckl",
                R.drawable.ic_launcher_background,
                "action"
            )
        )
        childList.add(
            ParentModel.ChildModel(
                R.drawable.malibu3,
                "Birnima emckl",
                R.drawable.malibu3,
                "action"
            )
        )
        childList.add(
            ParentModel.ChildModel(
                R.drawable.img1,
                "hahahah emckl",
                R.drawable.img1,
                "Adventure"
            )
        )
        mylist.add(ParentModel("Game1",childList.shuffled()))
        mylist.add(ParentModel("Game2",childList.shuffled()))
        mylist.add(ParentModel("Game3",childList.reversed()))
        mylist.add(ParentModel("Game4",childList))
        bind.recycGames.run {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ParentAdapter(mylist)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

}