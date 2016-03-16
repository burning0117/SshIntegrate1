package dao;

import domain.Person;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by burning on 2016/3/16.
 */
public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{
    public void savePerson(Person person) {
        this.getHibernateTemplate().save(person);
    }
}
