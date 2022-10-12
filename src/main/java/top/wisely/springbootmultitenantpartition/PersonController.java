package top.wisely.springbootmultitenantpartition;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @PostMapping
    public Person save(@RequestBody PersonDto personDto){
        return  personRepository.save(personDto.createPerson());
    }

    @GetMapping
    private List<Person> all(){
        return personRepository.findAll();
    }
}
