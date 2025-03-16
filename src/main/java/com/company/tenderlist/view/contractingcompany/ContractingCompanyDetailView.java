package com.company.tenderlist.view.contractingcompany;

import com.company.tenderlist.entity.ContractingCompany;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "contractingCompanies/:id", layout = MainView.class)
@ViewController(id = "ContractingCompany.detail")
@ViewDescriptor(path = "contracting-company-detail-view.xml")
@EditedEntityContainer("contractingCompanyDc")
public class ContractingCompanyDetailView extends StandardDetailView<ContractingCompany> {
}