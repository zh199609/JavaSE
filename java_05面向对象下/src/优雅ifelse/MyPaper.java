package 优雅ifelse;

public class MyPaper {
    private AgeState age;

    public MyPaper() {
    }

    public MyPaper(AgeState age) {
        super();
        this.age = age;
    }

    public AgeState getAge() {
        return age;
    }

    public void setAge(AgeState age) {
        this.age = age;
    }
    
    public void printAge() {
        age.state();
    }
    
    
}
