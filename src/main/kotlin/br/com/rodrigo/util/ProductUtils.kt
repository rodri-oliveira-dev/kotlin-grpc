package br.com.rodrigo.util

import br.com.rodrigo.domain.Product
import br.com.rodrigo.dto.ProductReq
import br.com.rodrigo.dto.ProductRes

fun Product.toProductRes(): ProductRes {
    return ProductRes(
        id = id,
        name = name,
        price = price,
        quantityInStock = quantityInStock
    )
}

fun ProductReq.toDomain(): Product =
    Product(id = null, name = name, price = price, quantityInStock = this.quantityInStock)