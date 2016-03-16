package action;

import com.opensymphony.xwork2.ActionSupport;
import domain.Person;
import service.PersonService;

import java.util.Calendar;
import java.util.Timer;

/**
 * Created by burning on 2016/3/16.
 */
public class PersonAction extends ActionSupport {
    private PersonService personService;
    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public String savePerson() throws InterruptedException {
        System.out.println(Calendar.SECOND);
        Person person=new Person();
        person.setPname("0909美女");
        personService.savePerson(person);
        System.out.println("3");
        return null;
    }
}
