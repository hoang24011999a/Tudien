public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    Student[] students = new Student[100];
    int count = 0;
    String[] groups = new String[100];
    int cou = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } else {

            return false;
        }
    }

    public void addStudent(Student newStudent) {
        // TODO:
        boolean kt = false;
        students[count] = newStudent;
        count++;
        if (cou == 0) {
            groups[cou] = newStudent.getGroup();
            cou++;
        } else {
            for (int i = 0; i < cou; i++) {
                if (newStudent.getGroup().equals(groups[i])) {
                    kt = true;
                    break;
                }
            }
            if (kt == false) {
                groups[cou] = newStudent.getGroup();
                cou++;
            }
        }
    }

    public String studentsByGroup() {
            // TODO:
            if (count > 0) {
                String result = "";
                for (int i = 0; i < cou; i++) {
                    result = result + groups[i] + "\n";
                    for (int j = 0; j < count; j++) {
                        if (students[j].getGroup().equals(groups[i])) {
                            result = result + students[j].getInfo() + "\n";
                        }
                    }
                }
                return result;
            }
            return null;
    }

    public void removeStudent(String id) {
            // TODO:
            for (int i = 0; i < count; i++) {
                if (students[i].getId().equals(id)) {
                    for (int j = i; j < count - 1; j++) {
                        //students[j] = new Student(students[j + 1]);
                        students[j] = students[j + 1];
                    }
                    count--;
                    break;
                }
            }
    }

}
