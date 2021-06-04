package Program1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class SmileyFace extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        int center = 200;
        Pane pane = new Pane();
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Circle head = new Circle(center, center, 100, Color.TRANSPARENT);
        head.setStroke(Color.BLACK);
        shapes.add(head);
        double x = center - (100 / 2.8);
        double y = x + (100 / 2.8) * 2;

        Ellipse rightEye = new Ellipse(x, x, 25, 100 / 6);
        rightEye.setFill(Color.TRANSPARENT);
        rightEye.setStroke(Color.BLACK);
        shapes.add(rightEye);
        Ellipse leftEye = new Ellipse(y, x, 25, 100 / 6);
        leftEye.setFill(Color.TRANSPARENT);
        leftEye.setStroke(Color.BLACK);
        shapes.add(leftEye);

        Circle rightPupil = new Circle(x, x, 13, Color.BLACK);
        Circle leftPupil = new Circle(y, x, 13, Color.BLACK);
        shapes.add(leftPupil);
        shapes.add(rightPupil);

        Polygon nose = new Polygon(head.getCenterX() - (head.getRadius() / 4), head.getCenterY() + (head.getRadius() / 4),
                head.getCenterX() + (head.getRadius() / 4), head.getCenterY() + (head.getRadius() / 4),
                head.getCenterX(), head.getCenterY() - (head.getRadius() / 4));
        nose.setFill(Color.TRANSPARENT);
        nose.setStroke(Color.BLACK);
        shapes.add(nose);

        Arc smile = new Arc(head.getCenterX(), // center x
                head.getCenterY() + (head.getRadius() / 3), // center y
                head.getRadius() / 2, // x radius
                head.getRadius() / 2 / 2, // y radius
                180, 180);
        smile.setFill(Color.TRANSPARENT);
        smile.setStroke(Color.BLACK);
        shapes.add(smile);

        //Paints a smiley face for you


        pane.getChildren().addAll(shapes);
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
