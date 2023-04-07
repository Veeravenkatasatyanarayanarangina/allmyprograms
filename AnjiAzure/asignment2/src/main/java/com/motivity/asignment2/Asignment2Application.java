package com.motivity.asignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Random;


@SpringBootApplication
@Component
public class Asignment2Application {
	public static void main(String[] args) throws UnknownHostException {
//	String message=generateOTP(6);
//		sendOtp("hai hari this message is send by"+message,"8106344619","XIkWap18ENGgKzZQMJrsd7bmPqiYAS46otThfUw5c0OL2BjFuyCQjkWw8PA5veE3R0UrlHX7adcbz6t1");
//
		SpringApplication.run(Asignment2Application.class, args);
	}

//	public static String generateOTP(int length) {
//		String numbers = "0123456789"; // all possible characters in the OTP
//		Random random = new Random();
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < length; i++) {
//			int index = random.nextInt(numbers.length()); // generate a random index
//			sb.append(numbers.charAt(index)); // append the character at that index to the OTP
//		}
//		return sb.toString();
//	}
//	public static  void sendOtp(String message,String mobilenumber,String apiKey){
//		String sender_id="TXTIND";
//		String route="v3";
//		try{
//			message= URLEncoder.encode(message,"UTF-8");
//			String myurl="https://www.fast2sms.com/dev/bulkV2?authorization="
//					+apiKey+"&sender_id="+sender_id+"&message="+message+"&route="+route+"&numbers="+mobilenumber;
//			URL url=new URL(myurl);
//			HttpURLConnection con =(HttpURLConnection) url.openConnection();
//			con.setRequestMethod("GET");
//			con.setRequestProperty("cache-control","no-cache");
//			System.out.println("waiting for the response");
//			int responseCode = con.getResponseCode();
//			System.out.println("response code"+responseCode);
//			StringBuffer response=new StringBuffer();
//			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(con.getInputStream()));
//			while (true){
//				String line= bufferedReader.readLine();
//				if(line==null){
//					break;
//				}
//				response.append(line);
//			}
//			System.out.println(response);
//
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
//
//	}


//		IntStream.rangeClosed(2,100)
//				.filter(Asignment2Application::isPrime)
//				.forEach(System.out::print);
//		List<Integer> collect = IntStream.rangeClosed(2, 100).filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).boxed().collect(Collectors.toList());
//		System.out.println(collect);
//	public static boolean isPrime(int number) {
//		for (int i = 2; i <= Math.sqrt(number); i++) {
//			if (number % i == 0) {
//				return false;
//			}
//		}
//
//		return true;
//		List<String> list= Arrays.asList("sa","sa","sa","ka","hr");
//		Map<String,Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);
// 		List<Integer> collect = IntStream.rangeClosed(2, 400).filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).boxed().collect(Collectors.toList());
// 		System.out.println(collect);
//		String apiKey="908724922cf94dad922a21adbccbb48d";
//			InetAddress ipAddress = InetAddress.getLocalHost();
//			String address = ipAddress.getHostAddress();
//		String url = "https://api.ipgeolocation.io/ipgeo?apiKey=" + apiKey + "&ip=" + " 8.8.8.8";
//		try {
//			URLConnection conn = new URL(url).openConnection();
//			InputStream in = conn.getInputStream();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//			StringBuilder result = new StringBuilder();
//			String line;
//			while ((line = reader.readLine()) != null) {
//				result.append(line);
//			}
//			JSONObject jsonObject = new JSONObject(result.toString());
//			String city = jsonObject.getString("city");
//			String country = jsonObject.getString("country_name");
//			String latitude = jsonObject.getString("latitude");
//			String longitude = jsonObject.getString("longitude");
//			System.out.println("City: " + city);
//			System.out.println("Country: " + country);
//			System.out.println("Latitude: " + latitude);
//			System.out.println("Longitude: " + longitude);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.exit(0);
	}
