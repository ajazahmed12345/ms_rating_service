package com.ajaz.microservices.ratingservice.services;

import com.ajaz.microservices.ratingservice.models.Rating;
import com.ajaz.microservices.ratingservice.repositories.RatingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RatingServiceImplTest {

    @InjectMocks
    private RatingServiceImpl ratingService;

    @Mock
    private RatingRepository ratingRepository;

    @Test
    public void testCreateRating(@Mock Rating rating) {
        ratingService.createRating(rating);
    }

    @Test
    public void testGetAllRatings() {
        ratingService.getAllRatings();
    }

    @Test
    public void testGetRatingsByUserId() {
        String userId = "1";
        List<Rating> ratings = new ArrayList<>();
        Mockito.when(ratingRepository.findAllByUserId(Mockito.anyString())).thenReturn(ratings);
        ratingService.getRatingsByUserId(userId);
    }

    @Test
    public void testGetRatingsByHotelId() {
        String hotelId = "2";
        List<Rating> ratings = new ArrayList<>();
        Mockito.when(ratingRepository.findAllByHotelId(Mockito.anyString())).thenReturn(ratings);
        ratingService.getRatingsByHotelId(hotelId);
    }
}