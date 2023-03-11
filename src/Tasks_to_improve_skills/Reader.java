package Tasks_to_improve_skills;

public class Reader {

    private String fullName;

    private int number;

    private String faculty;

    private int date_of_birth;

    public String getFullName(){
        return this.fullName;
    }

    public int getNumber(){
        return this.number;
    }

    public String getFaculty(){
        return this.faculty;
    }

    public int getDate_of_birth(){
        return this.date_of_birth;
    }

    protected Reader(String fullName){
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.date_of_birth = date_of_birth;
    }

    Reader(){};


    public String takeBook(int mountOfBooks){
        return(getFullName()+" ���� "+mountOfBooks+" �����");
    }

    public String takeBook(String...nameOfBooks){
        String s = "";
        for(int i = 0;i<nameOfBooks.length;i++){
            s+=nameOfBooks[i]+" ";
        }
        return (getFullName()+" ���� �����: "+s);
    }

    public String takeBook(Book...books){
        String q = "";
        for(int i = 0;i<books.length;i++){
            q+=books[i]+" ";
        }
        return(getFullName()+" ���� �����: "+q);
    }



    public static void main(String[] args) {
        Reader p1 = new Reader("������ �.�");
        System.out.println(p1.takeBook(3));
        System.out.println(p1.takeBook("���� �������� ������,","����� ������"));
        Book qs = new Book("����� ������","J.K.Rouling");
        Book qs2 = new Book("d","s");
        System.out.println(p1.takeBook(qs,qs2));
    }



}
