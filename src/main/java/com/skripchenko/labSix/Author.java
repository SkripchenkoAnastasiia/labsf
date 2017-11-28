package com.skripchenko.labSix;

public class Author {
    private String firstName;
    private String secondName;
    private int age;
    public enum Sex{
        MALE, FEMALE
    }
    public Sex sex;

    public Author(String firstName, String secondName, int age, Sex sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        if (age != author.age) return false;
        if (!firstName.equals(author.firstName)) return false;
        return sex == author.sex;
    }
}