public class TestCircle {
    public static void main(String[] args) {

    }

    class Circle{
        double radius;

        Circle(){
            radius = 1;
        }

        Circle(double newRadius){
            radius = newRadius;
        }

        double getArea(){
            return radius * radius * Math.PI;
        }

        
    }
}
