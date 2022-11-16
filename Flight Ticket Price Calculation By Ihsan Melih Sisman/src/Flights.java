public class Flights {



    /*
    Make a program that calculates air ticket prices according to distance and conditions with Java. Get Distance (KM),
    age and trip type (One Way, Round-Round) information from the user. Take the fare per distance as 0.10 TL / km. First,
    calculate the total price of the flight and then apply the following discounts to the customer according to the conditions;

       Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2). Otherwise,
        "You Have Entered Wrong Data!" A warning should be given.
        If the person is younger than 12 years old, 50% discount is applied on the ticket price.
        If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
        If the person is over 65 years old, a 30% discount is applied on the ticket price.
        If the person has chosen the "Journey Type" round trip, 20% discount is applied on the ticket price.

      */



    double kilometers;
    int age;
    int flightType;
    double price = 0;

    public Flights() {
        this.kilometers = kilometers;
        this.age = age;
        this.flightType = flightType;
    }

    double calculatePerKmWithRules(double kilometers, int age) {
        price = kilometers * 0.10;
        if (age < 12) {
            price = price / 2;
        } else if (age >= 12 && age <= 24) {
            price = price - (price * 0.10);
        } else if (age > 65) {
            price = price - (price * 0.30);
        }
        return price;
    }

    void check(double kilometers, int age, int flightType) {
        if (kilometers <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        } else if (age <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        } else if (flightType != 1 && flightType != 2) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;

        }
    }

    double checkFlighTypeDiscount(int flightType) {
        if (flightType == 2) {
            price = price - (price * 0.20);
            price = price * 2;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "kilometers=" + kilometers +
                ", age=" + age +
                ", flightType=" + flightType +
                ", price=" + price +
                '}';
    }
}




