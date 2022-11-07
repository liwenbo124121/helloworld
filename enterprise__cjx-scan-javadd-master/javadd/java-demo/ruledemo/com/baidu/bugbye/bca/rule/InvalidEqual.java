package com.baidu.bugbye.bca.rule;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvalidEqual {

    public static void main(String[] args) {
        List<String> listA = Arrays.asList("A", "B", "C");
        ArrayList<String> listB = new ArrayList<>(Arrays.asList("A", "B", "C"));

        Dog dog = new Dog("wang");
        Husky husky = new Husky("erha");
        Labrador labrador = new Labrador("labrador");
        Cat cat = new Cat("miao");
        Class catType = cat.getClass();
        Class dogType = Dog.class;

        System.out.println(listA.equals(Arrays.asList("A", "B", "C")));  // good
        System.out.println(listA.equals(listB));  // good
        System.out.println(listA.equals("ABC"));  // bad  TODO
        System.out.println(dog.equals(husky));  // good
        System.out.println(labrador.equals(dog));  // good
        System.out.println(husky.equals(labrador));  // bad
        System.out.println(labrador.equals(cat));  // bad
        System.out.println(catType.equals(husky.getClass()));  // good
        System.out.println(husky.getClass().equals(Husky.class));  // good
        System.out.println(Husky.class.equals(dogType));  // good
        String type = "abc";
        System.out.println(StringUtils.equals(type, "abc"));  // good
        System.out.println(StringUtilTmp.equals(type, "abc"));  // good
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
}

class Husky extends Dog {
    public Husky(String name) {
        super(name);
    }
}

class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
}


class StringUtilTmp extends StringUtils {

}
