public class Lasagna {

    public int expectedMinutesInOven(){

        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes){

        return expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int layers){

        return 2*layers;
    }

    public int totalTimeInMinutes(int layers, int MinutesInOven){

        return preparationTimeInMinutes(layers) + MinutesInOven;
    }
    
}
