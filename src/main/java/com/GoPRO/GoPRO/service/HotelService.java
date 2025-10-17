package com.GoPRO.GoPRO.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.GoPRO.GoPRO.entity.HotelDTO;

@Service
public class HotelService {

    public List<HotelDTO> getHotels(double budget, String location, int days, String date) {
        List<HotelDTO> hotels = new ArrayList<>();

        // Mock hotel data 💡
        hotels.add(new HotelDTO("Ocean View Resort", "Goa", 4.5, 3500));
        hotels.add(new HotelDTO("Beachside Bliss", "Goa", 4.8, 3800));
        hotels.add(new HotelDTO("Lakeview Palace", "Bhopal", 4.2, 3000));
        hotels.add(new HotelDTO("Royal Comfort", "Bhopal", 4.0, 2500));
        hotels.add(new HotelDTO("Pune Central Inn", "Pune", 4.3, 2800));
        hotels.add(new HotelDTO("Hilltop Retreat", "Pune", 4.1, 3200));
        hotels.add(new HotelDTO("City Central Inn", "Bangalore", 4.0, 2000));
        hotels.add(new HotelDTO("Budget Comforts", "Bangalore", 3.5, 1200));
        hotels.add(new HotelDTO("Bangalore Grand Stay", "Bangalore", 4.6, 4000));
        hotels.add(new HotelDTO("Chennai Seaside Hotel", "Chennai", 4.5, 3500));
        hotels.add(new HotelDTO("Marina View Inn", "Chennai", 4.2, 2700));
        hotels.add(new HotelDTO("Mysore Heritage Stay", "Mysore", 4.7, 3000));
        hotels.add(new HotelDTO("Palace View Retreat", "Mysore", 4.4, 2800));
        hotels.add(new HotelDTO("Sunset Sands Hotel", "Goa", 4.2, 3200));
        hotels.add(new HotelDTO("Hilltop Retreat", "Munnar", 4.2, 2700));
        hotels.add(new HotelDTO("Misty Mountains Inn", "Munnar", 4.6, 3000));
        hotels.add(new HotelDTO("City Central Inn", "Bangalore", 4.0, 2000));
        hotels.add(new HotelDTO("Budget Comforts", "Bangalore", 3.5, 1200));
        hotels.add(new HotelDTO("Luxury Stay Bangalore", "Bangalore", 4.7, 4500));
        hotels.add(new HotelDTO("Lake Palace Stay", "Udaipur", 4.7, 4200));
        hotels.add(new HotelDTO("Heritage Hotel Udaipur", "Udaipur", 4.3, 3700));
        hotels.add(new HotelDTO("Desert Oasis", "Jaisalmer", 4.5, 3800));
        hotels.add(new HotelDTO("Fort View Inn", "Jaisalmer", 4.1, 3300));
        hotels.add(new HotelDTO("Hyderabad Grand", "Hyderabad", 4.4, 2900));
        hotels.add(new HotelDTO("Nizam Comforts", "Hyderabad", 4.0, 2500));
        hotels.add(new HotelDTO("Taj Residency", "Delhi", 4.8, 5000));
        hotels.add(new HotelDTO("Capital Inn", "Delhi", 4.2, 3200));
        hotels.add(new HotelDTO("Connaught Plaza", "Delhi", 4.1, 2800));
        hotels.add(new HotelDTO("Chennai Bay Hotel", "Chennai", 4.3, 3100));
        hotels.add(new HotelDTO("Marina Stay", "Chennai", 4.0, 2600));
        hotels.add(new HotelDTO("Kolkata Comforts", "Kolkata", 4.2, 2700));
        hotels.add(new HotelDTO("Howrah Riverside", "Kolkata", 4.5, 3300));
        hotels.add(new HotelDTO("Marine View Mumbai", "Mumbai", 4.5, 3800));
        hotels.add(new HotelDTO("Gateway Inn", "Mumbai", 4.0, 2700));
        hotels.add(new HotelDTO("Bandra Comfort Stay", "Mumbai", 3.8, 2200));
        hotels.add(new HotelDTO("Colaba Heritage Hotel", "Mumbai", 4.7, 4500));
        hotels.add(new HotelDTO("Juhu Beach Resort", "Mumbai", 4.6, 4000));
        hotels.add(new HotelDTO("Ernakulam Riverside Hotel", "Ernakulam", 4.3, 2500));
        hotels.add(new HotelDTO("Cochin Comfort Inn", "Ernakulam", 4.0, 2200));
        hotels.add(new HotelDTO("Trivandrum Beach Resort", "Trivandrum", 4.6, 3300));
        hotels.add(new HotelDTO("Capital Stay", "Trivandrum", 4.2, 2800));

        // Filter by budget and location
        return hotels.stream()
                .filter(h -> h.getPricePerNight() * days <= budget && h.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }
}
