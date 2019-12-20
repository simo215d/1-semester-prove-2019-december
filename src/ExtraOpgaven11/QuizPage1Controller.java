package ExtraOpgaven11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;

import java.sql.SQLException;

public class QuizPage1Controller {
    @FXML Label labelTitle;
    @FXML Label labelQuestion;
    @FXML Label labelMessage;
    @FXML ImageView iv1;
    @FXML CheckBox checkbox1;
    @FXML CheckBox checkbox2;
    @FXML CheckBox checkbox3;
    @FXML CheckBox checkbox4;

    public void submit(ActionEvent actionEvent) throws SQLException {
        for (int i = 0; i < 4; i++) {
            switch (i){
                case 0: if (checkbox1.isSelected()){ System.out.println("you guessed 1: "+checkbox1.getText()); guess(0,checkbox1.getText());} break;
                case 1: if (checkbox2.isSelected()){ System.out.println("you guessed 2: "+checkbox2.getText()); guess(1,checkbox2.getText());} break;
                case 2: if (checkbox3.isSelected()){ System.out.println("you guessed 3: "+checkbox3.getText()); guess(2,checkbox3.getText());} break;
                case 3: if (checkbox4.isSelected()){ System.out.println("you guessed 4: "+checkbox4.getText()); guess(3,checkbox4.getText());} break;
            }
        }
    }
    private void guess(int index, String answer) throws SQLException {
        int result = Database.getDBFacade().guess(answer, index);
        if (result==-1){
            System.out.println("Wrong!");
            labelMessage.setText("WRONG!!!");
        } else {
            System.out.println(result+": Banana is the correct answer!");
            labelMessage.setText("Good Job Banana IS CORRECT\n YOU WON 1000000$");
        }
    }
}
