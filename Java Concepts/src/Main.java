// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Student {
    private int id;
    private String name;

    int getId(){
        return id;
    }
    void setId(int id){
        this.id = id;
    }
        Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "id: "+id+" name: "+name;
    }
}
class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Harish");
        Student s2 = new Student(101, "Raghav");
        s2.setId(105);
        System.out.println(s1.getId());
        System.out.print(s2);
    }
}
