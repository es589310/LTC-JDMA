package Lesson12.EasyLevel;

import java.util.Objects;

public class Person {
    private long id;
    private String name;
    private String surname;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age);
    }
}
/*
    Yani, bu equals() yöntemi, önce referans kontrolü yapar, sonra nesnelerin
    sınıflarını ve null olup olmadıklarını kontrol eder. Daha sonra, id ve age
    özelliklerini doğrudan karşılaştırırken, name ve surname özelliklerini null
    güvenli bir şekilde karşılaştırır. Eğer tüm koşullar sağlanıyorsa,
    iki Person nesnesi eşittir ve true değeri döndürülür.
    */
