/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

/**
 *
 * @author ronsilva
 */


import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "automobile")
public class Automobile implements Serializable {

    /**id an identity type field in the database and the primary key */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private String year;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;
    
    @Column(name = "body")
    private String body;
    
    @Column(name = "color")
    private String color;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
     public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

      public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
 
    @Override
    public String toString() {
        return Integer.toString(id) + " " + year + " " + make + " " + model+ " " + body+ " " + color;
}
}