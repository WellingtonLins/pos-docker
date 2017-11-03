package br.com.wl.docker.model;

import java.io.Serializable;

/**
 * Document Person
 *
 * @author Wellington Lins Claudino Duarte
 * @mail wellingtonlins2013@gmail.com
 */
public class Person implements Serializable{

    private String id;
    private String name;

    public Person() {
    }

    
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id= " + id + ", name= " + name + "\n";
    }  
      
}
