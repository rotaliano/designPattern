package iterator;

import lombok.NoArgsConstructor;

import java.util.Iterator;

@NoArgsConstructor
public class MyTeacher extends Teacher {

    @Override
    public void createStudentList() {
        studentList = new MyStudentList(5);
        studentList.add(new Student("赤井亮太", 1));
        studentList.add(new Student("赤羽里美", 2));
        studentList.add(new Student("岡田美央", 2));
        studentList.add(new Student("西森俊介", 1));
        studentList.add(new Student("中ノ森玲菜", 2));
    }

    @Override
    public void callStudents() {
        Iterator<Student> itr = studentList.iterator();
        while(itr.hasNext()){
            System.out.println((itr.next()).getName());
        }
    }
}
