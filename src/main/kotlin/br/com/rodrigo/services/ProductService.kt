package br.com.rodrigo.services

import br.com.rodrigo.dto.ProductReq
import br.com.rodrigo.dto.ProductRes

interface ProductService {
    fun create(req: ProductReq): ProductRes
}