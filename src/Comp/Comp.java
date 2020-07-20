package Comp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Comp {

    public static void main(String[] args) {
        List<Student> result = generateNamesAndFillIst();
        for (Student s : result) {
            System.out.println(s.getId() + " \t "+s.getName());
        }
        System.out.println("=============================================");
        result = result.stream().sorted(new StudentComparator()).collect(Collectors.toList());
        for(Student s: result) {
            System.out.println(s.getId() + " \t "+s.getName());
        }

    }

    private static List<Student> generateNamesAndFillIst() {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        List<Student> result = new ArrayList<>();

        for (int i = 0; i < randomInt; i++) {
            StringBuilder name = new StringBuilder();
            for (int j = 0; j < 10; j++) {
                int alpha = r.nextInt((90 - 65) + 1) + 65;
                name.append((char) alpha);
            }
            result.add(new Student(name.toString(),i));
        }
        return result;
    }
}

//return r.nextInt((max - min) + 1) + min;