//// 예제 5-2
//class Person {
//    private int weight;
//    int age;
//    protected int height;
//    public String name;
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//    public int getWeight() {
//        return weight;
//    }
//}
//
//class Student extends Person {
//    public void set() {
//        age = 30;
//        name = "홍길동";
//        height = 175;
//        // weight = 99; // 오류, 아래 처럼 실행해야 접근 가능
//        setWeight(99);
//    }
//}
//
//public class InheritanceEx {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.set();
//    }
//}