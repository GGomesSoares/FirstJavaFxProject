module sample.loginscreen {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens sample.loginscreen to javafx.fxml;
    exports sample.loginscreen;
}