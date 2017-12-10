package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class User {

	  static Long   counter = 0l;
	//Declare variable
	  public Long   userID;
	  public String firstName;
	  public String lastName;
	  public int age;
	  public String gender;
	  public String occupation;
		//Constructor (
public User()
{
	this.getClass().getResource("users.dat");
}

public User(String firstName, String lastName, int age, String gender, String occupation)
{
  this.userID        = counter++;
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
  this.gender = gender;
  this.occupation = occupation; 
}
//)
@Override  
public int hashCode()  
{  
   return Objects.hashCode(this.lastName, this.firstName, this.age, this.gender,this.occupation);  
}

@Override
public String toString()
{
  return toStringHelper(this).addValue(userID)
  		                   .addValue(firstName)
                             .addValue(lastName)
                             .addValue(age)
                             .addValue(gender)
                             .addValue(occupation)
                             .toString();
}


}
