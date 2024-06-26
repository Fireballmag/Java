package models;

import jakarta.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "autos")
public class Auto {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autos_seq")
    @SequenceGenerator(name = "autos_seq", sequenceName = "autos_seq", allocationSize = 1)
    private Integer id;
    private String model;
    private String color;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    public Auto() {
    }
    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public int getId() {
        return id;
    }
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
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return id == auto.id &&
                model.equals(auto.model) &&
                color.equals(auto.color) &&
                user.equals(auto.user);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, user);
    }
    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", user=" + user +
                '}';
    }
}
