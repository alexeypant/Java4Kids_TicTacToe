package mygame;

import javafx.animation.FadeTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;


public class Controller {
    private boolean isFirstPlayer = true;

    @FXML Button b1;
    @FXML Button b2;
    @FXML Button b3;
    @FXML Button b4;
    @FXML Button b5;
    @FXML Button b6;
    @FXML Button b7;
    @FXML Button b8;
    @FXML Button b9;

    @FXML GridPane gameBoard;


    public void buttonClickHandler(ActionEvent evt){

        Button clickedButton = (Button) evt.getTarget();
        String buttonLabel = clickedButton.getText();

        if ("".equals(buttonLabel)) clickedButton.setText("X");
        goComputer();

//        if("".equals(buttonLabel) && isFirstPlayer){
//            clickedButton.setText("X");
//            isFirstPlayer = false;
//        } else if ("".equals(buttonLabel) && !isFirstPlayer){
//            clickedButton.setText("O");
//            goComputer();
//            isFirstPlayer = true;
//        }

        find3InARow();
    }

    public void goComputer(){
        //Checking winning position in a ROW1
        if ("".equals(b1.getText()) && "O".equals(b2.getText()) && "O".equals(b3.getText())){
            b1.setText("O");
            return;
        }
        if ("".equals(b2.getText()) && "O".equals(b1.getText()) && "O".equals(b3.getText())){
            b2.setText("O");
            return;
        }
        if ("".equals(b3.getText()) && "O".equals(b1.getText()) && "O".equals(b2.getText())){
            b3.setText("O");
            return;
        }

        //Checking winning position in a ROW2
        if ("".equals(b4.getText()) && "O".equals(b5.getText()) && "O".equals(b6.getText())){
            b4.setText("O");
            return;
        }
        if ("".equals(b5.getText()) && "O".equals(b4.getText()) && "O".equals(b6.getText())){
            b5.setText("O");
            return;
        }
        if ("".equals(b6.getText()) && "O".equals(b4.getText()) && "O".equals(b5.getText())){
            b6.setText("O");
            return;
        }
        //Checking winning position in a ROW3
        if ("".equals(b7.getText()) && "O".equals(b8.getText()) && "O".equals(b9.getText())){
            b7.setText("O");
            return;
        }
        if ("".equals(b8.getText()) && "O".equals(b7.getText()) && "O".equals(b9.getText())){
            b8.setText("O");
            return;
        }
        if ("".equals(b9.getText()) && "O".equals(b7.getText()) && "O".equals(b8.getText())){
            b9.setText("O");
            return;
        }
        //Checking winning position in a Column 1
        if ("".equals(b1.getText()) && "O".equals(b4.getText()) && "O".equals(b7.getText())){
            b1.setText("O");
            return;
        }
        if ("".equals(b4.getText()) && "O".equals(b1.getText()) && "O".equals(b7.getText())){
            b4.setText("O");
            return;
        }
        if ("".equals(b7.getText()) && "O".equals(b1.getText()) && "O".equals(b4.getText())){
            b7.setText("O");
            return;
        }
        //Checking winning position in a Column 2
        if ("".equals(b2.getText()) && "O".equals(b5.getText()) && "O".equals(b8.getText())){
            b2.setText("O");
            return;
        }
        if ("".equals(b5.getText()) && "O".equals(b2.getText()) && "O".equals(b8.getText())){
            b5.setText("O");
            return;
        }
        if ("".equals(b8.getText()) && "O".equals(b2.getText()) && "O".equals(b5.getText())){
            b8.setText("O");
            return;
        }
        //Checking winning position in a Column 3
        if ("".equals(b3.getText()) && "O".equals(b6.getText()) && "O".equals(b9.getText())){
            b3.setText("O");
            return;
        }
        if ("".equals(b6.getText()) && "O".equals(b3.getText()) && "O".equals(b9.getText())){
            b6.setText("O");
            return;
        }
        if ("".equals(b9.getText()) && "O".equals(b3.getText()) && "O".equals(b6.getText())){
            b9.setText("O");
            return;
        }
        //Checking winning position in a Diagonal 1
        if ("".equals(b1.getText()) && "O".equals(b5.getText()) && "O".equals(b9.getText())){
            b1.setText("O");
            return;
        }
        if ("".equals(b5.getText()) && "O".equals(b1.getText()) && "O".equals(b9.getText())){
            b5.setText("O");
            return;
        }
        if ("".equals(b9.getText()) && "O".equals(b1.getText()) && "O".equals(b5.getText())){
            b9.setText("O");
            return;
        }
        //Checking winning position in a Diagonal 2
        if ("".equals(b7.getText()) && "O".equals(b5.getText()) && "O".equals(b3.getText())){
            b7.setText("O");
            return;
        }
        if ("".equals(b5.getText()) && "O".equals(b7.getText()) && "O".equals(b3.getText())){
            b5.setText("O");
            return;
        }
        if ("".equals(b3.getText()) && "O".equals(b7.getText()) && "O".equals(b5.getText())){
            b3.setText("O");
            return;
        }



        // PUTTING THE "O" ON IN THE CENTER
        if ("".equals(b5.getText())) {
            b5.setText("O");
            return;
        }
        // PUTTING THE "O" ON THE FIRST BLANK BUTTON
        if ("".equals(b1.getText()))b1.setText("O");
        else if ("".equals(b2.getText()))b2.setText("O");
        else if ("".equals(b3.getText()))b3.setText("O");
        else if ("".equals(b4.getText()))b4.setText("O");
        else if ("".equals(b5.getText()))b5.setText("O");
        else if ("".equals(b6.getText()))b6.setText("O");
        else if ("".equals(b7.getText()))b7.setText("O");
        else if ("".equals(b8.getText()))b8.setText("O");
        else if ("".equals(b9.getText()))b9.setText("O");

    }

