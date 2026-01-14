// Point3D.java (расширяет Point)
public class Point3D extends Point {
    private int z;   
    public Point3D() {
        this(0, 0, 0);
    }   
    public Point3D(int x, int y, int z) {
        super(x, y);  // вызов конструктора Point
        this.z = z;
    }   
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }    
    // Переопределение setLocation(x,y) из Point
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }   
    public int getZ() { return z; }    
    @Override
    public String toString() {
        return String.format("(%d,%d,%d)", getX(), getY(), z);
    }   
    @Override
    public int distanceFromOrigin() {
        return (int) Math.sqrt(getX()*getX() + getY()*getY() + z*z);
    }   
    // Проверка в параллелепипеде
    public boolean isInBox(Point3D corner1, Point3D corner2) {
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());
        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());
        int minZ = Math.min(corner1.getZ(), corner2.getZ());
        int maxZ = Math.max(corner1.getZ(), corner2.getZ());        
        return getX() >= minX && getX() <= maxX &&
               getY() >= minY && getY() <= maxY &&
               z >= minZ && z <= maxZ;
    }    
    // Проверка в сфере
    public boolean isInSphere(Point3D center, int radius) {
        int dx = getX() - center.getX();
        int dy = getY() - center.getY();
        int dz = z - center.getZ();
        return dx*dx + dy*dy + dz*dz <= radius * radius;
    }
}
