package com.example.todolist;

import java.util.UUID;
import java.util.Date;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task(){
       id = UUID.randomUUID();
       date = new Date();
    }

    public UUID getId()
    {
        return id;
    }

    public void setName(String s)
    {
        name=s;
    }

    public String getName()
    {
        return name;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDone(boolean b)
    {
        done = b;
    }

    public boolean isDone()
    {
        return done;
    }

}
