package iterator;

/**
 * https://www.techscore.com/tech/DesignPattern/Iterator/Iterator1.html/
 */
public class IteratorTest {
    public static void main(String[] args) {
        Teacher you = new MyTeacher();
        you.createStudentList();
        you.callStudents();
    }
}
