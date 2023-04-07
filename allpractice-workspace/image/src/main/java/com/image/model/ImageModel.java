package com.image.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ImageModel {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int imageId;
	private String imageName;
	private String imageType;
	@Lob
	private byte[] image;

}
