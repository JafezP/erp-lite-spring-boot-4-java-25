package com.jafez.erp_lite.persistence.mongo.repositories;

import com.jafez.erp_lite.persistence.mongo.documents.ProductInCatalogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductInCatalogDocumentRepository extends MongoRepository<ProductInCatalogDocument, String> {
}
