package Person;

import Person.Instructor;
import Person.Person;
import Person.Teacher;
import org.junit.Assert;
import org.junit.Test;

import javax.sound.sampled.FloatControl;
import java.util.List;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheretance(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor();
        Learner learner =  new Student();
        Double input = 10.0;
        Double expected = 10.0;
        instructor.teach(learner,input);
        Double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLecture(){
    Instructor instructor = new Instructor();
    Learner[] learners = new Student[]{new Student(),new Student(),new Student()};
    Double input = 15.0;
    Double expected = 5.0;
    instructor.lecture(learners,input);
    Double actual = learners[0].getTotalStudyTime();
    Assert.assertEquals(expected,actual);
    }

}
