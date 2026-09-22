package Assignments;

import java.util.ArrayList;
import java.util.List;

class product{
int id;
String name;
double price;
public product(int id,String name,double price)
{
	this.id=id;
	this.name=name;
	this.price=price;
}
}

public class FilterDemo4 {

	public static void main(String[] args) {
	
List <product>productList=new ArrayList<product>();
productList.add(new product(1,"Hp laptop",35000));
productList.add(new product(1,"Dell laptop",5000));
productList.add(new product(1,"Lenova laptop",75000));
productList.add(new product(1,"Mac laptop",65000));
productList.add(new product(1,"Macpro laptop",45000));
productList.stream().filter(p->p.price>25000).forEach(pr->System.out.println(pr.price)); 
	}

}
