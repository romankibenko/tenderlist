package com.company.tenderlist.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum TypeOfWork implements EnumClass<String> {

    OTDELKA("A"),
    NVK("B"),
    LIFTY("C"),
    FACADS_AND_ROOFS("D"),
    FLAT_DOORS("E"),
    STAINED_GLASS("F"),
    WINODWS("G"),
    BRICKLAYING("H"),
    OVVK("I"),
    TECHNIKAL_DOORS("J"),
    METALWORK("K"),
    CC_AND_EOM("L");

    private final String id;

    TypeOfWork(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeOfWork fromId(String id) {
        for (TypeOfWork at : TypeOfWork.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}