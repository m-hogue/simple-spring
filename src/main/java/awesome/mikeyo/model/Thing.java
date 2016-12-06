package awesome.mikeyo.model;

import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * Simple model object with a few attributes
 */
public class Thing {
    private String name;
    private String value;
    private Integer number;

    public String getName() {
        return name;
    }

    public Thing setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Thing setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Thing setNumber(Integer number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("value", value)
                .add("number", number)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Thing thing = (Thing) o;
        return Objects.equals(getName(), thing.getName()) &&
                Objects.equals(getValue(), thing.getValue()) &&
                Objects.equals(getNumber(), thing.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getValue(), getNumber());
    }
}
