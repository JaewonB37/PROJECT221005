//// 실습 6장 Open Challenge
//import java.util.Scanner;
//
//public class Practice_6_OC {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
//        StringBuffer sb = new StringBuffer("");
//        int [] cnt = new int [26];
//        for(int i = 0; i < 26; i++){
//            cnt[i] = 0;
//        }
//
//        while(true){
//            String txt = sc.nextLine();
//            if(txt.equals(";")){
//                break;
//            }
//            txt = txt.toUpperCase();
//            sb.append(txt);
//        }
//
//        for(int i = 0; i < sb.length(); i++){
//            if(sb.charAt(i) >= 65 && sb.charAt(i) <= 90) {
//                cnt[sb.charAt(i) - 65]++;
//            }
//        }
//
//        System.out.println("히스토그램을 그립니다.");
//
//        for(int i = 0; i < 26; i++){
//            System.out.printf("%c", i + 65);
//            for(int j = 0; j < cnt[i]; j++) {
//                System.out.print("-");
//            }
//            System.out.println();
//        }
//    }
//}
