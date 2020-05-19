package com.ayaz;

import com.ayaz.model.Item;
import com.ayaz.model.SellerDto;
import com.ayaz.service.RegistrationService;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderManagmentAppApplication {

	public static void main(String[] args) {

		System.setProperty("javax.net.ssl.trustStore","C:\\Users\\gasan\\Desktop\\ssl_server.jks");
		System.setProperty("javax.net.ssl.trustStorePassword","greenlearner");

		ConfigurableApplicationContext contex  = SpringApplication.run(OrderManagmentAppApplication.class, args);
		RegistrationService service = contex.getBean(RegistrationService.class);

		Item item = new Item();
		item.setId(1);
		item.setName("AZN");
		item.setPrice(123.12);
		item.setCategory("Pre");
		List<Item> items = new LinkedList<>();
		items.add(item);

		SellerDto sellerDto = new SellerDto();
		sellerDto.setEmailId("12");
		sellerDto.setFirstName("Ayaz");
		sellerDto.setLastName("Nacafli");
		sellerDto.setItemsSold(items);

		service.registerSeller(sellerDto);


		System.out.println(service.getSellersList());

	}

}
