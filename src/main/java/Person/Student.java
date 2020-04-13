package Person;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(long id, String name) {
        super(id,name);
        totalStudyTime = 0.0;
    }
    public Student(){
        super(null,null);
        totalStudyTime = 0.0;
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime = totalStudyTime + numberOfHours;
    }
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }





}
