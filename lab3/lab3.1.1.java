public class Cartridge {
    private String model;      // модель картриджа
    private String color;      // цвет
    private int capacity;      // ёмкость (страниц)
    private double price;      // цена
    // Конструктор по умолчанию
    public Cartridge() {
        this.model = "Unknown";
        this.color = "Black";
        this.capacity = 1000;
        this.price = 0.0;
    }  
    // Параметризованный конструктор
    public Cartridge(String model, String color, int capacity, double price) {
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    } 
    // Геттеры и сеттеры
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; } 
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    @Override
    public String toString() {
        return String.format("Cartridge{model='%s', color='%s', capacity=%d, price=%.2f}",
                model, color, capacity, price);
    }
}
