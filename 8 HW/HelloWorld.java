import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Slider;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Toggle;
import javafx.scene.layout.HBox;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
public class HelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World");
        label.setFont(new Font("Snell Roundhand", 50));
        Circle circle = new Circle(80, Color.AQUA);
        // Circle circle1 = new Circle(50, Color.GREEN);
        Slider slider = new Slider(0.1, 2, 1.0);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(0.25f);
        slider.setBlockIncrement(0.1f);
        slider.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                //circle.setRadius(slider.getValue() * circle.getRadius());
               label.setFont(new Font(label.getFont().getName(), 30 * 
slider.getValue()));
            }
        });
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton defaultFont = new RadioButton("Default");
        defaultFont.setToggleGroup(toggleGroup);
        RadioButton comicSans = new RadioButton("comic sans");
        comicSans.setToggleGroup(toggleGroup);
        RadioButton times = new RadioButton("Times New Roman");
        times.setToggleGroup(toggleGroup);
        HBox hBox1 = new HBox(100);
        hBox1.getChildren().addAll(defaultFont, comicSans, times);
        toggleGroup.selectedToggleProperty().addListener(new 
ChangeListener<Toggle>()
        {
            public void changed(ObservableValue<? extends Toggle> ob,
                                Toggle o, Toggle n)
            {
                RadioButton rb = (RadioButton)toggleGroup.getSelectedToggle();
                if (rb == defaultFont) {
                    label.setFont(new Font("Snell Roundhand", 50));
                } else if (rb == comicSans) {
                    label.setFont(new Font("Comic Sans MS", 50));
                } else {
                    label.setFont(new Font("Times New Roman", 50));
                }
            }
        });
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(circle, label);
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox1);
        borderPane.setCenter(stackPane);
        borderPane.setBottom(slider);
        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
