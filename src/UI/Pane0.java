package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Pane0 extends Application {

    private AnchorPane anchorPane0;

    public Pane0() {
        anchorPane0 = new AnchorPane();
        anchorPane0.setPrefSize(1200, 1300);
        anchorPane0.setStyle("-fx-background-color:#2B303B");
        anchorPane0.setVisible(true);
    }

    public void load(AnchorPane anchorPane0, Button button1, Button button2, Button button3, Button button4, Button button5, AnchorPane anchorPane1, Button exit) {

        Font font = Font.font("YouYuan", FontWeight.BLACK, 27);

        Button login = new Button("登录");
        login.setStyle("-fx-background-color: #304152");//   #143352
        login.setTextFill(Color.rgb(217, 217, 217));
        login.setFont(font);
        login.setPrefSize(190, 70);
        login.setOnAction(new EventHandler<ActionEvent>() {  // 登录
            @Override
            public void handle(ActionEvent event) {
                button1.setDisable(false);
                button2.setDisable(false);
                button3.setDisable(false);
                button4.setDisable(false);
                button5.setDisable(false);
                anchorPane0.setVisible(false);
                anchorPane1.setVisible(true);
                exit.setVisible(true);
            }
        });

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(380, 250);
        anchorPane.setStyle("-fx-background-color: #F4FEE5");
        anchorPane.setOpacity(0);

        TextField textField = new TextField();
        textField.setPrefWidth(350);
        textField.setPrefHeight(50);
        textField.setOpacity(0.2);

        Image image = new Image("img/img2.png", 1300, 1400, true, false, true);
        ImageView imageView = new ImageView(image);
        anchorPane0.getChildren().addAll(imageView, login, anchorPane, textField);
        AnchorPane.setLeftAnchor(login, 450.0);
        AnchorPane.setTopAnchor(login, 600.0);
        AnchorPane.setLeftAnchor(textField, 400.0);
        AnchorPane.setTopAnchor(textField, 400.0);
        AnchorPane.setLeftAnchor(anchorPane, 380.0);
        AnchorPane.setTopAnchor(anchorPane, 270.0);
//        TextField textField = new TextField();
//        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf("#102b6a"), new CornerRadii(1), new Insets(1));
//        Background background = new Background(backgroundFill);
//        textField.setBackground(background);
//        AnchorPane.setLeftAnchor(textField, 600.0);
//        AnchorPane.setTopAnchor(textField, 600.0);
    }

    @Override
    public void start(Stage primaryStage) {

        Image image = new Image("img/img4.jpg", 1800, 800, true, true, true);//感觉false更清晰
        ImageView imageView = new ImageView(image);
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(imageView);

        Scene scene = new Scene(anchorPane, 1285, 955);
        primaryStage.setTitle("hospital");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        //退出程序前可以先 pane.getChildren().removeAll();  也可以java自己回收
    }

    public static void main(String[] args) {
        launch(args);
    }

    public AnchorPane getAnchorPane0() {
        return anchorPane0;
    }

    public void setAnchorPane0(AnchorPane anchorPane0) {
        this.anchorPane0 = anchorPane0;
    }
}
