package com.image;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.client.WebClient;

import com.image.model.ImageModel;
import com.image.repository.ImageModelRepository;

import ch.qos.logback.classic.Logger;
import io.netty.handler.codec.http.HttpHeaders;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin("http://localhost:3000/")
public class HomeController {
	
	@Autowired
	ImageModelRepository imageModelRepository;

	@GetMapping("/")
	public String helloWorld() {
		return "Hello world";
	}
	@PostMapping("/upload")
	public ResponseEntity<ImageModel> uploadImage(@RequestParam("image") MultipartFile file) throws IOException
	{
		
		log.info("the Original file size is "+ file.getBytes().length);
		ImageModel image = new ImageModel();
		image.setImageName(file.getOriginalFilename());
		image.setImageType(file.getContentType());
		image.setImage(compressBytes(file.getBytes()));
		imageModelRepository.save(image);
		return new ResponseEntity<ImageModel>(image,HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/get/{imageId}")
	public ImageModel getImage(@PathVariable("imageId") int imageId) {
		log.info("image id  is {}",imageId);
		ImageModel imageModel = imageModelRepository.findById(imageId).get();
	return new ImageModel(imageModel.getImageId(),imageModel.getImageName(),imageModel.getImageType(),deCompressBytes(imageModel.getImage()));
	}
	
	public static byte[] compressBytes(byte[] data)
	{
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();
		
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		
		while(!deflater.finished())
		{
			int count = deflater.deflate(buffer);
			byteArrayOutputStream.write(buffer, 0, count);
			
		}
		try {
			byteArrayOutputStream.close();
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		log.info("compressed image size is "+byteArrayOutputStream.toByteArray().length);
		return byteArrayOutputStream.toByteArray();	
	}
	public static byte[] deCompressBytes(byte[] data)
	{
		Inflater inflater = new Inflater();
		inflater.setInput(data);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		try {
			while(!inflater.finished())
			{
				int count = inflater.inflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			outputStream.close();
		}
		catch (Exception e) {
		}
		
		return outputStream.toByteArray();
	}
	
//	public void getdatafromurl()
//	{

//WebClient.ResponseSpec responseSpec = webClient.get()
//    .uri(" https://jsonplaceholder.typicode.com/users")
//    .retrieve();
//	}
}
