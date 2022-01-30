package homework29;

import absrtact.Type;

public class Tu154 extends AbstractAircraft {
    public Tu154() {
        this.count = this.count ++;
        this.id = this.count;
        this.model = this.getClass().getSimpleName();
        this.type = this.getType();
    }


    @Override
    public String toString() {
        return "Tu154{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
