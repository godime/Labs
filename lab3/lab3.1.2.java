import java.util.Arrays;
public class GroupCartridge {
    private String groupId;    // уникальный номер группы
    private Cartridge[] cartridges;  // массив картриджей
    // Конструктор по умолчанию
    public GroupCartridge() {
        this.groupId = "G-" + System.currentTimeMillis();
        this.cartridges = new Cartridge[0];
    }
    // Конструктор с массивом
    public GroupCartridge(String groupId, Cartridge[] cartridges) {
        this.groupId = groupId;
        this.cartridges = cartridges != null ? cartridges.clone() : new Cartridge[0];
    }
    // Геттеры/сеттеры
    public String getGroupId() { return groupId; }
    public void setGroupId(String groupId) { this.groupId = groupId; }
    
    public Cartridge[] getCartridges() { return cartridges.clone(); }
    public void setCartridges(Cartridge[] cartridges) {
        this.cartridges = cartridges != null ? cartridges.clone() : new Cartridge[0];
    }
    // Добавление картриджа
    public boolean addCartridge(Cartridge cartridge) {
        Cartridge[] newArray = Arrays.copyOf(cartridges, cartridges.length + 1);
        newArray[cartridges.length] = cartridge;
        cartridges = newArray;
        return true;
    }
    // Удаление по модели
    public boolean removeCartridge(String model) {
        int index = findByModel(model);
        if (index == -1) return false;
        Cartridge[] newArray = new Cartridge[cartridges.length - 1];
        for (int i = 0, j = 0; i < cartridges.length; i++) {
            if (i != index) {
                newArray[j++] = cartridges[i];
            }
        }
        cartridges = newArray;
        return true;
    } 
    // Поиск по модели
    private int findByModel(String model) {
        for (int i = 0; i < cartridges.length; i++) {
            if (cartridges[i].getModel().equals(model)) {
                return i;
            }
        }
        return -1;
    }
    // Сортировка по цене (по возрастанию)
    public void sortByPrice() {
        Arrays.sort(cartridges, (c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupCartridge{groupId='").append(groupId)
          .append("', count=").append(cartridges.length).append(", cartridges=[");
        for (int i = 0; i < cartridges.length; i++) {
            sb.append(cartridges[i]);
            if (i < cartridges.length - 1) sb.append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
