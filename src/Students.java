public class Students {
//hoang.
        private String name;
        private String id;
        private String group;
        private String email;

        public String getName(){
            return name;
        }
        public void setName(String n){
            this.name=n;
        }
        public String getId(){
            return id;
        }
        public void setId(String n){
            this.id=n;
        }
        public String getGroup(){
            return group;
        }
        public void setGroup(String n){
            this.group=n;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String n){
            this.email=n;
        }
        //Nguyen Van An – 17020001 – K62CC – 17020001@vnu.edu.vn
        String getInfo()
        {
            return name + " - " + id + " - " + group + " - " + email;
        }
        Students()
        {
            name = "Student";
            id = "000";
            group = "K62CB";
            email = "uet@vnu.edu.vn";
        }
        Students(String name, String id, String email)
        { this.name = name;
            this.id = id;
            this.group = "K62CB";
            this.email = email;
        }
        Students(Students s){
            this.name = s.name;
            this.id = s.id;
            this.group = s.group;
            this.email = s.email;
        }

        public static void main(String[] args) {
            Students st = new Students("hoang","20020413","20020413@gmail.com");
            System.out.println(st.getInfo());
            Students s = new Students();
            s.setName("hoang");
            s.setGroup("k65CC");
            System.out.println(s.getInfo());
        }




}
