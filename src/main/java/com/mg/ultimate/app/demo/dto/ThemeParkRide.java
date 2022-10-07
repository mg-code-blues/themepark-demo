package com.mg.ultimate.app.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ThemeParkRide {
    private String rideName;

    private int minAge;

    private int minHeight;

    private String description;

    private String thrillFactor;
}
