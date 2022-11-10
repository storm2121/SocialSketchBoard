package User;

public class Form {
    public String Education;
    public String Experience;
    public String Skills;
    
    public Form(String education, String experience, String skills) {
        this.Education = education;
        this.Experience = experience;
        this.Skills = skills;
    }

    @Override
    public String toString() {
        return "Form [Education=" + Education + ", Experience=" + Experience + ", Skills=" + Skills + "]";
    }
   
    
}
