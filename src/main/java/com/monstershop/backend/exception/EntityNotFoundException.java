package com.monstershop.backend.exception;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String entityName, Long id) {
        super (entityName + " not found with id " + id);
    }
}
