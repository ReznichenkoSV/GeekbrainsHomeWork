package com.geekbrains.test.java0.lesson03.home01;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Storage {
    ArrayList _myArray;
    HashSet<Member> _myHashMap;

    Storage(){
        _myArray = new ArrayList();
        _myHashMap = new HashSet<>();
    }

    void addMember(Member member) {
        member.add();
        _myArray.add(member);
        _myHashMap.add(member);
    }

    void start() {
        Scanner sc = new Scanner(System.in);

        do {
            if (sc.hasNextInt()) {
                switch (sc.nextInt()) {
                    case 0:
                        return;
                    case 1:
                        Student student = new Student();
                        addMember(student);
                        break;
                    case 2:
                        Teacher teacher = new Teacher();
                        addMember(teacher);
                        break;
                    default:
                        break;
                }
            } else {
                sc.nextLine();
                System.out.println("Неверный формат введенного числа. Должно быть целое число");
            }
        }
        while (true);
    }
}
