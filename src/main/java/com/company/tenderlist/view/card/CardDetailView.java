package com.company.tenderlist.view.card;

import com.company.tenderlist.entity.Card;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.data.Sequence;
import io.jmix.data.Sequences;
import io.jmix.flowui.component.SupportsTypedValue;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "cards/:id", layout = MainView.class)
@ViewController(id = "Card.detail")
@ViewDescriptor(path = "card-detail-view.xml")
@EditedEntityContainer("cardDc")
public class CardDetailView extends StandardDetailView<Card> {


    @Subscribe("notesOfProjectManagerField")
    public void onNotesOfProjectManagerFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixTextArea, ?> event) {
        event.getSource().setHelperText(event.getValue().toString().length()+"/"+500);
    }

    @Subscribe("notesOfManagerField")
    public void onNotesOfManagerFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixTextArea, ?> event) {
        event.getSource().setHelperText(event.getValue().toString().length()+"/"+500);
    }
}