public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName() {
        return name;
    }

    public void setName(String n) {

        this.name = n;
    }

    public String getId() {

        return id;
    }

    public void setId(String n) {

        this.id = n;
    }
    public String getGroup() {

        return group;
    }

    public void setGroup(String n) {

        this.group = n;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String n) {

        this.email = n;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param name
     * @param id
     * @param email
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    String getInfo() {
        // TODO:
        return name + " - " + id + " - " + group + " - " + email;
    }

}
