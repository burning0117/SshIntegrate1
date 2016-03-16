package service;

import dao.PersonDao;
import domain.Person;

/**
 * Created by burning on 2016/3/16.
 */
public class PersonServiceImpl implements PersonService{
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void savePerson(Person person) {
       this.personDao.savePerson(person);
    }
}
