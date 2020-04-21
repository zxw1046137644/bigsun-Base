package zzz.collection;

public class Emplay implements Comparable {

    @Override
    public String toString() {
        return "Emplay{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Emplay(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private String name;
    private Integer age;


    public int compareTo(Object o) {
        if (o instanceof Emplay) {//判断是否同类
            Emplay emplay = (Emplay) o;//类型转换
            return this.age.compareTo(emplay.age);

        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
