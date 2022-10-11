import java.util.Scanner;

abstract class Calc{
    int a,b;
    abstract void setValue(int a,int b);
    abstract int calculate();
}

class Add extends Calc{
    void setValue(int a,int b) {
        this.a=a;
        this.b=b;
    }

    int calculate() {
        return a+b;
    }
}

class Sub extends Calc{
    void setValue(int a,int b) {
        this.a=a;
        this.b=b;
    }

    int calculate() {
        return a-b;
    }
}

class Mul extends Calc{
    void setValue(int a,int b) {
        this.a=a;
        this.b=b;
    }

    int calculate() {
        return a*b;
    }
}

class Div extends Calc{
    void setValue(int a,int b) {
        this.a=a;
        this.b=b;
    }

    int calculate() {
        if(b==0) {
            System.out.println("0으로 나눌 수 없어요");
        }
        else {
            System.out.println(a/b);
        }
        return 0;
    }
}

public class p0511 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String op=sc.next();
        Calc sp;
        switch(op.charAt(0)) {
            case '+':
                sp=new Add();
                break;
            case '-':
                sp=new Sub();
                break;
            case '*':
                sp=new Mul();
                break;
            case '/':
                sp=new Div();
                break;
            default:
                return ;
        }
        sp.setValue(a, b);
        System.out.println(sp.calculate());
    }

}