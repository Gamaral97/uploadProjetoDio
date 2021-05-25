package com.github.gamaral97.citiesapi.staties;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.github.gamaral97.citiesapi.countries.Country;

@Entity(name = "state")
@Table(name = "estado")
public class State {

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	@Column(name = "uf")
	private String uf;

	@Column(name = "ibge")
	private Integer ibge;

	
	/*
	@Column(name = "pais")
	private Integer countryId; */
	
	@ManyToOne
	@JoinColumn(name = "pais", referencedColumnName = "id")
	private Country country;

	@Column(name = "ddd")
	private String ddd;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	/*
	public Integer getCountryId() {
		return countryId;
	}*/
	
	public Country getCountry() {
		return country;
	}

	public String getDdd() {
		return ddd;
	}

}
