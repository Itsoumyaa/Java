public class Overloading {
    int a,b;
    void get(){
        a=10;
        b=9;
    }
    void get(int x,int y){
        a=x;
        b=y;
    }
    void set(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Overloading a1= new Overloading();
        a1.get();
        a1.set();
        a1.get(4,5);
        a1.set();
    }
}
