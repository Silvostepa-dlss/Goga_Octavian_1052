package Collections;

public class Student {
    String name = "N/A";
    int grade = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Student student = (Student)obj;
            return this.grade == student.grade;
        } else {
            return false;
        }
    }
}
