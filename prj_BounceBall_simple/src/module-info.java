module prj_BounceBall_simple {
	requires javafx.graphics;
	requires javafx.controls;

	opens prjFX_BounceBall_simple to javafx.graphics, javafx.fxml;
}