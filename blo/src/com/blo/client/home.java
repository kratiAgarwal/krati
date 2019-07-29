package com.blo.client;

import com.google.gwt.core.client.GWT;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.ui.MaterialCollapsible;
import gwt.material.design.client.ui.MaterialCollapsibleItem;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialLink;

public class home extends Composite {

	private static homeUiBinder uiBinder = GWT.create(homeUiBinder.class);

	interface homeUiBinder extends UiBinder<Widget, home> {
	}

	public home() {
		initWidget(uiBinder.createAndBindUi(this));
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
			//	RootPanel.get("tt2").clear();
			//	RootPanel.get("tt2").add(new Blog());
				MaterialDialog md=new MaterialDialog();
				md.setBackgroundColor(Color.BLUE_ACCENT_4);
				md.setTextAlign(TextAlign.CENTER);
				md.add(new Blog());
				RootPanel.get().add(md);
				md.open();
				
				
			}
		});
b2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("tt2").clear();
				RootPanel.get("tt2").add(new Slog());
				
			}
		});
b3.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("tt2").clear();
		RootPanel.get("tt2").add(new BReg());
		
	}
});

b4.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("tt2").clear();
		RootPanel.get("tt2").add(new Sreg());
		
		
	}
});

b5.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("tt2").clear();
	
		
		
	}
	
	
});
b6.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("tt2").clear();
		RootPanel.get("tt2").add(new Slog());
		
	}
});

b7.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("tt2").clear();
		RootPanel.get("tt2").add(new Vreg());
		
	}
});
	}
	@UiField
	MaterialLink b1;
	
	@UiField
	MaterialLink b2;
	
	@UiField
	MaterialLink b3;

	@UiField
	MaterialLink b4;
	@UiField
	MaterialLink b5
	;
	@UiField
	MaterialLink b6;
	@UiField
	MaterialLink b7;
}



