public class Fruit
{
	// Required parameters
		private final String type;
		private final String color;
	// Optional parameters - initialized to default values
	private int category = 0;
	private float weight = 0;
	private int calories = 0;
public Fruit(String type, String color)
{
this(type, color, 0, 0, 0);
}
public Fruit(String type, String color, int category)
{
this(type, color, category, 0, 0);
}
public Fruit(String type, String color, int category, float weight)
{
this(type, color, category, weight, 0);
}

public Fruit(String type, String color, int category, float weight, int calories)
{
this.type = type;
this.color = color;
this.category = category;
this.weight = weight;
this.calories = calories;
}
public void printInfo()
{
System.out.println("***********************************");
System.out.println(type);
System.out.println(color);
System.out.println(category);
System.out.println(weight);
System.out.println(calories);
}
public static void main(String[] args)
{
Fruit apple = new Fruit("Apple", "red");
apple.printInfo();
Fruit banana = new Fruit("Banana", "yellow", 3, 200);
banana.printInfo();
Fruit lemon = new Fruit("Lemon", "yellow", 1, 50, 80);
lemon.printInfo();
}
}