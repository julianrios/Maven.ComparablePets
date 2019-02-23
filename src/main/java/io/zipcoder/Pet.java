package io.zipcoder;

public class Pet implements Comparable<Pet> {
    private String name;
    private Integer age;

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

//    public Pet() {
//        this(null, null);
//    }
//
//    public Pet(Integer age) {
//        this(null, age);
//    }
//
//    public Pet(String name) {
//        this(name, null);
//    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    public String speak() {
        return null;
    }

    @Override
    public int compareTo(Pet otherPet) {
        Integer compareName = this.name.compareTo(otherPet.name);

        if(compareName == 0) {
            return this.getClass().getName().compareTo(otherPet.getClass().getName());
        }

//        this.getName().compareToIgnoreCase(otherPet.getName())
        return compareName;
    }

//    public int compareToPetType(Pet otherPet) {
//    Integer num = 0;
//        if(otherPet instanceof Dog) {
//            num =-1;
//        }
//        if(otherPet instanceof Cat) {
//            num = 0;
//        }
//        if(otherPet instanceof Groot) {
//            num = 1;
//        }
//        return num;
//    }

//    @Override
//    public String toString() {
//        return "Pet{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


}
