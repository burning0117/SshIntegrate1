package test;

import org.junit.Test;

/**
 * Created by burning on 2016/3/16.
 */
public class SessionFactoryTest extends BaseSpring{
    @Test
    public void testSessionFactory(){
        context.getBean("sessionFactory");
    }
}
