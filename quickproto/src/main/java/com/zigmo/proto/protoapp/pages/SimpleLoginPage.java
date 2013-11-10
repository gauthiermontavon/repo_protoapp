package com.zigmo.proto.protoapp.pages;

import com.zigmo.proto.protoapp.layout.LoginPanel;
import com.zigmo.proto.protoapp.layout.Template;

public class SimpleLoginPage extends Template {

	public SimpleLoginPage() {
			super();		
			replace(new LoginPanel(CONTENT_ID));
			getMenuPanel().setVisible(false);
	}


}
