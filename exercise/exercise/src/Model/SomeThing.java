package Model;

public class SomeThing {
    private int a;
    public static int b=0;

    public SomeThing() {
        a=5;
        System.out.print("A");
    }
    public SomeThing(int a) {
        this.a=a;
        System.out.print("B");
    }
    public int getA() {
        System.out.print("C");
        return a;
    }
    public void setA(int a) {
        this.a=a;
        System.out.print("D");
    }
    public void setA(double a) {
        this.a=(int)(a*2);
        System.out.print("E");
    }
    public void changeA(int a) {
        this.a+=this.a-a;
        System.out.print("F");
    }
    public void changeA(double a) {
        this.a+=this.a+a;
        System.out.print("G");
    }
}
