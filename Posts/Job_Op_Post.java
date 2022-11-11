package Posts;

import java.util.GregorianCalendar;

public class Job_Op_Post extends Post {
    public String Job_title;
    public double Salary;

   public Job_Op_Post(String Post,String job_title, double salary,GregorianCalendar Date) { // constructor
        super(Post,Date); //comment
        this.Job_title = job_title;
        this.Salary = salary;
        // for date soon™
    }
    // public start date

@Override
public String toString() {
    return "Job_Op_Post [Job_title=" + Job_title + ", Salary=" + Salary + "]";
}
   
   
}
