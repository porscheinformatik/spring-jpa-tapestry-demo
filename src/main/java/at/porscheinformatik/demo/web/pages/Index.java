package at.porscheinformatik.demo.web.pages;

import javax.inject.Inject;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;

import at.porscheinformatik.demo.Person;
import at.porscheinformatik.demo.PersonService;

public class Index
{
    @Inject
    private PersonService personService;

    @Property
    private Person person;
    
    public Iterable<Person> getPersonList()
    {
        return personService.listPersons();
    }

    @OnEvent(EventConstants.PREPARE)
    void preparePerson()
    {
        person = new Person();
    }

    @OnEvent(EventConstants.SUCCESS)
    void createPerson()
    {
        personService.addPerson(person);
    }

}
