package springboot.pojo;

import java.util.Objects;

public abstract class Transport {
    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
