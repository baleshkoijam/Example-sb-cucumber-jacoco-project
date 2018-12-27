package hello;

public class Person {

    public Person(String age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }





    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    private String name;
    private String age;
    private String sex;

}
