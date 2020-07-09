/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.consumingrest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;

import java.util.List;

/**
 *
 * @author HParaense
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class States {

    private Long time;
    private List<List<Object>> states;

    public States() {}

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<List<Object>> getStates() {
        return states;
    }

    public void setStates(List<List<Object>> states) {
        this.states = states;
    }

    //    private Long time;
//    private List<List<Object>> states;
//    private String icao24;
//    private String callsign;
//    private String origin_country;
//    private Integer time_position;
//    private Integer last_contact;
//    private float longitude;
//    private float latitude;
//    private float baro_altitude;
//    private boolean on_ground;
//    private float velocity;
//    private float true_track;
//    private float vertical_rate;
//    private int[] sensors;
//    private float geo_altitude;
//    private String squawk;
//    private boolean spi;
//    private Integer position_source;
//
//    public String getIcao24() {
//        return icao24;
//    }
//
//    public void setIcao24(String icao24) {
//        this.icao24 = icao24;
//    }
//
//    public String getCallsign() {
//        return callsign;
//    }
//
//    public void setCallsign(String callsign) {
//        this.callsign = callsign;
//    }
//
//    public String getOrigin_country() {
//        return origin_country;
//    }
//
//    public void setOrigin_country(String origin_country) {
//        this.origin_country = origin_country;
//    }
//
//    public Integer getTime_position() {
//        return time_position;
//    }
//
//    public void setTime_position(Integer time_position) {
//        this.time_position = time_position;
//    }
//
//    public Integer getLast_contact() {
//        return last_contact;
//    }
//
//    public void setLast_contact(Integer last_contact) {
//        this.last_contact = last_contact;
//    }
//
//    public float getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(float longitude) {
//        this.longitude = longitude;
//    }
//
//    public float getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(float latitude) {
//        this.latitude = latitude;
//    }
//
//    public float getBaro_altitude() {
//        return baro_altitude;
//    }
//
//    public void setBaro_altitude(float baro_altitude) {
//        this.baro_altitude = baro_altitude;
//    }
//
//    public boolean isOn_ground() {
//        return on_ground;
//    }
//
//    public void setOn_ground(boolean on_ground) {
//        this.on_ground = on_ground;
//    }
//
//    public float getVelocity() {
//        return velocity;
//    }
//
//    public void setVelocity(float velocity) {
//        this.velocity = velocity;
//    }
//
//    public float getTrue_track() {
//        return true_track;
//    }
//
//    public void setTrue_track(float true_track) {
//        this.true_track = true_track;
//    }
//
//    public float getVertical_rate() {
//        return vertical_rate;
//    }
//
//    public void setVertical_rate(float vertical_rate) {
//        this.vertical_rate = vertical_rate;
//    }
//
//    public int[] getSensors() {
//        return sensors;
//    }
//
//    public void setSensors(int[] sensors) {
//        this.sensors = sensors;
//    }
//
//    public float getGeo_altitude() {
//        return geo_altitude;
//    }
//
//    public void setGeo_altitude(float geo_altitude) {
//        this.geo_altitude = geo_altitude;
//    }
//
//    public String getSquawk() {
//        return squawk;
//    }
//
//    public void setSquawk(String squawk) {
//        this.squawk = squawk;
//    }
//
//    public boolean isSpi() {
//        return spi;
//    }
//
//    public void setSpi(boolean spi) {
//        this.spi = spi;
//    }
//
//    public Integer getPosition_source() {
//        return position_source;
//    }
//
//    public void setPosition_source(Integer position_source) {
//        this.position_source = position_source;
//    }
//
//    public States() {
//    }
//
//    public Long getTime() {
//        return time;
//    }
//
//    public void setTime(Long time) {
//        this.time = time;
//    }
//
//    public List<List<Object>> getStates() {
//        return states;
//    }
//
//    public void setStates(List<List<Object>> states) {
//        if (states == null) {
//            this.states = null;
//        } else {
//            this.states = states;
//            for (int i = 0; i < states.size(); i++) {
//                for (int j = 0; j < states.get(i).size(); j++) {
//                    switch(j) {
//                        case 0:
//                            this.icao24 = (String) states.get(i).get(j);
//                            break;
//                        case 1:
//                            this.callsign = (String) states.get(i).get(j);
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            }
//
//        }
//    }
//
//    //@Override
//    public Object toJSON() {
//        // return "{States: \n" + "\ttime:" + time + ",\n \tstates:" + states + "}";
//
////        String str = "{\"time\": " + time + ",\"states\": " + states + "}";
//        String str = "{\"name\":\"Error\",\"message\":\"hello\"}";
//
//        Gson gson = new Gson();
//        String jsonnified = gson.toJson(str);
//        return jsonnified;
//    }
}
