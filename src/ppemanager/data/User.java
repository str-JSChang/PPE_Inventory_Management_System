/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppemanager.data;

/**
 *
 * @author Jason
 */

//We used a newer API,
//LocalDateTime is a API that latest, instead of using java.util.date, 
//it has more better format, and large greater features.
//such as:
//    Easier format/parsing. The API has its own format/parse methods
//    The API includes addition/subtraction operation (minusMinutes, plusDays, etc)



import java.time.LocalDateTime;
//encapsulations
public class User {

    private final int userId;
    private String name;
    private String password; //was trying to use hash generator to hash this password, set it into string first
    private UserType userType;
    private final LocalDateTime creationDate;
    private LocalDateTime lastLoginDate;

    
//    Constructor for when object of user is created, it can set initial account
    public User(int userId, String name, String password, UserType userType) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.userType = userType;
        this.creationDate = LocalDateTime.now();
    }
    
    public void updateLastLoginDate() {
        this.lastLoginDate = LocalDateTime.now();
    }
    
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    
    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public int getUserId() {
        return userId;
    }

//    Setter is removed because userId suppose to be Unique Identifier, it should be const.
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    
    
    
    
    
    
    
}
