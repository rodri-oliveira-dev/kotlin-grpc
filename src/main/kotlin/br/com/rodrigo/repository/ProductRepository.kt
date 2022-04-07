package br.com.rodrigo.repository

import br.com.rodrigo.domain.Product
import io.micronaut.data.jpa.repository.JpaRepository
import jakarta.inject.Singleton

@Singleton
interface ProductRepository : JpaRepository<Product, Long>