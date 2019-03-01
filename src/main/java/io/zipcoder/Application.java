package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {

    private static IOConsole console = new IOConsole();
    private List<Pet> petArrayList;

    public Application() {
    }


    public int numberOfPets() {
        int totalNumberOfPets = console.getIntegerInput("How many pets do you have?");
        return totalNumberOfPets;
    }

    public String nameOfPets() {
        String name = console.getStringInput("What is you pet name?");
        return name;
    }

    public String petType() {
        String type = console.getStringInput("What kind of pet is it?");
        return type;
    }

    public Integer ageOfPet() {
        Integer age = console.getIntegerInput("How old is your pet?");
        return age;
    }

    public List<Pet> start() {
        this.petArrayList = new ArrayList<>();
//        int totalNumberOfPets = console.getIntegerInput("How many pets do you have?");

        for (int i = 0; i < numberOfPets(); i++) {

//            String name = console.getStringInput("What is you pet name?");
//            Integer age = console.getIntegerInput("How old is your pet?");
//            String type = console.getStringInput("What kind of pet is it?");
            String name = nameOfPets();
            Integer age = ageOfPet();
            String type = petType();

            while(!(type.equals("dog") || type.equals("cat") || type.equals("groot"))) {
                console.print("Error must input cat, dog, or groot.");
                type = console.getStringInput("What kind of pet is it?");
            }

            type = type.toLowerCase();
            Pet pet = null;

            switch(type) {
                case "dog" : pet = new Dog(name, age);
                break;

                case "cat" : pet = new Cat(name, age);
                    break;

                case "groot" : pet = new Groot(name, age);
                    break;
            }
            this.petArrayList.add(pet);

            }
        printPetList(this.petArrayList);
        return this.petArrayList;
    }

        public String printPetList(List<Pet> myPets) {
            Collections.sort(myPets);
//            Arrays.sort(myPets.toArray());
            StringBuilder stringBuilder = new StringBuilder();
//            String s  = "";
            for (Pet pets : myPets) {
                stringBuilder.append(String.format("Name: %s. Speak: %s\n", pets.getName(), pets.speak()));

            }
            console.println(stringBuilder.toString());
            return stringBuilder.toString();
        }
}
