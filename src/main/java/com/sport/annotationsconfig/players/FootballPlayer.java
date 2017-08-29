package com.sport.annotationsconfig.players;


import com.sport.annotationsconfig.expirience.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballPlayer implements Player {


    private Experience currentExperience;
    private Experience futureExperience;
    @Autowired
    @Qualifier("advancedExperience")
    private Experience dreamExperience;

    @Autowired
    FootballPlayer(@Qualifier("baseExperience") Experience currentExperience){
        this.currentExperience = currentExperience;
    }

    public String getDescription() {
        return String.format("I am a football player with %s and I'll get %s and my dream is %s",
                currentExperience.getDescription(), futureExperience.getDescription(), dreamExperience.getDescription());
    }

    @Autowired
    @Qualifier("advancedExperience")
    public void setFutureExperience(Experience futureExperience) {
        this.futureExperience = futureExperience;
    }
}
