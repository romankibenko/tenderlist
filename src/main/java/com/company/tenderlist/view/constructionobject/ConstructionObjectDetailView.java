package com.company.tenderlist.view.constructionobject;

import com.company.tenderlist.entity.ConstructionObject;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "constructionObjects/:id", layout = MainView.class)
@ViewController(id = "ConstructionObject.detail")
@ViewDescriptor(path = "construction-object-detail-view.xml")
@EditedEntityContainer("constructionObjectDc")
public class ConstructionObjectDetailView extends StandardDetailView<ConstructionObject> {
}