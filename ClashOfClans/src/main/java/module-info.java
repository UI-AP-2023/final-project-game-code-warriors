module com.example.clashofclans {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.clashofclans to javafx.fxml;
    exports com.example.clashofclans;
}