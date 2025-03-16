package com.company.tenderlist.view.projectmanager;

import com.company.tenderlist.entity.ProjectManager;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "projectManagers/:id", layout = MainView.class)
@ViewController(id = "ProjectManager.detail")
@ViewDescriptor(path = "project-manager-detail-view.xml")
@EditedEntityContainer("projectManagerDc")
public class ProjectManagerDetailView extends StandardDetailView<ProjectManager> {
}