public class Concepts {

    private  int a;
    public int b;
    // static block
    static {
        System.out.println("Static block");

    }
    {

       System.out.println("Intializer Block");
       a = 30;
       s=99;
    }

    static  private int s = 20;
    public int getA() {
        s+=290;
        return a;
    }

    public void setA(int a) {
        s-=a;
        this.a = a;
    }

    public  Concepts(){
        System.out.println("Calling default Constructor ");
    }


    public  Concepts(int a){
        System.out.println("Calling args Constructor ");
        this.a = a;
    }

    public static void main(String[] args) {
//        Concepts concepts = new Concepts() ;
//        concepts.setA(20);
//        Concepts concepts1 = new Concepts(30);
//        Concepts.s += 1;
//        System.out.println(concepts.getA());
//        System.out.println(concepts1.getA());
//        System.out.println(concepts.s);
//        Concepts.s+= 130;
//        System.out.println(concepts.s);
//        System.out.println(concepts1.s);


    }
}
