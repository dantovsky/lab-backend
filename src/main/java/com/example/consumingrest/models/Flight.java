package com.example.consumingrest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flights")
public class Flight {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO) // the BD creates automaticaly the ID
//    private long id;
    @Id
    private String icao24;
    private String callsign;
    private String origin_country;
    private Integer time_position;
    private Integer last_contact;
    private float longitude;
    private float latitude;

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

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

/* Example to insert on Postman

{
	"id": xxx, (remove this line)
	"icao24": "4b1809",
	"callsign": "SWR201Z ",
	"origin_country": "Switzerland",
	"time_position": 1583723415,
	"last_contact": 1583723419,
	"longitude": 8.565,
	"latitude": 47.4418
},
{
	"id": xxx, (remove this line)
	"icao24": "4b5da2",
	"callsign": "TE21    ",
	"origin_country": "Switzerland",
	"time_position": 1583723249,
	"last_contact": 1583723249,
	"longitude": 8.5635,
	"latitude": 47.4437
}
 */
