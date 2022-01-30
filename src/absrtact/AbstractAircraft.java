package absrtact;

public class AbstractAircraft {
    protected static int count;
    protected int id;
    protected String model;
    protected Type type;


    public AbstractAircraft() {
    }

    public AbstractAircraft(int id, String model, String type) {
        this.id = id;
        this.model = model;
        this.type = Type.valueOf(type);
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
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
