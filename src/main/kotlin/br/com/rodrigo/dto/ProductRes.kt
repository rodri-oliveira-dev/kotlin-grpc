package br.com.rodrigo.dto

data class ProductRes(
    val id: Long?,
    val name: String,
    val price: Double,
    val quantityInStock: Int
)
