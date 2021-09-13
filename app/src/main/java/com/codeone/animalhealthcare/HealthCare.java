package com.codeone.animalhealthcare;

import android.provider.ContactsContract;

import com.google.firebase.auth.EmailAuthCredential;

public class HealthCare {
    private String Name;
    private Integer Age;
    private Long contact;
    private String Email;
    private String Password;

    public HealthCare() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
