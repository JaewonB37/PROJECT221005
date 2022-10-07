//// 실습 5장 Open Challenge
//import java.util.Scanner;
//import java.util.Random;
//abstract class GameObject {
//    protected int distance;
//    protected int x, y;
//    public GameObject(int startX, int startY, int distance){
//        this.x = startX;
//        this.y = startY;
//        this.distance = distance;
//    }
//    public int getX() {return x;}
//    public int getY() {return y;}
//    public boolean collide(GameObject p){
//        if(this.x == p.getX() && this.y == p.getY())
//            return true;
//        else
//            return false;
//    }
//    protected abstract void move();
//    protected abstract char getShape();
//}
//
//class Bear extends GameObject {
//    public Bear(int startX, int startY, int distance) {
//        super(startX, startY, distance);
//    }
//    @Override
//    public void move() {
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            String way = sc.nextLine();
//            if (way.equals("d")) {
//                if(y > 0) {
//                    this.y--;
//                }
//                break;
//            } else if (way.equals("a")) {
//                if(x > 0) {
//                    this.x--;
//                }
//                break;
//            } else if (way.equals("s")) {
//                if(y < 9) {
//                    this.y++;
//                }
//                break;
//            } else if (way.equals("f")) {
//                if(x < 19) {
//                    this.x++;
//                }
//                break;
//            } else {
//                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
//            }
//        }
//    }
//    public char getShape() {
//        return 'B';
//    }
//}
//
//class Fish extends GameObject {
//    int cnt = 0;
//    public Fish(int startX, int startY, int distance) {
//        super(startX, startY, distance);
//    }
//
//    @Override
//    public void move() {
//        int cnt = 0;
//        int num = (int)(Math.random() * 5 + 1);
//        if (num == 1 || num == 2) {
//            int num2 = (int)(Math.random() * 4 + 1);
//            if (num2 == 1) {
//                if(y > 0) {
//                    super.y--;
//                }
//            } else if (num2 == 2) {
//                if(x > 0) {
//                    super.x--;
//                }
//            } else if (num2 == 3) {
//                if(y < 9) {
//                    super.y++;
//                }
//            } else if (num2 == 4) {
//                if(x < 19) {
//                    super.x++;
//                }
//            }
//        }
//    }
//    public char getShape() {
//        return '@';
//    }
//}
//
//public class Game {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Bear b = new Bear(0, 0, 1);
//        Fish f = new Fish(6, 6, 1);
//
//        while(true) {
//            for (int i = 0; i < 10; i++) {
//                for (int j = 0; j < 20; j++) {
//                    if (b.getX() == j && b.getY() == i) {
//                        System.out.print(b.getShape());
//                    } else if (f.getX() == j && f.getY() == i) {
//                        System.out.print(f.getShape());
//                    } else {
//                        System.out.print("-");
//                    }
//                }
//                System.out.println();
//            }
//
//            if(b.getX() == f.getX() && b.getY() == f.getY()) {
//                System.out.println("Bear Wins!!");
//                break;
//            } else {
//                System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
//                b.move();
//                f.move();
//            }
//        }
//        sc.close();
//    }
//}
