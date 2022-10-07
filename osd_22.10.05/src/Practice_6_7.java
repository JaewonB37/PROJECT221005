////// 실습 6-7
//// (1) StringTokenizer
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Practice_6_7 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.print(">> ");
//            String str = sc.nextLine();
//            if(str.equals("그만")){
//                break;
//            }
//            StringTokenizer st = new StringTokenizer(str, " ");
//            System.out.println("어절 개수는 " + st.countTokens());
//        }
//        System.out.println("종료합니다...");
//    }
//}


//// (2) String클래스의 split() 메소드
//import java.util.Scanner;
//
//public class Practice_6_7 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.print(">> ");
//            String str = sc.nextLine();
//            if(str.equals("그만")){
//                break;
//            }
//            String [] array = str.split(" ");
//            System.out.println("어절 개수는 " + array.length);
//        }
//        System.out.println("종료합니다...");
//    }
//}