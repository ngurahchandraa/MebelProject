package com.example.mebelcart.data.order

import com.example.mebelcart.data.Address
import com.example.mebelcart.data.CartProduct

data class Order (
    val orderStatus: String,
    val totalPrice: Float,
    val products: List<CartProduct>,
    val address: Address

        )
