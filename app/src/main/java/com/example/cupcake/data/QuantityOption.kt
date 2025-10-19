package com.example.cupcake.data

import androidx.annotation.StringRes

data class QuantityOption(
    @StringRes val labelResId: Int,
    val quantity: Int
)
