package com.ayata.ayatamart.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Authentication")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private  long id;
    @NotBlank
    @Column
    private  String token;
    @NotBlank
    @Column
    private  long timestamp;
    @NotBlank

    private  long employeeid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getEmployeeid() {
        return employeeid;
    }

    public Token() {
    }

    public Token(long id, String token, long timestamp, long employeeid) {
        this.id = id;
        this.token = token;
        this.timestamp = timestamp;
        this.employeeid = employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }


}
