interface Shape2{
    final double PI=3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle3 implements Shape2{
    int r;
    public Circle3(int r) {
        this.r=r;
    }
    public void draw() {
        System.out.println("반지름이 "+r+"인 원 입니다.");
    }
    public double getArea() {
        return r*r*PI;
    }
}

public class p0513 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape2 donut=new Circle3(10);
        donut.redraw();
        System.out.println("면적은 "+donut.getArea());
    }

}