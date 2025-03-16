package com.company.tenderlist.view.constructionobject;

import com.company.tenderlist.entity.ConstructionObject;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "constructionObjects", layout = MainView.class)
@ViewController(id = "ConstructionObject.list")
@ViewDescriptor(path = "construction-object-list-view.xml")
@LookupComponent("constructionObjectsDataGrid")
@DialogMode(width = "64em")
public class ConstructionObjectListView extends StandardListView<ConstructionObject> {
}