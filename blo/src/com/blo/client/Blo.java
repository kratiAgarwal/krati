package com.blo.client;


import com.blo.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Blo implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
			/*
		  Button b1=new Button("HOME"); Button b2=new Button("CONTACT US"); Button
		  b3=new Button("BLO LOGIN"); Button b4=new Button("BLO REGISTRATION"); Button
		  b5=new Button("SECTOR LOGIN"); Button b6=new Button("SECTOR REGISTRATION");
		  RootPanel.get("tt1").add(b1); RootPanel.get("tt1").add(b2);
		  RootPanel.get("tt1").add(b3); RootPanel.get("tt1").add(b4);
		  RootPanel.get("tt1").add(b5); RootPanel.get("tt1").add(b6);
		  b1.addClickHandler(new ClickHandler() {
		  
		  @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		  
		  
		  } }); b2.addClickHandler(new ClickHandler() {
		  
		  @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		  
		  
		  } }); b3.addClickHandler(new ClickHandler() {
		  
		  @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		  RootPanel.get("tt2").clear(); RootPanel.get("tt2").add(new Blog()); } });
		  b4.addClickHandler(new ClickHandler() {
		  
		  @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		  RootPanel.get("tt2").clear(); RootPanel.get("tt2").add(new BReg());
		  
		  } }); b5.addClickHandler(new ClickHandler() {
		  
		  @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		  RootPanel.get("tt2").clear(); RootPanel.get("tt2").add(new Slog());
		  
		  } }); b6.addClickHandler(new ClickHandler() {
		  
		  @Override public void onClick(ClickEvent event) { // TODO Auto-generated
		  RootPanel.get("tt2").clear(); RootPanel.get("tt2").add(new Sreg());
		  
		  } });
		  */
		 
		RootPanel.get("tt1").add(new home());		  
		 
		
	}
	
}
