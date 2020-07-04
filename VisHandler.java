import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class VisHandler implements EventHandler<ActionEvent>{
    Stage stage;
    BorderPane mainpage;
    public VisHandler(Stage stage, BorderPane mainpage){
         this.stage = stage; 
         this.mainpage = mainpage; 
    }
    public void handle(ActionEvent event){
        Button source = (Button)event.getSource();
        String button_text = source.getText();
        KMapVis.generate_table(this.stage, this.mainpage, (int)(button_text.charAt(0)));
    }

}