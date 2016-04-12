package org.ndt.ecrop;
import org.ndt.ecrop.model.User1;
import org.springframework.web.client.RestTemplate;

public class EcropRestTestClient 
{

	public static final String REST_SERVICE_URI = "http://localhost:8080/Ecrop";
	
	/* GET */
	private static void getUser(){
		System.out.println("Testing getUser API----------");
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("Hello");
        User1 user = restTemplate.getForObject(REST_SERVICE_URI+"/user/sharath", User1.class);
        System.out.println(user);
	}
	
	public static void main(String[] args)
	{
		getUser();

	}
	
}
