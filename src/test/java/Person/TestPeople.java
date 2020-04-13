package Person;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        people.add(new Person(1L,"Billy"));
        people.add(new Person(2L,"MoneyMarr"));
        people.add(new Person(3L,"QueenOfCode"));
        Assert.assertEquals(Integer.valueOf(3),people.count());
    }
    @Test
    public void testRemove(){
        ArrayList<Person> x = new ArrayList<>();
        x.add(new Person(1L,"Billy"));
        x.add(new Person(2L,"MoneyMarr"));
        People people = new People();
        Person ondia = new Person(3L,"QueenOfCode");
        people.add(ondia);
        people.remove(ondia);
        Assert.assertFalse(people.contains(ondia));
    }
    @Test
    public void testFindById(){
        ArrayList<Person> x = new ArrayList<>();
        x.add(new Person(1L, "Billy"));
        x.add(new Person(1L,"MoneyMarr"));
        People people = new People();
        Person ondia =new Person(3L,"QueenOfCode");
        people.add(ondia);
        Person finder = people.findById(3L);
        Assert.assertEquals(ondia,finder);
    }

}
