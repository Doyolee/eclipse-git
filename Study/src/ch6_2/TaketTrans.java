package ch6_2;

public class TaketTrans {

	public static void main(String[] args) {
		Student James=new Student("James",5000);
		Student Jack=new Student("Jack",10000);
		Student Edward=new Student("Edward",20000);
		
		Bus bus100=new Bus(100);
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen=new Subway("2호선");
		Jack.takeSubway(subwayGreen);
		Jack.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi1234=new Taxi(1234);
		Edward.takeTaxi(taxi1234);
		Jack.showInfo();
		taxi1234.showInfo();

	}

}
