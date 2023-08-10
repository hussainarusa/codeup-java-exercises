
package students;

        import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public void addGrades(ArrayList<Integer> grades){
        this.grades.addAll(grades);
    }

    public double getGradeAverage(){
        double total = 0;
        for(int grade : this.grades){
            total += grade;
        }
        return total / grades.size();
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
}
