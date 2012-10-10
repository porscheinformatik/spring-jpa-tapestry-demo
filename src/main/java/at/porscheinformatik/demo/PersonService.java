package at.porscheinformatik.demo;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PersonService
{
    @Inject
    private PersonRepository personRepository;

    public Iterable<Person> listPersons()
    {
        return personRepository.findAll();
    }

    @Transactional
    public void addPerson(Person person)
    {
        personRepository.save(person);
    }
}
