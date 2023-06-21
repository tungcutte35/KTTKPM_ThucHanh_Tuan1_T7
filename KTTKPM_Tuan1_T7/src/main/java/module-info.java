module com.example.kttkpm_tuan1_t7 {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.kttkpm_tuan1_t7 to javafx.fxml;
    exports com.example.kttkpm_tuan1_t7;
}