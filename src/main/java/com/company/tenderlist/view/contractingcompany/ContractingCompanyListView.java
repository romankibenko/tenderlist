package com.company.tenderlist.view.contractingcompany;

import com.company.tenderlist.entity.ContractingCompany;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "contractingCompanies", layout = MainView.class)
@ViewController(id = "ContractingCompany.list")
@ViewDescriptor(path = "contracting-company-list-view.xml")
@LookupComponent("contractingCompaniesDataGrid")
@DialogMode(width = "64em")
public class ContractingCompanyListView extends StandardListView<ContractingCompany> {
}