package Person;

public class Instructor extends Person implements Teacher{
    public Instructor(Long id, String name) {
        super(id, name);
    }
    public Instructor(){
        super(null,null);
    }

    public void teach(Learner learner, double numberOfHours) {
       learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours){
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int x = 0; x < learners.length; x++){
            teach(learners[x],numberOfHoursPerLearner);
        }
    }
}
