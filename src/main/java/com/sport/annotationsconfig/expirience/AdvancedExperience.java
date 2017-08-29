package com.sport.annotationsconfig.expirience;

import org.springframework.stereotype.Component;

@Component
public class AdvancedExperience  implements Experience{
    public String getDescription() {
        return "Advanced Experience";
    }
}
