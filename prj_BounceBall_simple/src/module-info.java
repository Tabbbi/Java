module prj_BounceBall_simple {
	requires javafx.graphics;
	requires javafx.controls;

	opens prj_BounceBall_simple to javafx.graphics, javafx.fxml;
}