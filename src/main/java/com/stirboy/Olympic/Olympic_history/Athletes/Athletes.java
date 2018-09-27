package com.stirboy.Olympic.Olympic_history.Athletes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="athletes")
public class Athletes {

    private static final String TABLE_ID = "TableId";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=TABLE_ID)
    private Integer TableId;
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

    public Athletes(){

    }

    public Athletes(Integer TableId, Integer id, String Name, String Sex, Integer Age, String Height, String Weight, String Team, String NOC, String Games, String Year, String Season, String City, String Sport, String Event, String Medal) {
        this.TableId = TableId;
        this.id = id;
        this.Name = Name;
        this.Sex = Sex;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
        this.Team = Team;
        this.NOC = NOC;
        this.Games = Games;
        this.Year = Year;
        this.Season = Season;
        this.City = City;
        this.Sport = Sport;
        this.Event = Event;
        this.Medal = Medal;
    }

    public Integer getTableId() {
        return this.TableId;
    }

    public void setTableId(Integer TableId) {
        this.TableId = TableId;
    }

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