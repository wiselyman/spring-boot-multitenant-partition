package top.wisely.springbootmultitenantpartition;

import lombok.Value;

@Value

public class PersonDto {
    private String name;
    private Integer age;

    public Person createPerson(){
        Person person = new Person();
        person.setName(this.name);
        person.setAge(this.age);
        return person;
    }
}
