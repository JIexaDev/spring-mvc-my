package web.model;

public class Car {
    private int id;
    private String model;
    private int series;

    public Car(int id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car: Id - " + id + "; model - " + model + "; series - " + series;
    }
}
