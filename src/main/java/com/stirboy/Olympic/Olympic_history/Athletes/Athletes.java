package com.stirboy.Olympic.Olympic_history.Athletes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="athletes")
public class Athletes {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private String Sex;
    private Integer Age;
    private String Height;
    private String Weight;
    private String Team;
    private String NOC;
    private String Games;
    private String Year;
    private String Season;
    private String City;
    private String Sport;
    private String Event;
    private String Medal;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return this.Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public Integer getAge() {
        return this.Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getHeight() {
        return this.Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getWeight() {
        return this.Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getTeam() {
        return this.Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public String getNOC() {
        return this.NOC;
    }

    public void setNOC(String NOC) {
        this.NOC = NOC;
    }

    public String getGames() {
        return this.Games;
    }

    public void setGames(String Games) {
        this.Games = Games;
    }

    public String getYear() {
        return this.Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getSeason() {
        return this.Season;
    }

    public void setSeason(String Season) {
        this.Season = Season;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getSport() {
        return this.Sport;
    }

    public void setSport(String Sport) {
        this.Sport = Sport;
    }

    public String getEvent() {
        return this.Event;
    }

    public void setEvent(String Event) {
        this.Event = Event;
    }

    public String getMedal() {
        return this.Medal;
    }

    public void setMedal(String Medal) {
        this.Medal = Medal;
    }
}