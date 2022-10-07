//// 실습 5-9
//import java.util.Scanner;
//
//interface Stack{
//    int length();
//    int capacity();
//    String pop();
//    boolean push(String val);
//}
//
//class StringStack implements Stack {
//    int cnt = 0, size;
//    String [] str;
//
//    StringStack(int size){
//        this.size = size;
//        this.str = new String [size];
//    }
//
//    public int length() {
//        return cnt;
//    }
//    public int capacity() {
//        return size;
//    }
//    public String pop() {
//        cnt--;
//        String ans = "";
//        for(int i = cnt; i >= 0; i--){
//            ans += (str[i] + " ");
//        }
//        return ans;
//    }
//    public boolean push(String val) {
//        if(cnt != size){
//            str[cnt++] = val;
//            return true;
//        }
//        else
//            return false;
//    }
//}
//
//public class StackApp {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
//        int size = sc.nextInt();
//        StringStack ss = new StringStack(size);
//
//        sc.nextLine();
//
//        while(true){
//            System.out.print("문자열 입력 >> ");
//            String str = sc.nextLine();
//            if(str.equals("그만")) {
//                break;
//            }
//
//            if(ss.push(str) == false){
//                System.out.println("스택이 꽉 차서 푸시 불가!");
//            }
//        }
//
//        System.out.println("스택에 저장된 모든 문자열 팝 : " + ss.pop());
//    }
//}