
  public class oopss1 {
//jab class ek andar class banate  h to we write like static class 
     static   class Car {  // static use krne se hume oops class ka object nahi banan padega 
    String brand ;
    int speed;
     void drive(){
    System.out.println(brand+"is drivng at"+speed);

    }
   }
   
      public  static  void main  (String[] args) {
       // oopss1 obj= new oopss1();// iska istemal tv h jab second class car 
       // me static nahi use krte h tb  hum dono class ke obj banane padte h 
       // oopss1. Car c1  = obj.new Car();
       // Car c1 =new Car(); //class car ka object banaya 
Car c1 = new Car();
        c1.brand ="brezza";// then brand call diya brezza 
        c1.speed =80;//and then speed ko call diya 80
c1.drive(); // drive  ko call dediya toh print hogya 
    }
   }
        
    


/* 
public class oopss1 {

    static class Car {
        String brand;
        int speed;

        void drive() {
            System.out.println(brand + " is driving at " + speed);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "brezza";
        c1.speed = 80;

        c1.drive();
    }
}
*/