    private boolean find3InARow(){
        //Row 1
        if (""!=b1.getText() && b1.getText() == b2.getText()
                && b2.getText() == b3.getText()){
            highlightWinningCombo(b1, b2, b3);
            return true;
        }
        //Row 2
        if (""!=b4.getText() && b4.getText() == b5.getText()
                && b5.getText() == b6.getText()){
            highlightWinningCombo(b4, b5, b6);
            return true;
        }
        //Row 3
        if (""!=b7.getText() && b7.getText() == b8.getText()
                && b8.getText() == b9.getText()){
            highlightWinningCombo(b7, b8, b9);
            return true;
        }
        //Column 1
        if (""!=b1.getText() && b1.getText() == b4.getText()
                && b4.getText() == b7.getText()){
            highlightWinningCombo(b1, b4, b7);
            return true;
        }
        //Column 2
        if (""!=b2.getText() && b2.getText() == b5.getText()
                && b5.getText() == b8.getText()){
            highlightWinningCombo(b2, b5, b8);
            return true;
        }
        //Column 3
        if (""!=b3.getText() && b3.getText() == b6.getText()
                && b6.getText() == b9.getText()){
            highlightWinningCombo(b3, b6, b9);
            return true;
        }
        //Diagonal 1
        if (""!=b1.getText() && b1.getText() == b5.getText()
                && b5.getText() == b9.getText()){
            highlightWinningCombo(b1, b5, b9);
            return true;
        }
        //Diagonal 2
        if (""!=b3.getText() && b3.getText() == b5.getText()
                && b5.getText() == b7.getText()){
            highlightWinningCombo(b3, b5, b7);
            return true;
        }
        return false;
    }

    private void highlightWinningCombo(Button first, Button second, Button third){
        first.getStyleClass().add("winning-square");
        second.getStyleClass().add("winning-square");
        third.getStyleClass().add("winning-square");
        applyFadeTransition(first);
        applyFadeTransition(second);
        applyFadeTransition(third);
    }

    private void applyFadeTransition(Button winningButton){

        FadeTransition ft = new FadeTransition(Duration.millis(1000), winningButton);

        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(10);
        ft.setAutoReverse(true);
        ft.play();
    }

    public void menuClickHandler(ActionEvent evt){
        MenuItem clickedMenu = (MenuItem) evt.getTarget();
        String menuLabel = clickedMenu.getText();

        if("Play".equals(menuLabel)){
            ObservableList<Node> buttons = gameBoard.getChildren();
            buttons.forEach(btn -> {
                ((Button) btn).setText("");
                btn.getStyleClass().remove("winning-square");
            });

            isFirstPlayer = true;

        }
    }


}
