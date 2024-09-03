package com.ajaz.microservices.ratingservice.services;

import com.ajaz.microservices.ratingservice.models.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);

    List<Rating> getAllRatings();

    List<Rating> getRatingsByUserId(String userId);

    List<Rating> getRatingsByHotelId(String hotelId);
}
