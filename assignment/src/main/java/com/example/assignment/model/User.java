package com.example.assignment.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String firstName;
    private String middleName;
    private String lastName;

    @Column(nullable = false)
    private String password;

    private String email;
    private String contact;
    private Date expirationDate;
    private String description;
    private Integer timeout;
    private String datetimeFormat;
    private String roleName;
    private String scopeName;
    private String primaryGroupName;
    private String secondaryGroupName;
    private String language;
    private String organization;
    private String timezone;
    private String memo;

    public User(Long id, String username, String firstName, String middleName, String lastName, String password, String email, String contact, Date expirationDate, String description, Integer timeout, String datetimeFormat, String roleName, String scopeName, String primaryGroupName, String secondaryGroupName, String language, String organization, String timezone, String memo) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.expirationDate = expirationDate;
        this.description = description;
        this.timeout = timeout;
        this.datetimeFormat = datetimeFormat;
        this.roleName = roleName;
        this.scopeName = scopeName;
        this.primaryGroupName = primaryGroupName;
        this.secondaryGroupName = secondaryGroupName;
        this.language = language;
        this.organization = organization;
        this.timezone = timezone;
        this.memo = memo;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getDatetimeFormat() {
        return datetimeFormat;
    }

    public void setDatetimeFormat(String datetimeFormat) {
        this.datetimeFormat = datetimeFormat;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public String getPrimaryGroupName() {
        return primaryGroupName;
    }

    public void setPrimaryGroupName(String primaryGroupName) {
        this.primaryGroupName = primaryGroupName;
    }

    public String getSecondaryGroupName() {
        return secondaryGroupName;
    }

    public void setSecondaryGroupName(String secondaryGroupName) {
        this.secondaryGroupName = secondaryGroupName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }


}
