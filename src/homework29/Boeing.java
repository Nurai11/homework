package homework29;

import absrtact.Type;

public class Boeing extends AbstractAircraft{
    public Boeing() {
        this.count = this.count ++;
        this.id = this.count;
        this.model = this.getClass().getSimpleName();
        this.type = getType();
    }


    @Override
    public String toString() {
        return "Boeing{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
