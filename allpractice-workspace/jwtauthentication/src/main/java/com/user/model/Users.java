package com.user.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private long userId;
	    @Column(unique=true)
	    private String email;
	    private String password;
	    private String phoneNo;
	    private String firstName;
	    private String lastName;
	    private String gender;
	    private String address;
	    private String department;
	    private String experience;
	    @ElementCollection(fetch = FetchType.EAGER)
	        @CollectionTable(name = "RolesTable",
	                        joinColumns = @JoinColumn(name = "userId"))
	    private Set<String> roles;

}
