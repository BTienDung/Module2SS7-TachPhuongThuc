package season_7.TachPhuongThuc;


class CylinderTest {
    public static void main(String[] args) {
        int radius = 5;
        int height = 4;
        Cylinder.getBaseArea(radius);
        Cylinder.getPerimeter(radius);
        System.out.println(Cylinder.getVolume(radius,height));
    }

}
