package test;

import domain.Person;
import org.junit.Test;
import service.PersonService;

/**
 * Created by burning on 2016/3/16.
 */
public class PersonTest extends BaseSpring {
    @Test
    public void testSavePerson() {
        PersonService personService = (PersonService) context.getBean("personService");
        Person person=new Person();
        person.setPname("0909美女");
        personService.savePerson(person);
        System.out.printf(personService+"");
    }
}
