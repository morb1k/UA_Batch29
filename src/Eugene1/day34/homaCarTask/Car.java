package Eugene1.day34.homaCarTask;

public abstract class Car {

    private final String make,model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        if(getMake() == null || getMake().isEmpty()){
            System.err.println(getMake()+" can not be null");
            System.exit(1);
        }
        this.make = getClass().getSimpleName();
        if(getModel() == null|| getModel().isEmpty()){
            System.err.println(getMake()+getModel()+" can not be null");
            System.exit(1);
        }
        this.model = model;
        setColor(color);
        if(year > 1986){
            System.err.println("Invalid year: "+year);
            System.exit(1);

        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color== null){
            System.err.println("color can not be null "+getColor());
            System.exit(1);
        }
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println(getMake()+" Ivalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.printf("Press the brake to stop "+getMake()+" "+model);
    }


    public String toString() {
        return getClass().getSimpleName()+
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using extend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */