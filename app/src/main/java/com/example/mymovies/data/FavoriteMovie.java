package com.example.mymovies.data;

import androidx.room.Entity;

@Entity(tableName = "favorite_movies")
public class FavoriteMovie extends Movie {
    public FavoriteMovie(int uniqueId , int id, int voteCount, String title, String originalTitle, String overview, String posterPath, String bigPosterPath, String backdropPath, double voteAverage, String releaseDate) {
        super(uniqueId , id, voteCount, title, originalTitle, overview, posterPath, bigPosterPath, backdropPath, voteAverage, releaseDate);
    }

    public FavoriteMovie(Movie movie){
        super(movie.getUniqueId() ,  movie.getId() , movie.getVoteCount(), movie.getTitle() , movie.getOriginalTitle() , movie.getOverview() , movie.getPosterPath() , movie.getBigPosterPath() ,movie.getBackdropPath() , movie.getVoteAverage() , movie.getReleaseDate());
    }
}
