//// 실습 6-9
//import java.util.Scanner;
//import java.util.Random;
//
//public class Practice_6_9 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int choice = 0, c_choice;
//        String str = null, c_str = null;
//
//        while(choice != 4) {
//            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
//
//            choice = sc.nextInt();
//            if(choice == 1) {
//                str = "가위";
//            } else if (choice == 2) {
//                str = "바위" ;
//            } else if (choice == 3) {
//                str = "보";
//            } else if (choice == 4) {
//                System.out.println("프로그램을 종료합니다.");
//                System.exit(0);
//            }else {
//                System.out.println("잘못 입력했습니다. 다시 입력하세요");
//                continue;
//            }
//
//            c_choice = (int)(Math.random() * 3) + 1;
//            if(c_choice == 1) {
//                c_str = "가위";
//            } else if (choice == 2) {
//                c_str = "바위";
//            } else {
//                c_str = "보";
//            }
//
//            System.out.println("철수(" + str + ") : 컴퓨터(" + c_str + ")");
//
//            if(choice == 1) {
//                if(c_choice == 1) {
//                    System.out.println("비겼습니다.");
//                } else if (choice == 2) {
//                    System.out.println("컴퓨터가 이겼습니다.");
//                } else {
//                    System.out.println("철수가 이겼습니다.");
//                }
//            } else if (choice == 2) {
//                if(c_choice == 1) {
//                    System.out.println("철수가 이겼습니다.");
//                } else if (choice == 2) {
//                    System.out.println("비겼습니다.");
//                } else {
//                    System.out.println("컴퓨터가 이겼습니다.");
//                }
//            } else if (choice == 3) {
//                if(c_choice == 1) {
//                    System.out.println("컴퓨터가 이겼습니다.");
//                } else if (choice == 2) {
//                    System.out.println("철수가 이겼습니다.");
//                } else {
//                    System.out.println("비겼습니다.");
//                }
//            }
//        }
//    }
//}
