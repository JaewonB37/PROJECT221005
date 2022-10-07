//// 실습 6-5
//import java.util.Calendar;
//public class Practice_6_5 {
//    public static String printCalendar(Calendar cal) {
//        int hour = cal.get(Calendar.HOUR);
//        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
//        int ampm = cal.get(Calendar.AM_PM);
//        int minute = cal.get(Calendar.MINUTE);
//        if(ampm == Calendar.AM) System.out.print("오전 ");
//        else System.out.print("오후 ");
//        System.out.print(hour + "시 " + minute + "분 ");
//
//        if (hourOfDay >= 4 && hourOfDay < 12){
//            return ("Good Morning");
//        } else if (hourOfDay >= 12 && hourOfDay < 18) {
//            return ("Good Afternoon");
//        } else if (hourOfDay >= 18 && hourOfDay < 22) {
//            return ("Good Evening");
//        } else {
//            return ("Good Night");
//        }
//    }
//
//    public static void main(String[] args) {
//        Calendar now = Calendar.getInstance();
//        System.out.print("현재 시간은 ");
//        String msg = printCalendar(now);
//        System.out.println("입니다.");
//        System.out.println(msg);
//    }
//}