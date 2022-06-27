module com.example.nemerecoupling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nemerecoupling to javafx.fxml;
    exports com.example.nemerecoupling;
}