package scaler.lld1.comparisions;

import java.util.Comparator;

public class PspComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.psp > o2.psp) {
            return 1;

            // o2....o1
        }
        if (o1.psp < o2.psp) {
            return -1;
        }
        return 0;
    }

}
