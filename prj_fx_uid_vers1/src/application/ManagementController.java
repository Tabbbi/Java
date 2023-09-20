package application;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ManagementController {
	@FXML private TextField containingTextfield;
	@FXML private TextArea listField;
	
	ArrayList<String> names = new ArrayList<String>();
	
	public void addName() {
		listField.clear();
		if (containingTextfield.getText() != "") {
			listField.setText(containingTextfield.getText());
			names.add(containingTextfield.getText());	
		} else {
			listField.setText("Error, no input.");
		}
		containingTextfield.clear();
	}
	public void showList() {
		listField.clear();
		for (int i = 0; i < names.size(); i++) {
			    listField.setText(listField.getText() + names.get(i) + "\n");
		}
	}
}