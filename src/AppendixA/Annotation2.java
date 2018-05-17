package AppendixA;

import com.sun.istack.internal.NotNull;

// 형식 어노테이션
public class Annotation2 {

    Person person = new Person("simjunbo");

    @NotNull
    String name = person.getName();

    //List<@NotNull Person> persions = new ArrayList<>();
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
