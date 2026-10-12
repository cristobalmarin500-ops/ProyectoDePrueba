module org.ejemplos.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.ejemplos.proyectojavafx to javafx.fxml;
    exports org.ejemplos.proyectojavafx;
}