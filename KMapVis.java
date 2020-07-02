import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class KMapVis extends Application{
    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage stage) throws Exception{
        initUI(stage);
    }
    public void initUI(Stage stage) throws Exception{
        KMapModel model = new KMapModel();
        Label title = new Label("Kmap visualizer");
        BorderPane mainpage = new BorderPane();
        HBox inpbox = new HBox(20);
        inpbox.setPadding(new Insets(10));
        inpbox.setMinWidth(500);;
        for(int i=0; i<5; i++){
            inpbox.getChildren().add(new Button(i+" input(s)"));
        }
        mainpage.setMinSize(500, 650);
        mainpage.setPadding(new Insets(10));
        mainpage.setTop(inpbox);
        Scene scene = new Scene(mainpage);
        stage.setTitle("KMap visualizer");
        stage.setScene(scene);
        stage.show();
    }
}
