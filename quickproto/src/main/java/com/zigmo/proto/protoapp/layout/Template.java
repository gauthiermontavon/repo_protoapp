package com.zigmo.proto.protoapp.layout;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;


public class Template extends WebPage {

	public static final String CONTENT_ID = "contentComponent";

	private Component headerPanel;
	private Component menuPanel;
	private Component footerPanel;
	
	public Template() {
		add(setHeaderPanel(new HeaderPanel("headerPanel")));
		add(setMenuPanel(new MenuPanel("menuPanel")));
		add(setFooterPanel(new FooterPanel("footerPanel")));
		add(new Label(CONTENT_ID, "Put your content here"));
	}

	public Component getHeaderPanel() {
		return headerPanel;
	}

	public Component setHeaderPanel(Component headerPanel) {
		this.headerPanel = headerPanel;
		return headerPanel;
	}

	public Component getMenuPanel() {
		return menuPanel;
	}

	public Component setMenuPanel(Component menuPanel) {
		this.menuPanel = menuPanel;
		return menuPanel;
	}

	public Component getFooterPanel() {
		return footerPanel;
	}

	public Component setFooterPanel(Component footerPanel) {
		this.footerPanel = footerPanel;
		return footerPanel;
	}

}
