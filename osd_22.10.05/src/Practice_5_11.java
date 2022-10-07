//// 실습 5-11
//import java.util.Scanner;
//
//abstract class Calc {
//    int a, b;
//
//    public abstract void setValue(int a, int b);
//    public abstract int calculate();
//}
//
//class Add extends Calc {
//    public void setValue (int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate () {
//        return a + b;
//    }
//}
//
//class Sub extends Calc {
//    public void setValue (int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate () {
//        return a - b;
//    }
//}
//
//class Mul extends Calc {
//    public void setValue (int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate () {
//        return a * b;
//    }
//}
//
//class Div extends Calc {
//    public void setValue (int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate () {
//        int res = 0;
//        try {
//            res = a / b;
//        }catch(ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다.");
//            System.exit(0);
//        }
//
//        return res;
//    }
//}
//
//public class Practice_5_11 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("두 정수와 연산자를 입력하시오>>");
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        char operator = sc.next().charAt(0);
//
//        switch (operator) {
//            case '+':
//                Add add = new Add();
//                add.setValue(a, b);
//                System.out.println(add.calculate());
//                break;
//            case '-':
//                Sub sub = new Sub();
//                sub.setValue(a, b);
//                System.out.println(sub.calculate());
//                break;
//            case '*':
//                Mul mul = new Mul();
//                mul.setValue(a, b);
//                System.out.println(mul.calculate());
//                break;
//            case '/':
//                Div div = new Div();
//                div.setValue(a, b);
//                System.out.println(div.calculate());
//                break;
//            default:
//                System.out.println("잘못된 연산자입니다.");
//        }
//
//        sc.close();
//    }
//}
