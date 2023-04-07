package com.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.image.model.ImageModel;

@Repository
public interface ImageModelRepository extends JpaRepository<ImageModel, Integer> {
	
	
	@Query("select i from ImageModel i where i.imageName LIKE ':c%'")
	public ImageModel startsWith(char c);
	@Query("select i from ImageModel i where i.imageName LIKE '%:c'")
	public ImageModel endsWith(char c);
	@Query("select i from ImageModel i where i.imageName LIKE '%:c%'")
	public ImageModel contains(char c);
	@Query("select i from ImageModel i where i.imageName between ':c' and ':a'")
	public ImageModel between(char c,char a);
	
	@Query("select i from ImageModel i where i.imageId = :c")
	public ImageModel equels(int c);
	
	

}
