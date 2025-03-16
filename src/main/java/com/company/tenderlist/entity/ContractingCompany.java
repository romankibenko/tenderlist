package com.company.tenderlist.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@JmixEntity
@Table(name = "CONTRACTING_COMPANY")
@Entity
public class ContractingCompany {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;
    @NotNull
    @Column(name = "NAME_OF_CONTRACTING_COMPANY")
    private String nameOfContractingCompany;
    @Length(min = 0, max = 10)
    @NotNull
    @Column(name = "INDIVIDUAL_NUMBER", nullable = false)
    private String individualNumber;

    public void setIndividualNumber(String individualNumber) {
        this.individualNumber = individualNumber;
    }

    public String getIndividualNumber() {
        return individualNumber;
    }

    public String getNameOfContractingCompany() {
        return nameOfContractingCompany;
    }

    public void setNameOfContractingCompany(String nameOfContractingCompany) {
        this.nameOfContractingCompany = nameOfContractingCompany;
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
    @DependsOnProperties({"nameOfContractingCompany", "individualNumber"})
    public String getInstanceName(MetadataTools metadataTools) {
        return String.format("%s %s",
                metadataTools.format(nameOfContractingCompany),
                metadataTools.format(individualNumber));
    }
}