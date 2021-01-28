package Chat;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

public class ChatController {
    public ListView<String> listView;
    public TextField input;
    public Button delete;

    public void send(ActionEvent actionEvent) {
        String message = input.getText();
        input.clear();
        //если строка пустая - в listView ничего не передается
        if (!message.isEmpty()) {
            listView.getItems().add(message);
        }
    }

    //обработка нажатия мыши на listView
    public void click(MouseEvent mouseEvent) {
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("MOUSE_CLICKED");
            }
        });

    }

    public void clear(ActionEvent actionEvent) {
        input.clear();
        Tooltip tooltip = new Tooltip();
        // подсказка при наведении мыши
        tooltip.setText("You can clear the field");
        delete.setTooltip(tooltip);
    }
}


 