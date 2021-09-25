public class StudentManagements {
    Students[] students = new Students[100];
    int count = 0;
    String[] Groups = new String[100];
    int cou = 0;
    public static boolean sameGroup(Students s1, Students s2) {
        if (s1.getGroup() == s2.getGroup()) {
            return true;
        } else {
            return false;
        }
    }
    public void addStudent(Students newStudent)
    {   boolean kt = false;
        students[count] = newStudent;
        count++;
        if ( cou == 0 ){
            Groups[cou] = newStudent.getGroup();
            cou++;
        }
        else{
            for (int i = 0 ;i < cou;i++ ){
                if( newStudent.getGroup() == Groups[i] ){
                    kt = true;
                    break;
                }
            }
            if( kt == false ) {
                Groups[cou] = newStudent.getGroup();
                cou++;
            }
        }

    }
    public String studentsByGroup() {
        String result = "";
        if( count == 0) {
            return "No";
        }
        else {
            for (int i = 0; i < cou; i++) {
                result = result + Groups[i] + "\n";
                for (int j = 0; j < count; j++) {
                    if (students[j].getGroup() == Groups[i]) {
                        result = result + students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return result;
    }

    public void removeStudent(String id) {
        for ( int i=0; i < count; i++){
            if( students[i].getId() == id){
                for( int j = i; j < count-1 ; j++){
                    students[j] = students[j+1];
                }
                count--;
                break;
            }
        }

    }
    public static void main(String[] args) {
        Students s1 = new Students("Long","20020499","20020499@vnu.edu.vn");
        Students s2 = new Students("Hoang","20020413","20020413@vnu.edu.vn");
        Students s3 = new Students();
        Students s4 = new Students();
        StudentManagements listStudent = new StudentManagements();
        listStudent.addStudent(s1);
        listStudent.addStudent(s2);
        s3.setName("viet");s4.setName("D");
        s3.setGroup("K65CD");s4.setGroup("K65CD");
        s3.setId("20020987");s4.setId("20020418");
        listStudent.addStudent(s3);
        listStudent.addStudent(s4);
        System.out.println(listStudent.studentsByGroup());
        System.out.println(listStudent.count);
        System.out.println(listStudent.cou);
        listStudent.removeStudent("20020413");
        System.out.println(listStudent.studentsByGroup());
        listStudent.addStudent(s4);
        System.out.println(listStudent.studentsByGroup());
        listStudent.removeStudent("20020437");
        System.out.println(listStudent.studentsByGroup());
        System.out.println(listStudent.count);
        System.out.println(listStudent.cou);
    }

}
