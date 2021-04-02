module mftm.dandrea.william {
    requires javafx.controls;
    requires javafx.fxml;

    opens mftm.dandrea.william to javafx.fxml;
    exports mftm.dandrea.william;
}