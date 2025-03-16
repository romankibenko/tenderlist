package com.company.tenderlist.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum TypeOfDocumentation implements EnumClass<String> {

    STADIYA_R("A"),
    STADIYA_P("B");

    private final String id;

    TypeOfDocumentation(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeOfDocumentation fromId(String id) {
        for (TypeOfDocumentation at : TypeOfDocumentation.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}