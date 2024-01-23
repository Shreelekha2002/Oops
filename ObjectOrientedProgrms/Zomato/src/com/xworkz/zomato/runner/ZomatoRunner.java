package com.xworkz.zomato.runner;

import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.repository.ZomatoRepository;
import com.xworkz.zomato.repository.ZomatoRepositoryImplementation;
import com.xworkz.zomato.service.ZomatoService;
import com.xworkz.zomato.service.ZomatoServiceImplementation;

public class ZomatoRunner {
public static void main(String[] args) {
	
ZomatoDto zomato=new ZomatoDto();
ZomatoRepository repository=new ZomatoRepositoryImplementation();
ZomatoService service=new ZomatoServiceImplementation(repository);
zomato.setCustumerName("Vanitha");
zomato.setContactNumber(8639112031l);
zomato.setFoodItemName("Biriyani");
zomato.setCostOfTheItem(200);
zomato.setCustumerEmail("vanitha@gmail.com");
System.out.println(zomato.toString());

ZomatoDto zomato1=new ZomatoDto();
zomato1.setCustumerName("Vanitha");
zomato1.setContactNumber(8639112031l);
zomato1.setFoodItemName("Biriyani");
zomato1.setCostOfTheItem(200);
zomato1.setCustumerEmail("vanitha@gmail.com");
System.out.println(zomato1.toString());

ZomatoDto zomato2=new ZomatoDto();
service.update("vanitha@gmail.com", zomato2);
zomato2.setCustumerName("Vani");
zomato2.setContactNumber(8639115031l);
zomato2.setFoodItemName("Biriyani");
zomato2.setCostOfTheItem(200);
zomato2.setCustumerEmail("vanitha@gmail.com");
System.out.println(zomato2.toString());




service.validateAndSave(zomato);
service.validateAndSave(zomato1);
service.validateAndSave(zomato2);
service.read();



service.read();
service.delete(8639112031l);

}

}