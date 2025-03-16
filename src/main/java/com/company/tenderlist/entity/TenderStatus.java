package com.company.tenderlist.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum TenderStatus implements EnumClass<String> {

    TENDER_PO_GRAFIKU("A"),
    TENDER_VNE_GRAFIKA("B"),
    BEZ_TENDERA("C");

    private final String id;

    TenderStatus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TenderStatus fromId(String id) {
        for (TenderStatus at : TenderStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}