public class Animal {


    public static void main(String[] args) {
        Animal jen = new Lion();//upcasting
        ((Lion)jen).roar();
        Lion suzie = ((Lion)jen);//downcasting
        Mammal joe = new Mammal();
        Lion jacob = new Lion();
        Mammal jus = jacob;
        

    }
    //object lion is casted up to the animal reference varialbe
    //when upcasting: the variable type determines what methods are avaiacharleston sclbe to call
    //the object type determine what version of the method is exectued.



    public void eat(){
        System.out.println("animal eats");
    }

    public void sleep(){
        System.out.println("animal snore zzz..");
    }
}

class Mammal extends Animal{

    public void controlTemp(){
        System.out.println("mammal controls temp");
    }

}

class Lion extends Mammal{
    @Override
    public void sleep(){
        System.out.println("Lion sleeping snoring");
    }

    public void roar(){
        System.out.println("Lion making loud roaring noise!!");
    }


}
