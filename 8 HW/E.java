import javafx.application.Application;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
//import javafx.scene.input.MouseEvent;
public class E extends Application {
    Group root = new Group();
    
    public static void main(String[] args) {
        launch(args);
    }
    public void tr(Text t) {
        t.setOnKeyReleased((KeyEvent e) -> {
            t.setText("");
        });
    }          
    public void ta(Text t, Text tBefore, Text tAfter) {
        t.setOnKeyPressed((KeyEvent e) -> {
            switch(e.getCode()) {
                case A:
                    t.setText("a");
                    tAfter.requestFocus();
                    tr(t);
                    break;
                case B:
                    t.setText("b");
                    tAfter.requestFocus();
                    tr(t);
                    break;
                case C:
                    t.setText("c");
                    tAfter.requestFocus();
                    tr(t);
                    break;
                case D:
                    t.setText("d");
                    tAfter.requestFocus();
                    tr(t);
                    break;
                case E:
                    t.setText("e");
                    tAfter.requestFocus();
                    tr(t);
                    break;
                case F:
                    t.setText("f");
                    tAfter.requestFocus();
                    break;
                case G:
                    t.setText("g");
                    tAfter.requestFocus();
                    break;
                case H:
                    t.setText("h");
                    tAfter.requestFocus();
                    break;
                case I:
                    t.setText("i");
                    tAfter.requestFocus();
                    break;
                case J:
                    t.setText("j");
                    tAfter.requestFocus();
                    break;
                case K:
                    t.setText("k");
                    tAfter.requestFocus();
                    break;
                case L:
                    t.setText("l");
                    tAfter.requestFocus();
                    break;
                case M:
                    t.setText("m");
                    tAfter.requestFocus();
                    break;
                case N:
                    t.setText("n");
                    tAfter.requestFocus();
                    break;
                case O:
                    t.setText("o");
                    tAfter.requestFocus();
                    break;
                case P:
                    t.setText("p");
                    tAfter.requestFocus();
                    break;
                case Q:
                    t.setText("q");
                    tAfter.requestFocus();
                    break;
                case R:
                    t.setText("r");
                    tAfter.requestFocus();
                    break;
                case S:
                    t.setText("s");
                    tAfter.requestFocus();
                    break;
                case T:
                    t.setText("t");
                    tAfter.requestFocus();
                    break;
                case U:
                    t.setText("u");
                    tAfter.requestFocus();
                    break;
                case V:
                    t.setText("v");
                    tAfter.requestFocus();
                    break;
                case W:
                    t.setText("w");
                    tAfter.requestFocus();
                    break;
                case X:
                    t.setText("x");
                    tAfter.requestFocus();
                    break;
                case Y:
                    t.setText("y");
                    tAfter.requestFocus();
                    break;
                case Z:
                    t.setText("z");
                    tAfter.requestFocus();
                    break;
                case BACK_SPACE:
                    tBefore.setText("");
                    tBefore.requestFocus();
                default:
                    t.setText("");
                    tr(t);
            }
        });
    }
    public String randomWord() {
        int index = (int)(Math.random() * Words.list.size());
        String i = Words.list.get(index);
        System.out.println("Random Element is :" + i);
        return i;
    }
    public void error() {
        Text error = new Text("Need 5 letters");
        error.setX(30);
        error.setY(200);
    }
    public void colorBoxes(String s, Rectangle[] r) {
        char[] rw = new char[randomWord().length()];
        char[] st = new char[s.length()];
        for (int i = 0; i < 5; i++) {
            rw[i] = randomWord().charAt(i);
            st[i] = s.charAt(i);
            if (rw[i] == st[i]) {
                r[i].setFill(Color.LIGHTGREEN);
            } else if (rw[i] != st[i] && s.contains(rw[i] + "")) {
                r[i].setFill(Color.YELLOW);
            } else {
                r[i].setFill(Color.LIGHTGRAY);
            }
        }
    }
    public HBox hbox1() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(50);
        rectangle1.setHeight(50);
        rectangle1.setFill(Color.WHITE);
        rectangle1.setStroke(Color.BLACK);
        rectangle1.setStrokeWidth(3);
        Text t1 = new Text();
        StackPane s1 = new StackPane();
        s1.getChildren().addAll(t1, rectangle1);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(50);
        rectangle2.setHeight(50);
        rectangle2.setFill(Color.WHITE);
        rectangle2.setStroke(Color.BLACK);
        rectangle2.setStrokeWidth(3);
        Text t2 = new Text();
        StackPane s2 = new StackPane();
        s2.getChildren().addAll(rectangle2, t2);
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setX(460);
        rectangle3.setY(100);
        rectangle3.setWidth(50);
        rectangle3.setHeight(50);
        rectangle3.setFill(Color.WHITE);
        rectangle3.setStroke(Color.BLACK);
        rectangle3.setStrokeWidth(3);
        Text t3 = new Text();
        StackPane s3 = new StackPane();
        s3.getChildren().addAll(rectangle3, t3);
        Rectangle rectangle4 = new Rectangle();
        rectangle4.setWidth(50);
        rectangle4.setHeight(50);
        rectangle4.setFill(Color.WHITE);
        rectangle4.setStroke(Color.BLACK);
        rectangle4.setStrokeWidth(3);
        Text t4 = new Text();
        StackPane s4 = new StackPane();
        s4.getChildren().addAll(rectangle4, t4);
        Rectangle rectangle5 = new Rectangle();
        rectangle5.setWidth(50);
        rectangle5.setHeight(50);
        rectangle5.setFill(Color.WHITE);
        rectangle5.setStroke(Color.BLACK);
        rectangle5.setStrokeWidth(3);
        Text t5 = new Text();
        StackPane s5 = new StackPane();
        s5.getChildren().addAll(rectangle5, t5);
        if (t1.getText().length() < 1) {
            ta(t1, t1, t2);
        }
        if (t2.getText().length() < 1) {
            ta(t2, t1, t3);
        }
        if (t3.getText().length() < 1) {
            ta(t3, t2, t4);
        }
        if (t4.getText().length() < 1) {
            ta(t4, t3, t5);
        }
        if (t5.getText().length() < 1) {
            ta(t5, t4, t5);
        }
        Rectangle[] rectangleArray = {rectangle1, rectangle2, rectangle3, rectangle4, rectangle5};
        Button submit =  new Button();
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
            } else {
                error();
            }
        });
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(s1, s2, s3, s4, s5, submit);
        hbox1.setSpacing(5);
        hbox1.setAlignment(Pos.CENTER);
        return hbox1;
    }
    public HBox hbox2() {
        Rectangle rectangle6 = new Rectangle();
        rectangle6.setWidth(50);
        rectangle6.setHeight(50);
        rectangle6.setFill(Color.WHITE);
        rectangle6.setStroke(Color.BLACK);
        rectangle6.setStrokeWidth(3);
        Rectangle rectangle7 = new Rectangle();
        rectangle7.setWidth(50);
        rectangle7.setHeight(50);
        rectangle7.setFill(Color.WHITE);
        rectangle7.setStroke(Color.BLACK);
        rectangle7.setStrokeWidth(3);
        Rectangle rectangle8 = new Rectangle();
        rectangle8.setWidth(50);
        rectangle8.setHeight(50);
        rectangle8.setFill(Color.WHITE);
        rectangle8.setStroke(Color.BLACK);
        rectangle8.setStrokeWidth(3);
        Rectangle rectangle9 = new Rectangle();
        rectangle9.setWidth(50);
        rectangle9.setHeight(50);
        rectangle9.setFill(Color.WHITE);
        rectangle9.setStroke(Color.BLACK);
        rectangle9.setStrokeWidth(3);
        Rectangle rectangle10 = new Rectangle();
        rectangle10.setWidth(50);
        rectangle10.setHeight(50);
        rectangle10.setFill(Color.WHITE);
        rectangle10.setStroke(Color.BLACK);
        rectangle10.setStrokeWidth(3);
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(rectangle6, rectangle7, rectangle8, rectangle9, rectangle10);
        hbox2.setSpacing(5);
        hbox2.setAlignment(Pos.CENTER);
        return hbox2;
    }
    public HBox hbox3() {
        Rectangle rectangle11 = new Rectangle();
        rectangle11.setWidth(50);
        rectangle11.setHeight(50);
        rectangle11.setFill(Color.WHITE);
        rectangle11.setStroke(Color.BLACK);
        rectangle11.setStrokeWidth(3);
        Rectangle rectangle12 = new Rectangle();
        rectangle12.setWidth(50);
        rectangle12.setHeight(50);
        rectangle12.setFill(Color.WHITE);
        rectangle12.setStroke(Color.BLACK);
        rectangle12.setStrokeWidth(3);
        Rectangle rectangle13 = new Rectangle();
        rectangle13.setWidth(50);
        rectangle13.setHeight(50);
        rectangle13.setFill(Color.WHITE);
        rectangle13.setStroke(Color.BLACK);
        rectangle13.setStrokeWidth(3);
        Rectangle rectangle14 = new Rectangle();
        rectangle14.setWidth(50);
        rectangle14.setHeight(50);
        rectangle14.setFill(Color.WHITE);
        rectangle14.setStroke(Color.BLACK);
        rectangle14.setStrokeWidth(3);
        Rectangle rectangle15 = new Rectangle();
        rectangle15.setWidth(50);
        rectangle15.setHeight(50);
        rectangle15.setFill(Color.WHITE);
        rectangle15.setStroke(Color.BLACK);
        rectangle15.setStrokeWidth(3);
        HBox hbox3 = new HBox();
        hbox3.getChildren().addAll(rectangle11, rectangle12, rectangle13, rectangle14, rectangle15);
        hbox3.setSpacing(5);
        hbox3.setAlignment(Pos.CENTER);
        return hbox3;
    }
    public HBox hbox4() {
        Rectangle rectangle16 = new Rectangle();
        rectangle16.setWidth(50);
        rectangle16.setHeight(50);
        rectangle16.setFill(Color.WHITE);
        rectangle16.setStroke(Color.BLACK);
        rectangle16.setStrokeWidth(3);
        Rectangle rectangle17 = new Rectangle();
        rectangle17.setWidth(50);
        rectangle17.setHeight(50);
        rectangle17.setFill(Color.WHITE);
        rectangle17.setStroke(Color.BLACK);
        rectangle17.setStrokeWidth(3);
        Rectangle rectangle18 = new Rectangle();
        rectangle18.setWidth(50);
        rectangle18.setHeight(50);
        rectangle18.setFill(Color.WHITE);
        rectangle18.setStroke(Color.BLACK);
        rectangle18.setStrokeWidth(3);
        Rectangle rectangle19 = new Rectangle();
        rectangle19.setWidth(50);
        rectangle19.setHeight(50);
        rectangle19.setFill(Color.WHITE);
        rectangle19.setStroke(Color.BLACK);
        rectangle19.setStrokeWidth(3);
        Rectangle rectangle20 = new Rectangle();
        rectangle20.setWidth(50);
        rectangle20.setHeight(50);
        rectangle20.setFill(Color.WHITE);
        rectangle20.setStroke(Color.BLACK);
        rectangle20.setStrokeWidth(3);
        HBox hbox4 = new HBox();
        hbox4.getChildren().addAll(rectangle16, rectangle17, rectangle18, rectangle19, rectangle20);
        hbox4.setSpacing(5);
        hbox4.setAlignment(Pos.CENTER);
        return hbox4;
    }
    public HBox hbox5() {
        Rectangle rectangle21 = new Rectangle();
        rectangle21.setWidth(50);
        rectangle21.setHeight(50);
        rectangle21.setFill(Color.WHITE);
        rectangle21.setStroke(Color.BLACK);
        rectangle21.setStrokeWidth(3);
        Rectangle rectangle22 = new Rectangle();
        rectangle22.setWidth(50);
        rectangle22.setHeight(50);
        rectangle22.setFill(Color.WHITE);
        rectangle22.setStroke(Color.BLACK);
        rectangle22.setStrokeWidth(3);
        Rectangle rectangle23 = new Rectangle();
        rectangle23.setWidth(50);
        rectangle23.setHeight(50);
        rectangle23.setFill(Color.WHITE);
        rectangle23.setStroke(Color.BLACK);
        rectangle23.setStrokeWidth(3);
        Rectangle rectangle24 = new Rectangle();
        rectangle24.setWidth(50);
        rectangle24.setHeight(50);
        rectangle24.setFill(Color.WHITE);
        rectangle24.setStroke(Color.BLACK);
        rectangle24.setStrokeWidth(3);
        Rectangle rectangle25 = new Rectangle();
        rectangle25.setWidth(50);
        rectangle25.setHeight(50);
        rectangle25.setFill(Color.WHITE);
        rectangle25.setStroke(Color.BLACK);
        rectangle25.setStrokeWidth(3);
        HBox hbox5 = new HBox();
        hbox5.getChildren().addAll(rectangle21, rectangle22, rectangle23, rectangle24, rectangle25);
        hbox5.setSpacing(5);
        hbox5.setAlignment(Pos.CENTER);
        return hbox5;
    }
    public HBox hbox6() {
        Rectangle rectangle26 = new Rectangle();
        rectangle26.setWidth(50);
        rectangle26.setHeight(50);
        rectangle26.setFill(Color.WHITE);
        rectangle26.setStroke(Color.BLACK);
        rectangle26.setStrokeWidth(3);
        Rectangle rectangle27 = new Rectangle();
        rectangle27.setWidth(50);
        rectangle27.setHeight(50);
        rectangle27.setFill(Color.WHITE);
        rectangle27.setStroke(Color.BLACK);
        rectangle27.setStrokeWidth(3);
        Rectangle rectangle28 = new Rectangle();
        rectangle28.setWidth(50);
        rectangle28.setHeight(50);
        rectangle28.setFill(Color.WHITE);
        rectangle28.setStroke(Color.BLACK);
        rectangle28.setStrokeWidth(3);
        Rectangle rectangle29 = new Rectangle();
        rectangle29.setWidth(50);
        rectangle29.setHeight(50);
        rectangle29.setFill(Color.WHITE);
        rectangle29.setStroke(Color.BLACK);
        rectangle29.setStrokeWidth(3);
        Rectangle rectangle30 = new Rectangle();
        rectangle30.setWidth(50);
        rectangle30.setHeight(50);
        rectangle30.setFill(Color.WHITE);
        rectangle30.setStroke(Color.BLACK);
        rectangle30.setStrokeWidth(3);
        HBox hbox6 = new HBox();
        hbox6.getChildren().addAll(rectangle26, rectangle27, rectangle28, rectangle29, rectangle30);
        hbox6.setSpacing(5);
        hbox6.setAlignment(Pos.CENTER);
        return hbox6;
    }
    public VBox rectangles() {
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox1(), hbox2(), hbox3(), hbox4(), hbox5(), hbox6());
        vbox.setSpacing(5);
        vbox.setAlignment(Pos.CENTER);
        return vbox;
    }
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
    public Line line() {
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(650);
        line.setEndX(800);
        line.setEndY(650);
        line.setStrokeWidth(5);
        return line;
    }
    public Line line2() {
        Line line2 = new Line();
        line2.setStartX(0);
        line2.setStartY(80);
        line2.setEndX(800);
        line2.setEndY(80);
        line2.setStrokeWidth(5);
        return line2;
    }
    public HBox buttons() {
        Button reset = new Button("Restart");
        Button instructions = new Button("Instructions");
        HBox layout1 = new HBox(100);
        layout1.getChildren().addAll(reset, instructions);
        layout1.setAlignment(Pos.CENTER);
        return layout1;
    } 
    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane pane = new BorderPane();
            Scene scene = new Scene(pane, 800, 700, Color.LIGHTBLUE);
            primaryStage.setTitle("Jordle");
            primaryStage.setResizable(false);
            pane.setCenter(rectangles());
            pane.setBottom(buttons());
            pane.getChildren().add(line());
            pane.getChildren().add(line2());
            pane.getChildren().add(jordleText());
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    
