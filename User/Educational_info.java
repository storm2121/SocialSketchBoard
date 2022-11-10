package User;

public class Educational_info {
    public String latest_degree;
    public String Discipline;
    public int Grad_year;
    
    public Educational_info(String latest_degree, String discipline, int grad_year) {
        this.latest_degree = latest_degree;
        this.Discipline = discipline;
        this.Grad_year = grad_year;
    }


    @Override
    public String toString() {
        return "Educational_info [latest_degree=" + latest_degree + ", Discipline=" + Discipline + ", Grad_year="
                + Grad_year + "]";
    }


    public void update_edu_info(String latest_degree, String Discipline, int Grad_year)
    {
        this.latest_degree = latest_degree;          
        this.Grad_year = Grad_year;
        this.Discipline = Discipline;

    }
}
