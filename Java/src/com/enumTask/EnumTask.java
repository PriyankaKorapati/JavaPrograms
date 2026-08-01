package com.enumTask;

public class EnumTask {

	enum Months{
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}
	enum Directions{
		 NORTH, SOUTH, EAST, WEST;
	}
	enum Grades{
		A, B, C, D, F;
	}
	enum PizzaSize{
		SMALL(10),MEDIUM(15),LARGE(20);
		private int price;

		PizzaSize(int price){
			this.price=price;
		}
		public int getPrice(){
			return price;
		}
	}
	enum Seasons {
		WINTER,SPRING,SUMMER,AUTUMN;
	}
	public static void main(String[] args) {
		System.out.println("Months: ");
		for(Months m: Months.values()) {
			System.out.println(m);
		}
		
		System.out.println("\nDirections: ");
		for(Directions d:Directions.values()) {
			System.out.println(d);
		}
		System.out.println("\nGrade check: ");
		Grades g = Grades.A;
		
		switch(g) {
		case A:
			System.out.println("Excellent");
			break;
		case B:
			System.out.println("Good");
			break;
		case C:
			System.out.println("Average");
			break;
		case D:
			System.out.println("Below Average");
			break;
		case F:
			System.out.println("Fail");
			break;
		}
		System.out.println("\nPizza prices: ");
		for(PizzaSize p : PizzaSize.values()) {
			System.out.println(p+ "-> $"+p.getPrice());
		}
		System.out.println("\nSeasons: ");
		for(Seasons s : Seasons.values()) {
			System.out.println(s);
		}
		
	}

}
