package com.example.consumingrest.controllers;

import java.text.SimpleDateFormat;
import java.util.List;

import com.example.consumingrest.models.Flight;
import com.example.consumingrest.models.States;
import com.example.consumingrest.repository.FlightRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class UIController {
    @Value("${spring.application.name}")

    String appName;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private static final Logger log = LoggerFactory.getLogger(UIController.class);

    @GetMapping("/states")
    public Object getStates(Model model, RestTemplate restTemplate) {

        States states = restTemplate.getForObject("https://opensky-network.org/api/states/all", States.class);
        return states;
    }

    // Criar um ponto de injeção do ProdutoRepository, para que possa usar os métodos para se conectar com o BD
    @Autowired
    FlightRepository flightRepository;

    /**
     * Get all flights from BD
     * @return
     */
    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    /**
     * Insert new flight into BD
     * @param flight
     * @return
     */
    @PostMapping("/flights")
    public Flight postFlight(@RequestBody Flight flight) {
        return flightRepository.save(flight);
    }

    /**
     * Delete one flight from BD
     * @param flight
     */
    @DeleteMapping("/flights")
    // @Query("delete from flightstates f where f.icao24=:icao24")
    public void deleteFlight(@RequestBody Flight flight) {
        flightRepository.delete(flight);
    }
}