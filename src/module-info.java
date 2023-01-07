module javaFx_JDBC_Nelio_Curso {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
}
