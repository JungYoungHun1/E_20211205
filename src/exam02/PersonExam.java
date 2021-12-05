package exam02;

public class PersonExam {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.setName("정영훈");
        ps.setAge(24);
        System.out.println(ps);
        Person p = new Person("홍길동",19);
        System.out.println(p);
        p.run(30);
    }
}
