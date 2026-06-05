class Car{
    public String owner;
    public String Brand_name;
    public int serial_number;
    public int fuel;
    public boolean isRunning;
    public Car(String owner, String Brand_name, int serial_number, int fuel,boolean isRunning){
        this.owner = owner;
        this.Brand_name = Brand_name;
        this.serial_number = serial_number;
        this.fuel = fuel;
        this.isRunning = false;
    }
    public void Start(){
        if(fuel > 0){
            isRunning = true;
            System.out.println("Car is Running");
        }
        else{
            System.out.println("Car is NOT Running");
        }

    }
    public void Stop(){
        isRunning = false;
        System.out.println("Car is Stopped");
    }
    public void Consume(int x){
        fuel -= x;
    }

    public void CheckFuel(int fuel){
        if(fuel > 0){
            System.out.println("Fuel is Available" + fuel);
        }
    }
}

public class p51 {
    public static void main(String[] args) {
        Car cc = new Car("Shawon","Toyota",1003,100,false);
        cc.Start();
        cc.Consume(100);
        cc.Start();


    }
}
