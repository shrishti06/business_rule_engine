package br_engine.requests;

import br_engine.enums.EntityType;

public class PaymentRequest {

    private EntityType entityType;

    private String entityName;

    public PaymentRequest(EntityType entityType, String entityName) {
        this.entityType = entityType;
        this.entityName = entityName;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
}
