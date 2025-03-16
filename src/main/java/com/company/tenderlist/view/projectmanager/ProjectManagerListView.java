package com.company.tenderlist.view.projectmanager;

import com.company.tenderlist.entity.ProjectManager;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "projectManagers", layout = MainView.class)
@ViewController(id = "ProjectManager.list")
@ViewDescriptor(path = "project-manager-list-view.xml")
@LookupComponent("projectManagersDataGrid")
@DialogMode(width = "64em")
public class ProjectManagerListView extends StandardListView<ProjectManager> {
}