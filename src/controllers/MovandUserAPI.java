package controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import models.Rating;
import models.Movie;
import models.User;
import utils.Serializer;

@SuppressWarnings("unused")
public class MovandUserAPI {
	
	//initialising Serializer
	  private Serializer serializer;
	  
	  private Map<Long,   User>   userIndex       = new HashMap<>();
	  private Map<String,   Movie> movieIndex       = new HashMap<>();
	  private Map<String,   Rating> ratingIndex       = new HashMap<>();
	  
	  
	  //creates a user using the User class in models and puts a userID in front of the user's information
	  public User createUser(String firstName, String lastName, int age, String gender, String occupation) 
	  {
	    User user = new User (firstName, lastName, age, gender, occupation);
	    userIndex.put(user.userID, user);
	    return user;
	  }
	  
	  //deletes a user by removing it by the userID
	  public void deleteUser(Long userID) 
	  {
	    User user = userIndex.remove(userID);
	  }
	  
	  //adds a movie by using  the Movie class in models 
	  public Movie addMovie(String title, int year, String url)
	  {
	    Movie movie = new Movie (title, year, url);
	    movieIndex.put(movie.title, movie);
	   return movie;
	  }
	  
	  //a getter method to retrieve a movie by title, using the movieIndex HashMap
	  public Movie getMovie(String title)
	  {
		  return movieIndex.get(title);
	  }
	  
	  //a getter method to retrieve a user's ratings on a movie, using the rating Index HashMap
	  public Rating getUserRatings(String rating)
	  {
		  return ratingIndex.get(rating);
	  }
	  
	  //A recommendation algorithm by using two users
/*	  public static Collection<int[]> getUserRecommendations(Collection<int[]> user1Ratings, Collection<int[]> user2Ratings)
	  {
	    // plot of x, y values. Where x is the rating user1 gave and y is the rating user2 gave for the same movie
	    Collection<int[]> collection = new Collection<int[]>();

	    for(int i = 0; i < user1Ratings.size(); i++)
	    {      
	      int movieId = user1Ratings.get(i)[1]; // get current movieID from user1's ratings

	      // check if movieId is in user2's ratings
	      for(int j = 0; j < user2Ratings.size(); j++)
	      {
	        if(movieId == user2Ratings.get(j)[1])
	        {
	          // same movie found so add it to collection
	          int[] value = {movieId, user1Ratings.get(i)[2], user2Ratings.get(j)[2]}; // [movieId, user1 rating, user2 rating]
	          collection.add(value);
	          break; // break inner loop and check for other movies
	        }
	      } // END inner for loop

	    } // END outer for loop

	    return collection ;
	  }*/

	  //implement algorithm to get the top ten movies
	  public void  getTopTenMovies()
	  {
	  
	  }
	  //a getter for all users using the userIndex HashMap
	  public Collection<User> getUsers ()
	  {
	    return userIndex.values();
	  }
	  
	  //a method to delete all users using the userIndex HashMap
	  public void deleteUsers() 
	  {
	    userIndex.clear();
	  }
	  
	  @SuppressWarnings("unchecked")
	  //Serializer reads/loads in userIndex, movieIndex and ratingIndex 
	  public void load() throws Exception
	  {
	    serializer.read();
	    userIndex       = (Map<Long, User>)     serializer.pop();
	    movieIndex      = (Map<String, Movie>)  serializer.pop();
	    ratingIndex     = (Map<String, Rating>)  serializer.pop();
	  }

}
