package com.bean;

import javax.persistence.*;

@Entity
@Table(name="State")
public class State {
    @Id
    @Column(name="stateName", nullable=false)
    private String stateName;

    @Column(name="language", nullable=false)
    private String language;

    @Column(name="population", nullable=false)
    private long population;

    @ManyToOne
    @JoinColumn(name="countryName", nullable=false)
    private Country country;

    // Getters and setters
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
