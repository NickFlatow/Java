package Model;

public class SomeThingElse extends SomeThing {
    private int number;
    public SomeThingElse() {
        super();
        System.out.print("H");
    }
    @Override
    public void changeA(int a) {
        super.setA(a+2);
        System.out.print("I");
    }
    @Override
    public void changeA(double a) {
        super.setA(a+3);
        System.out.print("J");
    }
}
