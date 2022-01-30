package homework29;


public abstract class AbstractAircraft {
    protected static int count;
    protected int id;
    protected String model;
    protected String type;


    public AbstractAircraft() {
    }

    public AbstractAircraft(int id, String model, String type) {
        this.id = id;
        this.model = model;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AbstractAircraft{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
