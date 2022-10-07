package com.mg.ultimate.app.demo.controller;

import com.mg.ultimate.app.demo.dto.ThemeParkRide;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/ride")
public class ThemeParkRideController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ThemeParkRide> getThemeRides() {
        ThemeParkRide themeParkRide1 = ThemeParkRide.builder()
                .rideName("ride1")
                .description("ride1-desc")
                .minAge(6)
                .minHeight(120)
                .thrillFactor("Easy")
                .build();

        ThemeParkRide themeParkRide2 = ThemeParkRide.builder()
                .rideName("ride2")
                .description("ride2-desc")
                .minAge(15)
                .minHeight(150)
                .thrillFactor("Medium")
                .build();

        ThemeParkRide themeParkRide3 = ThemeParkRide.builder()
                .rideName("ride3")
                .description("ride3-desc")
                .minAge(18)
                .minHeight(150)
                .thrillFactor("Extreme")
                .build();

        return List.of(themeParkRide1, themeParkRide2, themeParkRide3);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ThemeParkRide saveThemeRides(@RequestBody ThemeParkRide tpr) {
        System.out.println("Ride saved");
        return tpr;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ThemeParkRide getThemeParkRide(@PathVariable String id) {
        return ThemeParkRide.builder()
                .rideName("rideN")
                .description("rideN-desc")
                .minAge(3)
                .minHeight(90)
                .thrillFactor("super-easy")
                .build();
    }
}
