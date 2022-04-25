public class Food {
    private String item;
    private double price;
    private double fat;
    private double carbs;
    private double fiber;

    public Food(String item, double price, double fat, double carbs, double fiber){
        this.item = item;
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    public String getItem(){
        return this.item;
    }

    public double getPrice(){
        return this.price;
    }

    public double getFat(){
        return this.fat;
    }

    public double getCarbs(){
        return this.carbs;
    }

    public double getFiber(){
        return this.fiber;
    }

    public void displayInfo(){
        System.out.printf("Each %s has %.1f of fat, %.1f of carbs, and %.1f of fiber.\n\n", 
                        item, fat, carbs, fiber);
    }

    public double getSubtotal(int quantity){
        return (this.price * quantity);
    }
}