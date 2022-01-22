package com.jrcg.jrcglearn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

@Data
@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NonNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String imgUri;
	@NonNull
	private String imgGrayUri;
	
	
	@Setter(value = AccessLevel.NONE)
	@OneToMany(mappedBy = "course")
	private List<Offer>offers = new ArrayList<>();
	
}
