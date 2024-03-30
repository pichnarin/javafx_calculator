package com.calculator.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnZero;

    @FXML
    private TextField display;
    @FXML
    private static double result;
    @FXML
    private static double first_data;
    @FXML
    private static double second_data;
    @FXML
    private static char operation_symbol = '+';
    @FXML
    private Button btnDot;
    @FXML
    private Button btnDelete;
    @FXML
    void onBtnClick(ActionEvent event) {
        try{
            //handle button number when user click
             if(event.getSource() == btnOne){
                 display.setText(display.getText() + "1");
             }else if(event.getSource() == btnTwo){
                display.setText(display.getText() + "2");
            }else if(event.getSource() == btnThree){
                display.setText(display.getText() + "3");
            }else if(event.getSource() == btnFour){
                display.setText(display.getText() + "4");
            }else if(event.getSource() == btnFive){
                display.setText(display.getText() + "5");
            }else if(event.getSource() == btnSix){
                display.setText(display.getText() + "6");
            }else if(event.getSource() == btnSeven){
                display.setText(display.getText() + "7");
            }else if(event.getSource() == btnEight){
                display.setText(display.getText() + "8");
            }else if(event.getSource() == btnNine){
                display.setText(display.getText() + "9");
            }else if(event.getSource() == btnZero){
                display.setText(display.getText() + "0");

                //handle decimal number for operations
             }else if(event.getSource() == btnDot){
                 display.setText(display.getText().concat("."));
             }

             //handle clear function
             else if(event.getSource() == btnClear){
                 display.clear();
             }

             //handle delete from right to left function
             else if (event.getSource() == btnDelete){
                 String currentText = display.getText();
                 if(!currentText.isEmpty()){
                     display.setText(currentText.substring(0, currentText.length() - 1));
                 }
             }

             //handle operation function
             else if (event.getSource() == btnPlus) {
                 operation_symbol = '+';
                 first_data = Double.parseDouble(display.getText());
                 display.setText("");
             } else if (event.getSource() == btnMinus) {
                 operation_symbol = '-';
                 first_data = Double.parseDouble(display.getText());
                 display.setText("");
             } else if (event.getSource() == btnMultiply) {
                 operation_symbol = '*';
                 first_data = Double.parseDouble(display.getText());
                 display.setText("");
             } else if (event.getSource() == btnDivide) {
                 operation_symbol = '/';
                 first_data = Double.parseDouble(display.getText());
                 display.setText("");
             }

             //when user click equal
             else if (event.getSource() == btnEqual) {
                 second_data = Double.parseDouble(display.getText());
                 switch (operation_symbol) {
                     case '+':
                         result = first_data + second_data;
                         break;
                     case '-':
                         result = first_data - second_data;
                         break;
                     case '*':
                         result = first_data * second_data;
                         break;
                     case '/':
                         if (second_data != 0) {
                             result = first_data / second_data;
                         } else {
                             display.setText("Cannot divide by zero");
                             return;
                         }
                         break;
                 }

                 //display the result
                 //set first_data equal the value of result for the next operation
                 display.setText(String.valueOf(result));
                 first_data = result;
             }
        }catch(Exception e){
            display.setText("error something idk");
        }
    }
}
