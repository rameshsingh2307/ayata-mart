package com.ayata.ayatamart.model;
import lombok.Builder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private  long employeeid;
    @NotBlank
    @Column
    private  String username;
    @NotBlank
    @Column
    private  String password;


    public User() {
    }
    public User(@NotBlank String username,
                @NotBlank String password) {
        this.username = username;
        this.password = password;
        //this.loggedIn = false;
    }
    public long getEmployeeid() {
        return employeeid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(employeeid, username, password);
    }
    @Override
    public String toString() {
        return "User{" +
                "employeeid=" + employeeid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

