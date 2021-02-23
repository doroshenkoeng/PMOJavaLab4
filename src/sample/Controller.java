package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Window;

public class Controller {

    public void processExit() {
        Platform.exit();
    }
    public void onAboutClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Об авторе");
        alert.setHeaderText("Автор программы");
        alert.setContentText("Дорошенко Сергей Игоревич");
        alert.showAndWait();
    }

    public void onProcessButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Об авторе");
        alert.setHeaderText("Автор программы");
        alert.setContentText("Дорошенко Сергей Игоревич");
        alert.showAndWait();
    }

    @FXML
    private TextField minAllowanceTF;

    @FXML
    private TextField risingRateTF;

    @FXML
    private Button submitButton;

    @FXML
    private ComboBox subsidyDropdown;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        if (subsidyDropdown.getValue() != null) {
            System.out.println(subsidyDropdown.getValue());
        }

//        Window owner = submitButton.getScene().getWindow();
//        if(minAllowanceTF.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Please enter your name");
//            return;
//        }
//        if(risingRateTF.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Please enter your email id");
//            return;
//        }
//        if(passwordField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Please enter a password");
//            return;
//        }
//
//        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
//                "Welcome " + minAllowanceTF.getText());
    }

}
