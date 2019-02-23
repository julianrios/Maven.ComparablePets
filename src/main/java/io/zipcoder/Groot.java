package io.zipcoder;

public class Groot extends Pet {

    public Groot(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

//    @Override
//    public Integer getAge() {
//        return super.getAge();
//    }
//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public void setAge(Integer age) {
//        super.setAge(age);
//    }

    @Override
    public String speak() {
        return "I am Groot";
    }
}
