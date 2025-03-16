package com.company.tenderlist.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum OfficePosition implements EnumClass<String> {

    DIRECTOR("A"),
    CHIEF_OF_DEPARTMENT("B"),
    PROJECT_MANAGER("C"),
    MANAGER("D");

    private final String id;

    OfficePosition(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static OfficePosition fromId(String id) {
        for (OfficePosition at : OfficePosition.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}