package HW1;

public class Camera {
    public Point3D Location;
    public Angle3D Angle;

    public Camera(Point3D location, Angle3D angle) {
        Location = location;
        Angle = angle;
    }
    public void Rotate(Angle3D ang) {};
    public void Move(Point3D point) {};

}
