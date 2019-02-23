package io.zipcoder;

public class Dog extends Pet {
    public Dog(String name, Integer age) {
        super(name, age);
    }

//    public Dog() {
//        super();
//    }
//
//    public Dog(Integer age) {
//        super(age);
//    }
//
//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
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
//
//    public void setAge(Integer age) {
//        super.setAge(age);
//    }

    @Override
    public String speak() {
        return "Bark";
    }




}
