module prj_fx_Container {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens prjFX_Container to javafx.graphics, javafx.fxml;
}
