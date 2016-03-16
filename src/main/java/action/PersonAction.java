package action;

import com.opensymphony.xwork2.ActionSupport;
import domain.Person;
import service.PersonService;

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

    public String savePerson(){
        System.out.println("222222");
        Person person=new Person();
        person.setPname("0909美女");
        System.out.println("111111");
        personService.savePerson(person);
        return null;
    }
}
