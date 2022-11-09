package Posts;

public class Job_Op_Post extends Post {
    public String Job_title;
    public double Salary;

   public Job_Op_Post(String Post,String job_title, double salary) { // constructor
        super(Post); //comment
        this.Job_title = job_title;
        this.Salary = salary;
        // for date soon™
    }
    // public start date
    public String getJob_title() {
        return Job_title;
    }
    public void setJob_title(String job_title) {
        this.Job_title = job_title;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        this.Salary = salary;
    }
    @Override
    public String toString() {
        return "Job_Op_Post [job_title=" + Job_title + ", salary=" + Salary + ", post=" + Post + ", getJob_title()="
                + getJob_title() + ", getSalary()=" + getSalary() + ", toString()=" + super.toString() + "]";
    }
}
