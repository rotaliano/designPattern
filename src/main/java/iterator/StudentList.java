package iterator;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StudentList {
    protected Student[] students;
    private int last = 0;

    public StudentList(int studentCount) {
        this.students = new Student[studentCount];
    }

    public void add(Student student) {
        students[last] = student;
        last++;
    }

    public int getLastNum() {
        return this.last;
    }

    public Student getStudentAt(int n) {
        return this.students[n];
    }
}
