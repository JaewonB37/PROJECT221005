//// 실습 6-11
//import java.util.Scanner;
//
//public class Practice_6_11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print(">>");
//        String str = sc.nextLine();
//        StringBuffer sb = new StringBuffer(str);
//
//        while(true){
//            int start = 0, end = 0;
//            System.out.print("명령 : ");
//            String cmd = sc.nextLine();
//            if(cmd.equals("그만")){
//                System.out.println("종료합니다.");
//                break;
//            }
//
//            String [] cmd_array = cmd.split("!");
//            if(cmd_array[0] == "") {
//                System.out.println("잘못된 명령입니다!");
//            } else {
//                int w_cnt = 0;
//                for(int i = 0; i < sb.length() - cmd_array[0].length(); i++) {
//                    if(sb.charAt(i) == cmd_array[0].charAt(0)) {
//                        int cnt = 0;
//                        for (int j = i; j < i + cmd_array[0].length(); j++) {
//                            if(sb.charAt(j) == cmd_array[0].charAt(j - i)){
//                                cnt++;
//                            }
//                        }
//
//                        if (cnt == cmd_array[0].length()){
//                            start = i;
//                            end = i + cmd_array[0].length();
//
//                            sb.replace(start, end, cmd_array[1]);
//                            System.out.println(sb);
//                        }
//                    } else {
//                        w_cnt++;
//                    }
//                }
//                if(w_cnt == sb.length() - cmd_array[0].length()){
//                    System.out.println("찾을 수 없습니다!");
//                }
//            }
//        }
//    }
//}