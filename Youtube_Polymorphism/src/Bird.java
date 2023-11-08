public class Bird {

    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends  Bird{
    public void sing(){
        System.out.println("twiddledede");
    }
}

class Pelican extends Bird{
    public void sing(){
        System.out.println("bark" );
    }
}

    class Polymorphism{
        public static void main(String[] args) {
            Bird b = new Bird();
            b.sing();
        }
}
