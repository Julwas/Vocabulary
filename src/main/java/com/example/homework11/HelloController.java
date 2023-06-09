package com.example.homework11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {

    public ListView listView = new ListView();

    public void action(ActionEvent actionEvent){
        ArrayList<String> animals = new ArrayList<>();
        File words = new File(("src\\main\\resources\\com\\example\\homework11\\words.txt"));
        Scanner enter = null;
        try {
            enter = new Scanner(words);

            while (enter.hasNext()) {
                animals.add(enter.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        listView.getItems().clear();
        listView.getItems().addAll(animals);
    }
}