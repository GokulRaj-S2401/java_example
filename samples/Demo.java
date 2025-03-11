package samples;
public class Demo {
    public void add(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String args[]) {
        System.out.println("Hello world");
        Demo object = new Demo();
        object.add(10,20);
        object.add(20,30);
        object.add(40,50);
    }
}
