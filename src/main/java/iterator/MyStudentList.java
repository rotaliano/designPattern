package iterator;

import java.util.Iterator;

public class MyStudentList extends StudentList implements Aggregate {

    public MyStudentList() {
        super();
    }

    public MyStudentList(int studentCount) {
        super(studentCount);
    }

    @Override
    public Iterator<Student> iterator() {
        return (Iterator) new MyStudentListIterator(this);
    }
}
