package io.zipcoder;

public class Cat extends Pet{

    public Cat(String name, Integer age) {
        super(name, age);
    }

//    public Cat(String name) {
//        super(name);
//    }
//
//    public Cat(Integer age) {
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
//    @Override
//    public void setAge(Integer age) {
//        super.setAge(age);
//    }

    @Override
    public String speak() {
        return "Meow";
    }
}
