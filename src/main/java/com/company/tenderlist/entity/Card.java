package com.company.tenderlist.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "CARD", indexes = {
        @Index(name = "IDX_CARD_PROJECT_MANAGER_NAME", columnList = "PROJECT_MANAGER_NAME_ID"),
        @Index(name = "IDX_CARD_NAME_OF_CONTRACTING_COMPANY", columnList = "NAME_OF_CONTRACTING_COMPANY_ID")
})
@Entity
public class Card {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;
    @Column(name = "NUMBER_OF_CARD")
    private Integer numberOfCard;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TENDER_STATUS")
    private String tenderStatus;
    @JoinColumn(name = "CONSTRUCTION_OBJECT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ConstructionObject constructionObject;
    @JoinColumn(name = "PROJECT_MANAGER_NAME_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProjectManager projectManagerName;
    @Column(name = "DUE_DATE")
    private LocalDate dueDate;
    @Column(name = "PLANED_TENDER_DATE")
    private LocalDate planedTenderDate;
    @Column(name = "FACT_TENDER_DATE")
    private LocalDate factTenderDate;
    @Column(name = "CHANGE_TENDER_DATE")
    private LocalDate changeTenderDate;
    @Column(name = "PROJECT_DOCUMENTATION_TYPE")
    private String projectDocumentationType;
    @Column(name = "PLANED_DATE_OF_DOCUMENTATION_ISSUE")
    private LocalDate planedDateOfDocumentationIssue;
    @Column(name = "FACT_DATE_OF_DOCUMENTATION_ISSUE")
    private LocalDate factDateOfDocumentationIssue;
    @Column(name = "PLANED_DATE_OF_TECHNICAL_TASK_ISSUE")
    private LocalDate planedDateOfTechnicalTaskIssue;
    @Column(name = "FACT_DATE_OF_TECHNICAL_TASK_ISSUE")
    private LocalDate factDateOfTechnicalTaskIssue;
    @Column(name = "PLANED_DATE_OF_TECHNICAL_TASK_AGREE")
    private LocalDate planedDateOfTechnicalTaskAgree;
    @Column(name = "FACT_DATE_OF_TECHNICAL_TASK_AGREE")
    private LocalDate factDateOfTechnicalTaskAgree;
    @Column(name = "DATE_OF_SHEDULE_AGREE")
    private LocalDate dateOfSheduleAgree;
    @Column(name = "DATE_OF_CONTRACT_CONCLUSION")
    private LocalDate dateOfContractConclusion;
    @Column(name = "NUMBER_OF_CONTRACT", length = 20)
    private String numberOfContract;
    @JoinColumn(name = "NAME_OF_CONTRACTING_COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ContractingCompany nameOfContractingCompany;
    @Column(name = "NOTES_OF_PROJECT_MANAGER")
    @Lob
    private String notesOfProjectManager;
    @Column(name = "NOTES_OF_MANAGER")
    @Lob
    private String notesOfManager;

    public void setNumberOfCard(Integer numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public Integer getNumberOfCard() {
        return numberOfCard;
    }

    public String getNotesOfManager() {
        return notesOfManager;
    }

    public void setNotesOfManager(String notesOfManager) {
        this.notesOfManager = notesOfManager;
    }

    public String getNotesOfProjectManager() {
        return notesOfProjectManager;
    }

    public void setNotesOfProjectManager(String notesOfProjectManager) {
        this.notesOfProjectManager = notesOfProjectManager;
    }

    public ContractingCompany getNameOfContractingCompany() {
        return nameOfContractingCompany;
    }

    public void setNameOfContractingCompany(ContractingCompany nameOfContractingCompany) {
        this.nameOfContractingCompany = nameOfContractingCompany;
    }

    public ProjectManager getProjectManagerName() {
        return projectManagerName;
    }

    public void setProjectManagerName(ProjectManager projectManagerName) {
        this.projectManagerName = projectManagerName;
    }

    public void setConstructionObject(ConstructionObject constructionObject) {
        this.constructionObject = constructionObject;
    }

    public ConstructionObject getConstructionObject() {
        return constructionObject;
    }

    public String getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(String numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public LocalDate getDateOfContractConclusion() {
        return dateOfContractConclusion;
    }

    public void setDateOfContractConclusion(LocalDate dateOfContractConclusion) {
        this.dateOfContractConclusion = dateOfContractConclusion;
    }

    public LocalDate getDateOfSheduleAgree() {
        return dateOfSheduleAgree;
    }

    public void setDateOfSheduleAgree(LocalDate dateOfSheduleAgree) {
        this.dateOfSheduleAgree = dateOfSheduleAgree;
    }

    public LocalDate getFactDateOfTechnicalTaskAgree() {
        return factDateOfTechnicalTaskAgree;
    }

    public void setFactDateOfTechnicalTaskAgree(LocalDate factDateOfTechnicalTaskAgree) {
        this.factDateOfTechnicalTaskAgree = factDateOfTechnicalTaskAgree;
    }

    public LocalDate getPlanedDateOfTechnicalTaskAgree() {
        return planedDateOfTechnicalTaskAgree;
    }

    public void setPlanedDateOfTechnicalTaskAgree(LocalDate planedDateOfTechnicalTaskAgree) {
        this.planedDateOfTechnicalTaskAgree = planedDateOfTechnicalTaskAgree;
    }

    public LocalDate getFactDateOfTechnicalTaskIssue() {
        return factDateOfTechnicalTaskIssue;
    }

    public void setFactDateOfTechnicalTaskIssue(LocalDate factDateOfTechnicalTaskIssue) {
        this.factDateOfTechnicalTaskIssue = factDateOfTechnicalTaskIssue;
    }

    public LocalDate getPlanedDateOfTechnicalTaskIssue() {
        return planedDateOfTechnicalTaskIssue;
    }

    public void setPlanedDateOfTechnicalTaskIssue(LocalDate planedDateOfTechnicalTaskIssue) {
        this.planedDateOfTechnicalTaskIssue = planedDateOfTechnicalTaskIssue;
    }

    public LocalDate getFactDateOfDocumentationIssue() {
        return factDateOfDocumentationIssue;
    }

    public void setFactDateOfDocumentationIssue(LocalDate factDateOfDocumentationIssue) {
        this.factDateOfDocumentationIssue = factDateOfDocumentationIssue;
    }

    public LocalDate getPlanedDateOfDocumentationIssue() {
        return planedDateOfDocumentationIssue;
    }

    public void setPlanedDateOfDocumentationIssue(LocalDate planedDateOfDocumentationIssue) {
        this.planedDateOfDocumentationIssue = planedDateOfDocumentationIssue;
    }

    public TypeOfDocumentation getProjectDocumentationType() {
        return projectDocumentationType == null ? null : TypeOfDocumentation.fromId(projectDocumentationType);
    }

    public void setProjectDocumentationType(TypeOfDocumentation projectDocumentationType) {
        this.projectDocumentationType = projectDocumentationType == null ? null : projectDocumentationType.getId();
    }

    public LocalDate getChangeTenderDate() {
        return changeTenderDate;
    }

    public void setChangeTenderDate(LocalDate changeTenderDate) {
        this.changeTenderDate = changeTenderDate;
    }

    public LocalDate getFactTenderDate() {
        return factTenderDate;
    }

    public void setFactTenderDate(LocalDate factTenderDate) {
        this.factTenderDate = factTenderDate;
    }

    public LocalDate getPlanedTenderDate() {
        return planedTenderDate;
    }

    public void setPlanedTenderDate(LocalDate planedTenderDate) {
        this.planedTenderDate = planedTenderDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setName(TypeOfWork name) {
        this.name = name == null ? null : name.getId();
    }

    public TypeOfWork getName() {
        return name == null ? null : TypeOfWork.fromId(name);
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
    @DependsOnProperties({"name"})
    public String getInstanceName(MetadataTools metadataTools) {
        return metadataTools.format(getName());
    }
}