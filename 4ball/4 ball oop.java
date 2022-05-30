import processing.core.PApplet;

public class Main extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;

    int n_of_circles = 4;
    Circle[] circles = new Circle[n_of_circles];


    public static void main(String[] args) {

        PApplet.main("org.example.Main", args);
    }

   
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        for (int i = 0; i < n_of_circles; i++) {
            
            circles[i] = new Circle(1,((i+1)*height/5),i+1);
        }

    }

    public void draw() {
        for (int i = 0; i < 4; i++) {
            circles[i].display();
            circles[i].move();
        }
    }

    class Circle {
        float startingPoint;
        float height;
        float speed;

        Circle(int startingPoint, int height, int speed) {
            this.startingPoint = startingPoint;
            this.height = height;
            this.speed = speed;
        }

       
        void display( ) {
            ellipse(this.startingPoint, this.height, 10, 10);
        }

        
        void move(){
            this.startingPoint = this.startingPoint + this.speed;
        }
    }
}
