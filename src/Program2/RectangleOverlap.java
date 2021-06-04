package Program2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.util.ArrayList;

public class RectangleOverlap extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        ArrayList<Shape>rectangles = new ArrayList<Shape>();
        double x= 100;
        double y= 200;
        Rectangle rectangle1 = new Rectangle(x,y, Color.TRANSPARENT);
        rectangle1.setStroke(Color.GREEN);
        rectangle1.setX(200);
        rectangle1.setY(200);
        rectangles.add(rectangle1);


        double x2= 100;
        double y2= 200;
        Rectangle rectangle2 = new Rectangle(x2,y2, Color.TRANSPARENT);
        rectangle2.setStroke(Color.RED);
        rectangle2.setX(100);
        rectangle2.setY(100);
        rectangles.add(rectangle2);

        double x3= 100;
        double y3= 200;
        Rectangle rectangle3 = new Rectangle(x,y, Color.TRANSPARENT);
        rectangle3.setStroke(Color.BLUE);
        rectangle3.setX(400);
        rectangle3.setY(700);
        rectangles.add(rectangle3);


        double x4= 100;
        double y4= 200;
        Rectangle rectangle4 = new Rectangle(x2,y2, Color.TRANSPARENT);
        rectangle4.setStroke(Color.ORANGE);
        rectangle4.setX(400);
        rectangle4.setY(400);
        rectangles.add(rectangle4);






        pane.getChildren().addAll(rectangles);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println("RECTANGLE 1 & 2:");
        if(!checkBounds(rectangle2,rectangles)&&!checkBounds(rectangle1,rectangles)){
            System.out.println("The Rectangles are not colliding");
        }else {
            System.out.println("The Rectangles are colliding");
        }

        System.out.println("RECTANGLE 3 & 4:");
        if(!checkBounds(rectangle3,rectangles)&&!checkBounds(rectangle4,rectangles)){
            System.out.println("The Rectangles are not colliding");
        }else {
            System.out.println("The Rectangles are colliding");
        }


       /* Prints: 
       RECTANGLE 1 & 2:
        The Rectangles are colliding
        RECTANGLE 3 & 4:
        The Rectangles are not colliding*/
    }
    private boolean checkBounds(Shape block, ArrayList<Shape> shapes) {

        boolean collisionDetected = false;
        for (Shape TempRectangle : shapes) {
            if (TempRectangle != block) {
                TempRectangle.setFill(Color.GREEN);

                if (block.getBoundsInParent().intersects(TempRectangle.getBoundsInParent())) {
                    collisionDetected = true;
                }
            }
        }
return collisionDetected;
    }
}
