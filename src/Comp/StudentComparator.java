package Comp;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String s1 = o1.getName();
        String s2 = o2.getName();
        int l1 = 0;
        int l2 = 0;

        for (int i = 0; i < s1.length(); i++) {
            l1 += s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            l2 += s2.charAt(i);
        }
        if (l1 > l2) {
            return 1;
        } else if (l1 == l2) {
            return 0;
        } else {
            return -1;
        }
    }
}
