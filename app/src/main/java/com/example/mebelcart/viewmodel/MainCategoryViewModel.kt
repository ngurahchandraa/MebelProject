package com.example.mebelcart.viewmodel

import androidx.lifecycle.ViewModel
import com.bumptech.glide.load.engine.Resource
import com.example.mebelcart.data.Product
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class MainCategoryViewModel @Inject constructor(
    private val firestore: FirebaseFirestore
): ViewModel() {

    //private val _specialProducts = MutableStateFlow<Resource<List<Product>>>(Resource.Unspecified())
}