package Person;

import Person.Person;
import org.junit.Test;
import org.junit.Assert;

public class TestPerson {
    @Test
    public void testConstuctor(){
        String name = "BillyBoy";
        long id = Long.valueOf(123L);
        Person testPerson = new Person(id,name);
        String expected = "BillyBoy";
        String actual = testPerson.getName();
        long expected1 = 123L;
        long actual1 = testPerson.getId();

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected1,actual1);
    }
}
