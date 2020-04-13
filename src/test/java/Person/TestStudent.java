package Person;

import Person.Learner;
import Person.Person;
import Person.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student testStudent = new Student();
        Assert.assertTrue(testStudent instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student testStudent = new Student();
        Assert.assertTrue(testStudent instanceof Person);
    }
    @Test
    public void testLearn(){
        Student testStudent = new Student();
        Double in = 10.0;
        Double expected = 10.0;
        testStudent.learn(in);
        Double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }

}
