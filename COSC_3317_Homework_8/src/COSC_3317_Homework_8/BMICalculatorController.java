package COSC_3317_Homework_8;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class BMICalculatorController {

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField BMITextField;

    @FXML
    private RadioButton englishRadioButton;

    @FXML
    private RadioButton metricRadioButton;

    @FXML
    private void addButtonPressed(ActionEvent event) {
        try {
            double weight = Double.parseDouble(weightTextField.getText());
            double height = Double.parseDouble(heightTextField.getText());
            if (englishRadioButton.isSelected()) {
                double BMIResult = (weight * 703) / (height * height);
                BMITextField.setText(String.valueOf(BMIResult));
            } else if (metricRadioButton.isSelected()) {
                double BMIResult = weight / (height * height);
                BMITextField.setText(String.valueOf(BMIResult));
            }
        }
        catch (NumberFormatException ex) {
            weightTextField.setText("Enter Weight");
            heightTextField.setText("Enter Height");
            weightTextField.selectAll();
            weightTextField.requestFocus();
        }
    }

    public void initialize() {
        weightTextField.textProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> ov, String oldValue, String newValue) {
                        BMITextField.setText("");
                    }
                }
        );

        heightTextField.textProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> ov, String oldValue, String newValue) {
                        BMITextField.setText("");
                    }
                }
        );
    }
}
