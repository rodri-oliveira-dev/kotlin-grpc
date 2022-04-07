package br.com.rodrigo.services.impl

import br.com.rodrigo.domain.Product
import br.com.rodrigo.dto.ProductReq
import br.com.rodrigo.repository.ProductRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

internal class ProductServiceImpTest {
    private val productRepository = Mockito.mock(ProductRepository::class.java)
    private val productService = ProductSerciceImpl(productRepository)

    @Test
    fun `when create method is call with valid data a ProductRes is returned`() {
        val productInput = Product(id = null, name = "productName", price = 10.00, quantityInStock = 5)
        val productOutput = Product(id = 1, name = "productName", price = 10.00, quantityInStock = 5)

        Mockito.`when`(productRepository.save(productInput))
            .thenReturn(productOutput)

        val productReq = ProductReq(name = "productName", price = 10.00, quantityInStock = 5)
        val productRes = productService.create(productReq)

        assertEquals(productRes.name, productReq.name)
    }
}