package org.launchcode.java.exercises.class7;

/**
 * Created by Rebecca on 4/1/2017.
 */
public abstract class AbstractEntity {

    private int id;
    private int nextId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = nextId;
        nextId++;
    }
}
