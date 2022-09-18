package zzz.collection;

import lombok.SneakyThrows;

import java.util.Objects;

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
    public Emplay() {
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

    public int getAge() {
        return age;
    }

    private String name;
    private Integer age;




    /**
     * 按照年龄排序
     * @param o
     * @return
     */
    @SneakyThrows
    @Override
    public int compareTo(Object o) {
        if (o instanceof Emplay){
          Emplay emplay = (Emplay) o;
            return this.age.compareTo(emplay.age);
        }
        throw new Exception("类型传入错误");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emplay emplay = (Emplay) o;
        return Objects.equals(name, emplay.name) &&
                Objects.equals(age, emplay.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
