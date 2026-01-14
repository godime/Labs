// В Point (двумерное скалярное произведение)
public int dotProduct(Point other) {
    return getX() * other.getX() + getY() * other.getY();
}
// В Point3D (трехмерное скалярное произведение)  
@Override
public int dotProduct(Point other) {
    if (other instanceof Point3D p3d) {
        return getX() * p3d.getX() + getY() * p3d.getY() + z * p3d.getZ();
    }
    return super.dotProduct(other);
}
