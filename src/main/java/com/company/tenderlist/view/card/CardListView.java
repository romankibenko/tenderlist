package com.company.tenderlist.view.card;

import com.company.tenderlist.entity.Card;
import com.company.tenderlist.view.main.MainView;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;



@Route(value = "cards", layout = MainView.class)
@ViewController(id = "Card.list")
@ViewDescriptor(path = "card-list-view.xml")
@LookupComponent("cardsDataGrid")
@DialogMode(width = "64em")
public class CardListView extends StandardListView<Card> {

}