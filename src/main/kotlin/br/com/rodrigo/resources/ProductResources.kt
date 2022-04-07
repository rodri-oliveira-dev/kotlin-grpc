package br.com.rodrigo.resources


import br.com.rodrigo.ProductServiceReply
import br.com.rodrigo.ProductServiceRequest
import br.com.rodrigo.ProductsServiceGrpc
import io.grpc.stub.StreamObserver
import io.micronaut.grpc.annotation.GrpcService

@GrpcService
class ProductResources : ProductsServiceGrpc.ProductsServiceImplBase() {
    override fun create(request: ProductServiceRequest?, responseObserver: StreamObserver<ProductServiceReply>?) {
        super.create(request, responseObserver)
    }
}