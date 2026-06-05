class Dog{
    String name;
    int age;
    String breed;
    Dog(String name,int age,String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    public void Charcteristic(){
        System.out.println(name+" "+ "is Barking");
        System.out.println(name+ " " + "Spinning");
        System.out.println(name+ " " + "Running");
    }
}

public class p52 {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy",10,"German-Shepherd");
        d.Charcteristic();


    }
}
