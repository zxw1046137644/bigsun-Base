package Class;

public class Student extends User{
    private Integer age;

    public void getStudentName(){
        System.out.println("多态子类方法");
    }

    public void getName(){
        System.out.println("多态子类重写父类方法");
    }
}


class test {
    public static void main(String[] args) {
        User user = new Student();
        user.getName();


    }
}
