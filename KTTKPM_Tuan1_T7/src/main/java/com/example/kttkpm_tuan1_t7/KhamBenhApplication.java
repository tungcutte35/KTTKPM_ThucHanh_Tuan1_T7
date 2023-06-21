package com.example.kttkpm_tuan1_t7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KhamBenhApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(KhamBenhApplication.class.getResource("kham-benh.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bác sĩ khám bệnh");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}