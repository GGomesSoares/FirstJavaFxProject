package sample.loginscreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {

    public LogIn(){

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException{
        HelloApplication m = new HelloApplication();
        if(username.getText().toString().equals("GabrielGomes") && password.getText().equals("123456789")){
            wrongLogIn.setText("Sucess");

            m.changeScene("afterLogin.fxml");
    } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
    wrongLogIn.setText("Please enter your data.");
    }

    else {
        wrongLogIn.setText("Wrong username or password");
    }
    }

}
