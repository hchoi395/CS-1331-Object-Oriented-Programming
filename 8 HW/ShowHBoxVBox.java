import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author blj0011
 */
public class ShowHBoxVBox extends Application
{

    @Override
    public void start(Stage primaryStage)
    {


        BorderPane root = new BorderPane();


        VBox vbox = new VBox();
        vbox.setMinWidth(100);

        TextField textfield1 = new TextField();
        TextField textfield2 = new TextField();

        textfield1.setPrefWidth(50);
        textfield1.setPromptText("Enter height");
        textfield1.setOnKeyReleased(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event)
            {  
                if(textfield1.getText().length() > 0 && textfield2.getText().length() > 0)
                {
                    Rectangle rectangle = new Rectangle();
                    rectangle.setHeight(Double.parseDouble(textfield1.getText()));
                    rectangle.setWidth(Double.parseDouble(textfield2.getText()));
                    rectangle.setFill(Color.BLUE);
                    root.setCenter(rectangle);
                }
            }
        });



        textfield2.setPrefWidth(100);
        textfield2.setPromptText("Enter length");
        textfield2.setOnKeyReleased(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event)
            {
                if(textfield1.getText().length() > 0 && textfield2.getText().length() > 0)
                {
                    Rectangle rectangle = new Rectangle();
                    rectangle.setHeight(Double.parseDouble(textfield1.getText()));
                    rectangle.setWidth(Double.parseDouble(textfield2.getText()));
                    rectangle.setFill(Color.BLUE);
                    root.setCenter(rectangle);
                }
            }
        });

        vbox.getChildren().addAll(textfield1, textfield2);
        root.setLeft(vbox);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}