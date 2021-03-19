package application;

import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class Controller {
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtUsername;
	
	@FXML
	private PasswordField txtPassword;
	
	public void Login(ActionEvent event) {
		if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")) {
			lblStatus.setText("Successful Login!");
		}
		else {
			lblStatus.setText("Invalid Login!");
		}
	}
	
	}
	
	
	

