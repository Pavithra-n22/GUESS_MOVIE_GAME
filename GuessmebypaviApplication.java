package com.example.guessmebypavi.guessmebypavi;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
@SpringBootApplication
public class GuessmebypaviApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuessmebypaviApplication.class, args);
    }

    private String movieTeam1;
    private String[] hintsTeam1;
    private String movieTeam2;
    private String[] hintsTeam2;

    private boolean team1Started = false;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/startGame")
    public Map<String, Object> startGame(@RequestBody Map<String, Object> requestData) {
        int teamNumber = (int) requestData.get("team");

        Map<String, Object> response = new HashMap<>();

        if (teamNumber == 1) {
            if (team1Started) {
                response.put("message", "Team 1 has already started the game. Wait for Team 2.");
            } else {
                team1Started = true;
                // Simulate user input for team 1 (replace with your actual frontend logic)
                movieTeam1 = (String) requestData.get("movie");
                hintsTeam1 = ((String) requestData.get("hints")).split(",");

                response.put("message", "Game started for team 1");
                response.put("movie", movieTeam1);
                response.put("hints", hintsTeam1);
            }
        } else if (teamNumber == 2) {
            if (!team1Started) {
                response.put("message", "Team 1 needs to start the game first.");
            } else {
                // Simulate user input for team 2 (replace with your actual frontend logic)
                movieTeam2 = (String) requestData.get("movie");
                hintsTeam2 = ((String) requestData.get("hints")).split(",");

                response.put("message", "Game started for team 2");
                response.put("movie", movieTeam2);
                response.put("hints", hintsTeam2);
            }
        } else {
            response.put("message", "Invalid team number");
        }

        return response;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/makeGuess")
    public Map<String, Object> startGame(@RequestBody Map<String, Object> requestData) {
        int teamNumber = (int) requestData.get("team");

        Map<String, Object> response = new HashMap<>();

        if (teamNumber == 1) {
            if (team1Started) {
                response.put("message", "Team 1 has already started the game. Wait for Team 2.");
            } else {
                team1Started = true;
                // Capture user input for team 1
                movieTeam1 = (String) requestData.get("movie");
                hintsTeam1 = ((String) requestData.get("hints")).split(",");

                response.put("message", "Game started for team 1");
                response.put("movie", movieTeam1);
                response.put("hints", hintsTeam1);
                } else {
                    response.put("result", "Incorrect guess for team 1. Try again!");
                }
            } else {
                response.put("result", "Guess not provided for team 1.");
            }
        } else if (teamNumber == 2) {
            // Implement logic for handling guesses for team 2
            // Compare guess with the correct answer (movieTeam1)
            int attempts = 3; // Number of attempts allowed for Team 2
            if (guessData.containsKey("guess")) {
                String guess = guessData.get("guess");
                for (int i = 0; i < attempts; i++) {
                    if (guess.equals(movieTeam1)) {
                        response.put("result", "Team 2 wins! Correct guess for team 1.");
                        return response;
                    } else {
                        response.put("result", "Incorrect guess for team 1. Try again!");
                        response.put("attemptsLeft", String.valueOf(attempts - i - 1));
                    }
                }
                response.put("result", "Team 2 loses! No more attempts left.");
            } else {
                response.put("result", "Guess not provided for team 2.");
            }
        } else {
            response.put("result", "Invalid team number");
        }

        return response;
    }
}
