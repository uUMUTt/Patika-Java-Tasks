
public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }

    public double calculateNote(int n1, int n2) {
        if (prefix.equals("MAT")) {
            return n1 * 0.8 + n2 * 0.2;
        }else if(prefix.equals("FZK")){
            return n1 * 0.7 + n2 * 0.3;
        }else if(prefix.equals("KMY")){
           return n1 * 0.6 + n2 * 0.4;
        }else{
            return 0;
        }
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
