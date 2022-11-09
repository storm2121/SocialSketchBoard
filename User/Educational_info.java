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

    public String getLatest_degree() {
        return latest_degree;
    }
    public void setLatest_degree(String latest_degree) {
        this.latest_degree = latest_degree;
    }
    public String getDiscipline() {
        return Discipline;
    }
    public void setDiscipline(String discipline) {
        this.Discipline = discipline;
    }
    public int getGrad_year() {
        return Grad_year;
    }
    public void setGrad_year(int grad_year) {
        this.Grad_year = grad_year;
    }
    public void update_edu_info(String latest_degree, String Discipline, int Grad_year)
    {
        this.latest_degree = latest_degree;          
        this.Grad_year = Grad_year;
        this.Discipline = Discipline;

    }
}
