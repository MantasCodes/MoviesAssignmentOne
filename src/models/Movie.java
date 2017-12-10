package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Movie {
//Declare variables
	  public String title;
	  public int year;
	  public String url;

//Constructor (
public Movie()
{
	this.getClass().getResource("Movie.dat");
}

public Movie(String title, int year, String url)
{
  this.title = title;
  this.year = year;
  this.url = url;
}
//)
@Override  
//HashMap constructor
public int hashCode()  
{  
   return Objects.hashCode(this.title, this.year, this.url);  
}

@Override
//Converts variables to String
public String toString()
{
  return toStringHelper(this).addValue(title)
  		                   .addValue(year)
                             .addValue(url)
                             .toString();
}


}