//// 6장 퀴즈
//import java.util.Scanner;
//import java.lang.Math;
//import java.util.Random;
//
//class Person {
//    String name;
//    Person (String name){
//        this.name = name;
//    }
//}
//
//public class Gambling {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Person p [] = new Person [2];
//        int [] num = new int [3];
//
//        for (int i = 0; i<2; i++){
//            System.out.print(i + 1 + "번째 선수 이름>>");
//            String name = sc.nextLine();
//            p[i] = new Person(name);
//        }
//
//        while(true){
//            for(int i = 0; i < 2; i++) {
//                System.out.print("[" + p[i].name + "] : ");
//                for(int j = 0; j<3; j++){
//                    num[j] = (int)(Math.random() * 3 + 1);
//                    System.out.print(num[j] + "\t");
//                    if(j == 2 && num[0] == num[1] && num[0] == num[2]){
//                        System.out.println(p[i].name + "님이 이겼습니다!");
//                        System.exit(0);
//                    }
//                }
//                System.out.println("아쉽군요!");
//            }
//        }
//    }
//}
