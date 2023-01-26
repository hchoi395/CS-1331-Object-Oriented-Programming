import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import java.util.Random;
/**
 * This class stores information of Jordle game and a JavaFX application of the game.
 * @author hchoi395
 * @version 11.0.2
 */
public class Jordle extends Application {
    String temp = randomWord();
    Label l1 = new Label("Try guessing a word!");
    /**
     * Main method that launches the JavaFX.
     * @param args args parameter.
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * tr method that handles the user input when a key is released.
     * @param t TextArea parameter that will have the text deleted.
     * @param a boolean parameter for how the application will occur.
     */
    public void tr(TextArea t, boolean a) {
        t.setOnKeyReleased((KeyEvent e) -> {
            if (a) {
                t.setText("");
            } else if (!a) {
                t.setText("" + e.getCode().toString().toLowerCase());
            }
        });
    }
    /**
     * ta method that handles the user input when a key is pressed.
     * @param t TextArea parameter for the current focus TextArea.
     * @param tBefore TextArea parameter for the before focused TextArea.
     * @param tAfter TextArea parameter for the after focused TextArea.
     * @param a boolean parameter for how the application will occur.
     */
    public void ta(TextArea t, TextArea tBefore, TextArea tAfter, boolean a) {
        t.setOnKeyPressed((KeyEvent e) -> {
            switch (e.getCode()) {
            case A:
                t.setText("a");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case B:
                t.setText("b");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case C:
                t.setText("c");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case D:
                t.setText("d");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case E:
                t.setText("e");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case F:
                t.setText("f");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case G:
                t.setText("g");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case H:
                t.setText("h");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case I:
                t.setText("i");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case J:
                t.setText("j");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case K:
                t.setText("k");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case L:
                t.setText("l");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case M:
                t.setText("m");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case N:
                t.setText("n");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case O:
                t.setText("o");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case P:
                t.setText("p");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case Q:
                t.setText("q");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case R:
                t.setText("r");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case S:
                t.setText("s");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case T:
                t.setText("t");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case U:
                t.setText("u");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case V:
                t.setText("v");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case W:
                t.setText("w");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case X:
                t.setText("x");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case Y:
                t.setText("y");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case Z:
                t.setText("z");
                tr(tAfter, a);
                tAfter.requestFocus();
                break;
            case BACK_SPACE:
                if (!a) {
                    t.setText("");
                }
                if (a) {
                    tBefore.setText("");
                }
                tBefore.requestFocus();
                break;
            default:
                t.setText("");
                tr(t, true);
                break;
            }
        });
    }
    /**
     * randomWord method that generates a random word.
     * @return returns String of the random word.
     */
    public static String randomWord() {
        final Random rand = new Random();
        final String randomString = Words.list.get(rand.nextInt(Words.list.size()));
        System.out.println("The word is " + randomString);
        return randomString;
    }
    /**
     * error method that occurs when a 5 letter word isn't submitted.
     */
    public void error() {
        VBox v = new VBox();
        String errorInfo = "INVALID ENTRY: Please enter a 5 letter word.";
        Text text = new Text(errorInfo);
        Font font = Font.font("Verdana", FontWeight.BOLD, 12);
        text.setFont(font);
        v.getChildren().add(text);
        Scene scene = new Scene(v, 500, 50);
        Stage stage = new Stage();
        stage.setTitle("ERROR");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * colorBoxes method that colors the boxes after submitting.
     * @param s String parameter that is entered.
     * @param r Rectangle array parameter that will be colored.
     */
    public void colorBoxes(String s, Rectangle[] r) {
        char[] rw = new char[temp.length()];
        char[] st = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rw[i] = temp.charAt(i);
            st[i] = s.charAt(i);
            if (rw[i] == st[i]) {
                r[i].setFill(Color.LIGHTGREEN);
            } else if (rw[i] != st[i] && temp.contains(st[i] + "")) {
                r[i].setFill(Color.YELLOW);
            } else {
                r[i].setFill(Color.LIGHTGRAY);
            }
        }
    }
    /**
     * doEverything method that enters text that user inputs.
     * @param submit Button parameter that can submit.
     * @param rectangleArray Rectangle array that will be colored.
     * @param t1 TextArea1.
     * @param t2 TextArea2.
     * @param t3 TextArea3.
     * @param t4 TextArea4.
     * @param t5 TextArea5.
     * @param s1 StackPane1.
     * @param s2 StackPane2.
     * @param s3 StackPane3.
     * @param s4 StackPane4.
     * @param s5 StackPane5.
     * @param lose boolean.
     */
    public void doEverything(Button submit, Rectangle[] rectangleArray, TextArea t1, TextArea t2, TextArea t3,
        TextArea t4, TextArea t5, StackPane s1, StackPane s2, StackPane s3, StackPane s4, StackPane s5, boolean lose) {
        if (t1.getText().length() < 1) {
            ta(t1, t1, t2, true);
        }
        if (t2.getText().length() < 1) {
            ta(t2, t1, t3, true);
        }
        if (t3.getText().length() < 1) {
            ta(t3, t2, t4, true);
        }
        if (t4.getText().length() < 1) {
            ta(t4, t3, t5, true);
        }
        if (t5.getText().length() < 1) {
            ta(t5, t4, t5, false);
        }
        submit.setText("Submit");
        submit.setOnAction(e -> {
            String s = t1.getText() + t2.getText() + t3.getText() + t4.getText() + t5.getText();
            if (s.length() == 5) {
                colorBoxes(s, rectangleArray);
                s1.getChildren().remove(t1);
                Text text1 = new Text(t1.getText());
                s1.getChildren().add(text1);
                s2.getChildren().remove(t2);
                Text text2 = new Text(t2.getText());
                s2.getChildren().add(text2);
                s3.getChildren().remove(t3);
                Text text3 = new Text(t3.getText());
                s3.getChildren().add(text3);
                s4.getChildren().remove(t4);
                Text text4 = new Text(t4.getText());
                s4.getChildren().add(text4);
                s5.getChildren().remove(t5);
                Text text5 = new Text(t5.getText());
                s5.getChildren().add(text5);
                submit.setVisible(false);
                String a = t1.getText() + t2.getText() + t3.getText() + t4.getText() + t5.getText();
                System.out.println(a);
                if (a.equals(temp)) {
                    l1.setText("Congratulations! You've guessed the word!");
                } else if (lose) {
                    l1.setText("Game over. The word was " + temp + ".");
                } else {
                    l1.setText("Try guessing a word!");
                }
            } else {
                error();
            }
        });
    }
    /**
     * HBox1.
     * @return the HBox1.
     */
    public HBox hbox1() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(50);
        rectangle1.setHeight(50);
        rectangle1.setFill(Color.WHITE);
        rectangle1.setStroke(Color.BLACK);
        rectangle1.setStrokeWidth(3);
        TextArea t1 = new TextArea();
        StackPane s1 = new StackPane();
        t1.setPrefWidth(rectangle1.getWidth());
        t1.setPrefHeight(rectangle1.getHeight());
        s1.getChildren().addAll(rectangle1, t1);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(50);
        rectangle2.setHeight(50);
        rectangle2.setFill(Color.WHITE);
        rectangle2.setStroke(Color.BLACK);
        rectangle2.setStrokeWidth(3);
        TextArea t2 = new TextArea();
        StackPane s2 = new StackPane();
        t2.setPrefWidth(rectangle2.getWidth());
        t2.setPrefHeight(rectangle2.getHeight());
        s2.getChildren().addAll(rectangle2, t2);
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setX(460);
        rectangle3.setY(100);
        rectangle3.setWidth(50);
        rectangle3.setHeight(50);
        rectangle3.setFill(Color.WHITE);
        rectangle3.setStroke(Color.BLACK);
        rectangle3.setStrokeWidth(3);
        TextArea t3 = new TextArea();
        StackPane s3 = new StackPane();
        t3.setPrefWidth(rectangle3.getWidth());
        t3.setPrefHeight(rectangle3.getHeight());
        s3.getChildren().addAll(rectangle3, t3);
        Rectangle rectangle4 = new Rectangle();
        rectangle4.setWidth(50);
        rectangle4.setHeight(50);
        rectangle4.setFill(Color.WHITE);
        rectangle4.setStroke(Color.BLACK);
        rectangle4.setStrokeWidth(3);
        TextArea t4 = new TextArea();
        StackPane s4 = new StackPane();
        t4.setPrefWidth(rectangle4.getWidth());
        t4.setPrefHeight(rectangle4.getHeight());
        s4.getChildren().addAll(rectangle4, t4);
        Rectangle rectangle5 = new Rectangle();
        rectangle5.setWidth(50);
        rectangle5.setHeight(50);
        rectangle5.setFill(Color.WHITE);
        rectangle5.setStroke(Color.BLACK);
        rectangle5.setStrokeWidth(3);
        TextArea t5 = new TextArea();
        StackPane s5 = new StackPane();
        t5.setPrefWidth(rectangle5.getWidth());
        t5.setPrefHeight(rectangle5.getHeight());
        s5.getChildren().addAll(rectangle5, t5);
        Rectangle[] rectangleArray = {rectangle1, rectangle2, rectangle3, rectangle4, rectangle5};
        Button submit =  new Button();
        doEverything(submit, rectangleArray, t1, t2, t3, t4, t5, s1, s2, s3, s4, s5, false);
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(s1, s2, s3, s4, s5, submit);
        hbox1.setSpacing(5);
        hbox1.setAlignment(Pos.CENTER);
        return hbox1;
    }
    /**
     * HBox2.
     * @return the HBox2.
     */
    public HBox hbox2() {
        Rectangle rectangle6 = new Rectangle();
        rectangle6.setWidth(50);
        rectangle6.setHeight(50);
        rectangle6.setFill(Color.WHITE);
        rectangle6.setStroke(Color.BLACK);
        rectangle6.setStrokeWidth(3);
        TextArea t1 = new TextArea();
        StackPane s1 = new StackPane();
        t1.setPrefWidth(rectangle6.getWidth());
        t1.setPrefHeight(rectangle6.getHeight());
        s1.getChildren().addAll(rectangle6, t1);
        Rectangle rectangle7 = new Rectangle();
        rectangle7.setWidth(50);
        rectangle7.setHeight(50);
        rectangle7.setFill(Color.WHITE);
        rectangle7.setStroke(Color.BLACK);
        rectangle7.setStrokeWidth(3);
        TextArea t2 = new TextArea();
        StackPane s2 = new StackPane();
        t2.setPrefWidth(rectangle7.getWidth());
        t2.setPrefHeight(rectangle7.getHeight());
        s2.getChildren().addAll(rectangle7, t2);
        Rectangle rectangle8 = new Rectangle();
        rectangle8.setWidth(50);
        rectangle8.setHeight(50);
        rectangle8.setFill(Color.WHITE);
        rectangle8.setStroke(Color.BLACK);
        rectangle8.setStrokeWidth(3);
        TextArea t3 = new TextArea();
        StackPane s3 = new StackPane();
        t3.setPrefWidth(rectangle8.getWidth());
        t3.setPrefHeight(rectangle8.getHeight());
        s3.getChildren().addAll(rectangle8, t3);
        Rectangle rectangle9 = new Rectangle();
        rectangle9.setWidth(50);
        rectangle9.setHeight(50);
        rectangle9.setFill(Color.WHITE);
        rectangle9.setStroke(Color.BLACK);
        rectangle9.setStrokeWidth(3);
        TextArea t4 = new TextArea();
        StackPane s4 = new StackPane();
        t4.setPrefWidth(rectangle9.getWidth());
        t4.setPrefHeight(rectangle9.getHeight());
        s4.getChildren().addAll(rectangle9, t4);
        Rectangle rectangle10 = new Rectangle();
        rectangle10.setWidth(50);
        rectangle10.setHeight(50);
        rectangle10.setFill(Color.WHITE);
        rectangle10.setStroke(Color.BLACK);
        rectangle10.setStrokeWidth(3);
        TextArea t5 = new TextArea();
        StackPane s5 = new StackPane();
        t5.setPrefWidth(rectangle10.getWidth());
        t5.setPrefHeight(rectangle10.getHeight());
        s5.getChildren().addAll(rectangle10, t5);
        Rectangle[] rectangleArray = {rectangle6, rectangle7, rectangle8, rectangle9, rectangle10};
        Button submit = new Button();
        doEverything(submit, rectangleArray, t1, t2, t3, t4, t5, s1, s2, s3, s4, s5, false);
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(s1, s2, s3, s4, s5, submit);
        hbox2.setSpacing(5);
        hbox2.setAlignment(Pos.CENTER);
        return hbox2;
    }
    /**
     * HBox3.
     * @return the HBox3.
     */
    public HBox hbox3() {
        Rectangle rectangle11 = new Rectangle();
        rectangle11.setWidth(50);
        rectangle11.setHeight(50);
        rectangle11.setFill(Color.WHITE);
        rectangle11.setStroke(Color.BLACK);
        rectangle11.setStrokeWidth(3);
        TextArea t1 = new TextArea();
        StackPane s1 = new StackPane();
        t1.setPrefWidth(rectangle11.getWidth());
        t1.setPrefHeight(rectangle11.getHeight());
        s1.getChildren().addAll(rectangle11, t1);
        Rectangle rectangle12 = new Rectangle();
        rectangle12.setWidth(50);
        rectangle12.setHeight(50);
        rectangle12.setFill(Color.WHITE);
        rectangle12.setStroke(Color.BLACK);
        rectangle12.setStrokeWidth(3);
        TextArea t2 = new TextArea();
        StackPane s2 = new StackPane();
        t2.setPrefWidth(rectangle12.getWidth());
        t2.setPrefHeight(rectangle12.getHeight());
        s2.getChildren().addAll(rectangle12, t2);
        Rectangle rectangle13 = new Rectangle();
        rectangle13.setWidth(50);
        rectangle13.setHeight(50);
        rectangle13.setFill(Color.WHITE);
        rectangle13.setStroke(Color.BLACK);
        rectangle13.setStrokeWidth(3);
        TextArea t3 = new TextArea();
        StackPane s3 = new StackPane();
        t3.setPrefWidth(rectangle13.getWidth());
        t3.setPrefHeight(rectangle13.getHeight());
        s3.getChildren().addAll(rectangle13, t3);
        Rectangle rectangle14 = new Rectangle();
        rectangle14.setWidth(50);
        rectangle14.setHeight(50);
        rectangle14.setFill(Color.WHITE);
        rectangle14.setStroke(Color.BLACK);
        rectangle14.setStrokeWidth(3);
        TextArea t4 = new TextArea();
        StackPane s4 = new StackPane();
        t4.setPrefWidth(rectangle14.getWidth());
        t4.setPrefHeight(rectangle14.getHeight());
        s4.getChildren().addAll(rectangle14, t4);
        Rectangle rectangle15 = new Rectangle();
        rectangle15.setWidth(50);
        rectangle15.setHeight(50);
        rectangle15.setFill(Color.WHITE);
        rectangle15.setStroke(Color.BLACK);
        rectangle15.setStrokeWidth(3);
        TextArea t5 = new TextArea();
        StackPane s5 = new StackPane();
        t5.setPrefWidth(rectangle15.getWidth());
        t5.setPrefHeight(rectangle15.getHeight());
        s5.getChildren().addAll(rectangle15, t5);
        Button submit = new Button();
        Rectangle[] rectangleArray = {rectangle11, rectangle12, rectangle13, rectangle14, rectangle15};
        doEverything(submit, rectangleArray, t1, t2, t3, t4, t5, s1, s2, s3, s4, s5, false);
        HBox hbox3 = new HBox();
        hbox3.getChildren().addAll(s1, s2, s3, s4, s5, submit);
        hbox3.setSpacing(5);
        hbox3.setAlignment(Pos.CENTER);
        return hbox3;
    }
    /**
     * HBox4.
     * @return the HBox4.
     */
    public HBox hbox4() {
        Rectangle rectangle16 = new Rectangle();
        rectangle16.setWidth(50);
        rectangle16.setHeight(50);
        rectangle16.setFill(Color.WHITE);
        rectangle16.setStroke(Color.BLACK);
        rectangle16.setStrokeWidth(3);
        TextArea t1 = new TextArea();
        StackPane s1 = new StackPane();
        t1.setPrefWidth(rectangle16.getWidth());
        t1.setPrefHeight(rectangle16.getHeight());
        s1.getChildren().addAll(rectangle16, t1);
        Rectangle rectangle17 = new Rectangle();
        rectangle17.setWidth(50);
        rectangle17.setHeight(50);
        rectangle17.setFill(Color.WHITE);
        rectangle17.setStroke(Color.BLACK);
        rectangle17.setStrokeWidth(3);
        TextArea t2 = new TextArea();
        StackPane s2 = new StackPane();
        t2.setPrefWidth(rectangle17.getWidth());
        t2.setPrefHeight(rectangle17.getHeight());
        s2.getChildren().addAll(rectangle17, t2);
        Rectangle rectangle18 = new Rectangle();
        rectangle18.setWidth(50);
        rectangle18.setHeight(50);
        rectangle18.setFill(Color.WHITE);
        rectangle18.setStroke(Color.BLACK);
        rectangle18.setStrokeWidth(3);
        TextArea t3 = new TextArea();
        StackPane s3 = new StackPane();
        t3.setPrefWidth(rectangle18.getWidth());
        t3.setPrefHeight(rectangle18.getHeight());
        s3.getChildren().addAll(rectangle18, t3);
        Rectangle rectangle19 = new Rectangle();
        rectangle19.setWidth(50);
        rectangle19.setHeight(50);
        rectangle19.setFill(Color.WHITE);
        rectangle19.setStroke(Color.BLACK);
        rectangle19.setStrokeWidth(3);
        TextArea t4 = new TextArea();
        StackPane s4 = new StackPane();
        t4.setPrefWidth(rectangle19.getWidth());
        t4.setPrefHeight(rectangle19.getHeight());
        s4.getChildren().addAll(rectangle19, t4);
        Rectangle rectangle20 = new Rectangle();
        rectangle20.setWidth(50);
        rectangle20.setHeight(50);
        rectangle20.setFill(Color.WHITE);
        rectangle20.setStroke(Color.BLACK);
        rectangle20.setStrokeWidth(3);
        TextArea t5 = new TextArea();
        StackPane s5 = new StackPane();
        t5.setPrefWidth(rectangle20.getWidth());
        t5.setPrefHeight(rectangle20.getHeight());
        s5.getChildren().addAll(rectangle20, t5);
        Button submit = new Button();
        Rectangle[] rectangleArray = {rectangle16, rectangle17, rectangle18, rectangle19, rectangle20};
        doEverything(submit, rectangleArray, t1, t2, t3, t4, t5, s1, s2, s3, s4, s5, false);
        HBox hbox4 = new HBox();
        hbox4.getChildren().addAll(s1, s2, s3, s4, s5, submit);
        hbox4.setSpacing(5);
        hbox4.setAlignment(Pos.CENTER);
        return hbox4;
    }
    /**
     * HBox5.
     * @return the HBox5.
     */
    public HBox hbox5() {
        Rectangle rectangle21 = new Rectangle();
        rectangle21.setWidth(50);
        rectangle21.setHeight(50);
        rectangle21.setFill(Color.WHITE);
        rectangle21.setStroke(Color.BLACK);
        rectangle21.setStrokeWidth(3);
        TextArea t1 = new TextArea();
        StackPane s1 = new StackPane();
        t1.setPrefWidth(rectangle21.getWidth());
        t1.setPrefHeight(rectangle21.getHeight());
        s1.getChildren().addAll(rectangle21, t1);
        Rectangle rectangle22 = new Rectangle();
        rectangle22.setWidth(50);
        rectangle22.setHeight(50);
        rectangle22.setFill(Color.WHITE);
        rectangle22.setStroke(Color.BLACK);
        rectangle22.setStrokeWidth(3);
        TextArea t2 = new TextArea();
        StackPane s2 = new StackPane();
        t2.setPrefWidth(rectangle22.getWidth());
        t2.setPrefHeight(rectangle22.getHeight());
        s2.getChildren().addAll(rectangle22, t2);
        Rectangle rectangle23 = new Rectangle();
        rectangle23.setWidth(50);
        rectangle23.setHeight(50);
        rectangle23.setFill(Color.WHITE);
        rectangle23.setStroke(Color.BLACK);
        rectangle23.setStrokeWidth(3);
        TextArea t3 = new TextArea();
        StackPane s3 = new StackPane();
        t3.setPrefWidth(rectangle23.getWidth());
        t3.setPrefHeight(rectangle23.getHeight());
        s3.getChildren().addAll(rectangle23, t3);
        Rectangle rectangle24 = new Rectangle();
        rectangle24.setWidth(50);
        rectangle24.setHeight(50);
        rectangle24.setFill(Color.WHITE);
        rectangle24.setStroke(Color.BLACK);
        rectangle24.setStrokeWidth(3);
        TextArea t4 = new TextArea();
        StackPane s4 = new StackPane();
        t4.setPrefWidth(rectangle24.getWidth());
        t4.setPrefHeight(rectangle24.getHeight());
        s4.getChildren().addAll(rectangle24, t4);
        Rectangle rectangle25 = new Rectangle();
        rectangle25.setWidth(50);
        rectangle25.setHeight(50);
        rectangle25.setFill(Color.WHITE);
        rectangle25.setStroke(Color.BLACK);
        rectangle25.setStrokeWidth(3);
        TextArea t5 = new TextArea();
        StackPane s5 = new StackPane();
        t5.setPrefWidth(rectangle25.getWidth());
        t5.setPrefHeight(rectangle25.getHeight());
        s5.getChildren().addAll(rectangle25, t5);
        Button submit = new Button();
        Rectangle[] rectangleArray = {rectangle21, rectangle22, rectangle23, rectangle24, rectangle25};
        doEverything(submit, rectangleArray, t1, t2, t3, t4, t5, s1, s2, s3, s4, s5, false);
        HBox hbox5 = new HBox();
        hbox5.getChildren().addAll(s1, s2, s3, s4, s5, submit);
        hbox5.setSpacing(5);
        hbox5.setAlignment(Pos.CENTER);
        return hbox5;
    }
    /**
     * HBox6.
     * @return the HBox6.
     */
    public HBox hbox6() {
        Rectangle rectangle26 = new Rectangle();
        rectangle26.setWidth(50);
        rectangle26.setHeight(50);
        rectangle26.setFill(Color.WHITE);
        rectangle26.setStroke(Color.BLACK);
        rectangle26.setStrokeWidth(3);
        TextArea t1 = new TextArea();
        StackPane s1 = new StackPane();
        t1.setPrefWidth(rectangle26.getWidth());
        t1.setPrefHeight(rectangle26.getHeight());
        s1.getChildren().addAll(rectangle26, t1);
        Rectangle rectangle27 = new Rectangle();
        rectangle27.setWidth(50);
        rectangle27.setHeight(50);
        rectangle27.setFill(Color.WHITE);
        rectangle27.setStroke(Color.BLACK);
        rectangle27.setStrokeWidth(3);
        TextArea t2 = new TextArea();
        StackPane s2 = new StackPane();
        t2.setPrefWidth(rectangle27.getWidth());
        t2.setPrefHeight(rectangle27.getHeight());
        s2.getChildren().addAll(rectangle27, t2);
        Rectangle rectangle28 = new Rectangle();
        rectangle28.setWidth(50);
        rectangle28.setHeight(50);
        rectangle28.setFill(Color.WHITE);
        rectangle28.setStroke(Color.BLACK);
        rectangle28.setStrokeWidth(3);
        TextArea t3 = new TextArea();
        StackPane s3 = new StackPane();
        t3.setPrefWidth(rectangle28.getWidth());
        t3.setPrefHeight(rectangle28.getHeight());
        s3.getChildren().addAll(rectangle28, t3);
        Rectangle rectangle29 = new Rectangle();
        rectangle29.setWidth(50);
        rectangle29.setHeight(50);
        rectangle29.setFill(Color.WHITE);
        rectangle29.setStroke(Color.BLACK);
        rectangle29.setStrokeWidth(3);
        TextArea t4 = new TextArea();
        StackPane s4 = new StackPane();
        t4.setPrefWidth(rectangle29.getWidth());
        t4.setPrefHeight(rectangle29.getHeight());
        s4.getChildren().addAll(rectangle29, t4);
        Rectangle rectangle30 = new Rectangle();
        rectangle30.setWidth(50);
        rectangle30.setHeight(50);
        rectangle30.setFill(Color.WHITE);
        rectangle30.setStroke(Color.BLACK);
        rectangle30.setStrokeWidth(3);
        TextArea t5 = new TextArea();
        StackPane s5 = new StackPane();
        t5.setPrefWidth(rectangle30.getWidth());
        t5.setPrefHeight(rectangle30.getHeight());
        s5.getChildren().addAll(rectangle30, t5);
        Button submit = new Button();
        Rectangle[] rectangleArray = {rectangle26, rectangle27, rectangle28, rectangle29, rectangle30};
        doEverything(submit, rectangleArray, t1, t2, t3, t4, t5, s1, s2, s3, s4, s5, true);
        HBox hbox6 = new HBox();
        hbox6.getChildren().addAll(s1, s2, s3, s4, s5, submit);
        hbox6.setSpacing(5);
        hbox6.setAlignment(Pos.CENTER);
        return hbox6;
    }
    /**
     * rectangle method that returns the VBox of all HBoxes.
     * @return the VBox.
     */
    public VBox rectangles() {
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox1(), hbox2(), hbox3(), hbox4(), hbox5(), hbox6());
        vbox.setSpacing(5);
        vbox.setAlignment(Pos.CENTER);
        return vbox;
    }
    /**
     * jordleText method that returns the text on top.
     * @return the text.
     */
    public Text jordleText() {
        Text text = new Text();
        text.setY(50);
        text.setX(305);
        text.setText("Lets Play Jordle!");
        text.setFont(Font.font("Verdana", 25));
        text.setFill(Color.BLACK);
        text.setTextAlignment(TextAlignment.CENTER);
        return text;
    }
    /**
     * line method that draws a line.
     * @return the line.
     */
    public Line line() {
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(650);
        line.setEndX(800);
        line.setEndY(650);
        line.setStrokeWidth(5);
        return line;
    }
    /**
     * line method that returns another line.
     * @return the other line.
     */
    public Line line2() {
        Line line2 = new Line();
        line2.setStartX(0);
        line2.setStartY(80);
        line2.setEndX(800);
        line2.setEndY(80);
        line2.setStrokeWidth(5);
        return line2;
    }
    @Override
    public void start(Stage primaryStage) {
        try {
            Button reset = new Button("Restart");
            reset.setOnAction(
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        Stage newStage = new Stage();
                        l1.setText("Try guessing a word!");
                        temp = randomWord();
                        primaryStage.hide();
                        start(newStage);
                    }
                });
            Button instructions = new Button("Instructions");
            instructions.setOnAction(
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        VBox v = new VBox();
                        String instructionsInfo = "Welcome to Jordle. The objective of"
                            + " the game is to guess a 5-letter word."
                            + " You will have 6 opportunities to guess. \n\n\nGame"
                            + " Mechanics: \n-If the correct letter is in the correct play, the cell will"
                            + " turn GREEN. \n-If the correct letter is in the wrong place,"
                            + " the cell will turn YELLOW. \n-If a wrong letter is guessed,"
                            + " the cell will turn GRAY";
                        Text text = new Text(instructionsInfo);
                        Font font = Font.font("Verdana", FontWeight.BOLD, 12);
                        text.setFont(font);
                        text.setFill(Color.DARKCYAN);
                        v.getChildren().add(text);
                        Scene scene = new Scene(v, 500, 500);
                        Stage stage = new Stage();
                        stage.setTitle("Instructions");
                        stage.setScene(scene);
                        stage.show();
                    }
                });
            HBox layout1 = new HBox(10);
            layout1.getChildren().addAll(l1, reset, instructions);
            layout1.setAlignment(Pos.CENTER);
            BorderPane pane = new BorderPane();
            Scene scene = new Scene(pane, 800, 700);
            primaryStage.setTitle("Jordle");
            primaryStage.setResizable(false);
            pane.setCenter(rectangles());
            pane.setBottom(layout1);
            pane.getChildren().add(line());
            pane.getChildren().add(line2());
            pane.getChildren().add(jordleText());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}