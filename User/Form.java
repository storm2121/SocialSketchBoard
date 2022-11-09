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
    public String getEducation() {
        return Education;
    }
    public void setEducation(String education) {
        this.Education = education;
    }
    public String getExperience() {
        return Experience;
    }
    public void setExperience(String experience) {
        this.Experience = experience;
    }
    public String getSkills() {
        return Skills;
    }
    public void setSkills(String skills) {
        this.Skills = skills;
    }
    
}
