package br.com.rodrigo.services.impl

import br.com.rodrigo.dto.ProductReq
import br.com.rodrigo.dto.ProductRes
import br.com.rodrigo.repository.ProductRepository
import br.com.rodrigo.services.ProductService
import br.com.rodrigo.util.toDomain
import br.com.rodrigo.util.toProductRes
import jakarta.inject.Singleton

@Singleton
class ProductSerciceImpl(private val productRepository: ProductRepository) : ProductService {
    override fun create(req: ProductReq): ProductRes = productRepository.save(req.toDomain()).toProductRes()
}