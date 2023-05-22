package springboot.pojo;

import springboot.pojo.Transport;

import java.util.Objects;

public class Driver {
    private String name;
    private Transport transport;
    public void getReadyToWork() {
        System.out.println(transport + " готов к работе");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(transport, driver.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transport);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
