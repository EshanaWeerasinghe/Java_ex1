package ex2;
/**
 *
 * @author WEERASINGHE
 */
public class Employee {

    private String name;
    private int idNumber;
    private String jobTitle;
    private Department department;

    public Employee(String name, int idNumber, String jobTitle, Department department) {
        this.name = name;
        this.idNumber = idNumber;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return String.format("\nName:%s\nEmployee ID:%d\nDepartment:%s\nPosition:%s\n",name,idNumber,department,jobTitle);
    }

}
