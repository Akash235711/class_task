class Libarary{
    public String title;
    public String author;
    Libarary(String title, String author){
        System.out.println("The book is " + title + " Written by " + " " + author);

    }
    Libarary(String title){
        System.out.println("The book is" + title);
    }
}

public class p53 {
    public static void main(String[] args) {
        Libarary obj = new Libarary("Gupto", "BeNP");
        Libarary obj2 = new Libarary("Gupto");

    }
}
