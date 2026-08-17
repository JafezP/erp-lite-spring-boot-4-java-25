package com.jafez.erp_lite.persistence.mongo.repositories;

import com.jafez.erp_lite.persistence.mongo.documents.AuditLogDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditLogDocumentRepository extends MongoRepository<AuditLogDocument, ObjectId> {
}
