package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Rating {
	//Declare variables
	  public String userID;
	  public String movieID;
	  public String rating;
	//Constructor (
public Rating()
{
	this.getClass().getResource("ratings.dat");
}

public Rating(String userID, String movieID, String rating)
{
  this.userID = userID;
  this.movieID = movieID;
  this.rating = rating;
}
//)
@Override  
public int hashCode()  
{  
   return Objects.hashCode(this.userID, this.movieID, this.rating);  
}

@Override
public String toString()
{
  return toStringHelper(this).addValue(userID)
  		                   .addValue(movieID)
                             .addValue(rating)
                             .toString();
}


}