package com.abilat01.clon.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abilat01.clon.R
import com.abilat01.clon.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {

    private lateinit var mBinding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       mBinding = FragmentChatsBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()

    }
}

