package com.example.consumingrest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flights")
public class Flight {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO) // the BD creates automaticaly the ID
    @Id
    private String icao24;
    private String callsign;
    private String origin_country;
    private Integer time_position;
    private Integer last_contact;
    private float longitude;
    private float latitude;

    public String getIcao24() {
        return icao24;
    }

    public void setIcao24(String icao24) {
        this.icao24 = icao24;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public Integer getTime_position() {
        return time_position;
    }

    public void setTime_position(Integer time_position) {
        this.time_position = time_position;
    }

    public Integer getLast_contact() {
        return last_contact;
    }

    public void setLast_contact(Integer last_contact) {
        this.last_contact = last_contact;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}