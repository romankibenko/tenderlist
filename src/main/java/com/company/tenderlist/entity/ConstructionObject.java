package com.company.tenderlist.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "CONSTRUCTION_OBJECT")
@Entity
public class ConstructionObject {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;
    @Column(name = "NAME_OF_CONSTRUCTION_OBJECT", nullable = false)
    @NotNull
    private String nameOfConstructionObject;
    @Column(name = "ADDRESS", nullable = false)
    @NotNull
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameOfConstructionObject() {
        return nameOfConstructionObject;
    }

    public void setNameOfConstructionObject(String nameOfConstructionObject) {
        this.nameOfConstructionObject = nameOfConstructionObject;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"nameOfConstructionObject"})
    public String getInstanceName(MetadataTools metadataTools) {
        return metadataTools.format(nameOfConstructionObject);
    }
}