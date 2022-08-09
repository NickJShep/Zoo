public abstract class Animal {

    //////////////////////////////////////Attributes//////////////////////////

    private String name;
    private int age;
   private int numOfLegs;
   private boolean isAlive = true;

    /////////////////////////////////////Constructors////////////////////////

    public Animal (int age){
        this.age=age;
    }
    public Animal (int numOfLegs){this.numOfLegs=numOfLegs;}

    /////////////////////////////////////Methods/////////////////////////////




    public int getAge() {
        return age;
    }
}
