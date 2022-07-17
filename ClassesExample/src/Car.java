public class Car {
    private String name;
    private int quarterMileTimeInTenthsOfSeconds;

    public Car(String name, int quarterMileTimeInTenthsOfSeconds) {
        this.name = name;
        this.quarterMileTimeInTenthsOfSeconds = quarterMileTimeInTenthsOfSeconds;
    }

    public String getName() {
        return name;
    }

    public int getQuarterMileTimeInTenthsOfSeconds() {
        return quarterMileTimeInTenthsOfSeconds;
    }

    public String race(Car otherCar){
        if ( quarterMileTimeInTenthsOfSeconds > otherCar.getQuarterMileTimeInTenthsOfSeconds()){
            return name + " lost to " + otherCar.getName();
        }
        else if ( quarterMileTimeInTenthsOfSeconds == otherCar.getQuarterMileTimeInTenthsOfSeconds()){
            return name + " ties with " + otherCar.getName();
        }
        else{
            return name + " beats " + otherCar.getName();
        }
    }
}
