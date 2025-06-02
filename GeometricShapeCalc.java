//Java program to Calculate Geometric shapes

import java.util.*;

public class GeometricShapeCalc{

    // method to calculate square
    static void Square(double s){ //side
        double a = s * s; // formula to find area
        double p = 4 * s; // formula to find perimeter
        double d = Math.sqrt(2) * s; // formula to find diagonals
        // printing statements for square
        System.out.printf("\nArea of the square: %.4f square units.",a);
        System.out.printf("\nPerimeter of the square: %.4f units.",p);
        System.out.printf("\nDiagonal of the square: %.4f units.",d);
    }
    // method to calculate rectangle
    static void Rectangle(double l, double b){ //length & breadth
        double a = (l * b); // formula to find area
        double p = 2 * (l + b); // formula to find perimeter
        double d = Math.sqrt( (l * l) + (b * b) ); // formula to find diagonals
        // printing statements for rectangle
        System.out.printf("\nArea of the rectangle: %.4f square units.",a);
        System.out.printf("\nPerimeter of the rectangle: %.4f units.",p);
        System.out.printf("\nDiagonal of the rectangle: %.4f units.",d);
    }
    // method to calculate equilateral triangle
    static void EquilateralTriangle(double s){//side
        double a = Math.sqrt(3) / 4 * (s * s); // formula to find area
        double p = 3 * s; // formula to find perimeter
        // printing statements for equilateral triangle
        System.out.printf("\nThe area of the Equilateral Triangle is: %.4f square units.",a);
        System.out.printf("\nThe perimeter of the Equilateral Triangle is: %.4f units",p);
    }
    // method to find right angle triangle
    static void RightAngleTriangle(double b, double h, double s1, double s2){//base, height, side1, side2
        double a = (1.0/2) * b * h; // formula to find area
        double hyp = Math.sqrt( (s1 * s1) + (s2 * s2) ); // formula to find hypotenuse
        double p = a + b + hyp; // formula to find perimeter
        // printing statements for right angle triangle
        System.out.printf("\nThe area of the Right Angle Triangle is: %.4f square units.",a);
        System.out.printf("\nThe perimeter of the Right Angle Triangle is: %.4f units",p);
        System.out.printf("\nThe hypotenuse of the Right Angle Triangle is: %.4f square units.",hyp);
    }
    // method to calculate scalene triangle
    static void ScaleneTriangle(double b, double h, double s1, double s2){//base, height, side1, side2
        double a = (1.0/2) * b * h; // formula to find area
        double p = b+s1+s2; // formula to find perimeter
        // printing statements for scalene triangle
        System.out.printf("\nThe area of the Scalene Triangle is: %.4f square units.",a);
        System.out.printf("\nThe perimeter of the Scalene Triangle is: %.4f units",p);
    }
    // method to calculate parallelogram
    static void Parallelogram(double b, double h, double s){ // base, height, side1 & side2
        double a = (b * h); // formula to find area
        double p = 2 * (b + s); // formula to find perimeter
        // printing statements for parallelogram
        System.out.printf("\nArea of the parallelogram: %.4f square units.",a);
        System.out.printf("\nPerimeter of the parallelogram: %.4f units.",p);
    }
    // method to calculate rhombus
    static void Rhombus(double s, double d1, double d2){//side, diagonal1, diagonal2
        double a = (1.0/2) * d1 * d2; // formula to find area
        double p = 4 * s; // formula to find perimeter
        // printing statements for rhombus
        System.out.printf("\nThe area of the Rhombus is: %.4f square units.",a);
        System.out.printf("\nThe perimeter of the Rhombus is: %.4f units",p);
    }
    // method to calculate trapezium or trapezoid
    static void Trapezium(double s1, double s2, double s3, double s4, double h){//height
        double a = (1.0/2) * (s1 + s1) * h; // formula to find area
        double p = s1 + s2 + s3 + s4; // formula to find perimeter
        // printing statements for trapezoid
        System.out.printf("\nThe area of the Trapezium or Trapezoid is: %.4f square units.",a);
        System.out.printf("\nThe perimeter of the Trapezium or Trapezoid is: %.4f units",p);
    }
    // method to calculate circle
    static void Circle(double r){ //radius
        double d = 2 * r; // formula to find diameter
        double c = (2 * Math.PI) * r; // formula to find circumference
        double a = Math.PI * (r * r); // formula to find surface area
        // printing statements for circle
        System.out.printf("\nDiameter of the circle: %.4f units",d);
        System.out.printf("\nCircumference of the circle: %.4f units",c);
        System.out.printf("\nSurface area of the circle: %.4f square unit",a);
    }
    // method to calculate ellipse
    static void Ellipse(double s1, double s2){ // side1,side2
        double a = Math.PI * (s1 * s2); // formula to find area
        double p = Math.PI * (3 * (s1 + s2) - Math.sqrt((3 * s1 + s2) * (s1 + 3 * s2)) ); // formula to find perimeter
        // printing statements for ellipse
        System.out.printf("\nThe Area of the Ellipse is: %.4f square units.",a);
        System.out.printf("\nThe perimeter of the Ellipse is: %.4f units",p);
    }
    // method to calculate cube
    static void Cube(double s){ // side
        double v = (s * s * s); // formula to volume
        double tsa = 6 * (s * s); // formula to find total surface area
        double lsa = 4 * (s * s); // formula to find lateral surface area
        double d = Math.sqrt(3 * (s * s)); // formula to find diagonals
        double p = (12 * s); // formula to find perimeter
        // printing statements for cube
        System.out.printf("\nDiagonal of the cube: %.4f units.",d);
        System.out.printf("\nPerimeter of the cube: %.4f units.",p);
        System.out.printf("\nTotal surface area of the cube: %.4f square units.",tsa);
        System.out.printf("\nLateral surface area of the cube: %.4f square units.",lsa);
        System.out.printf("\nVolume of the cube: %.4f cubic units.",v);
    }
    // Cuboid OR rectangular box OR rectangular prism
    static void Cuboid(double l, double b, double h){//length,breadth,height
        double v = l * b * h; // formula to find volume
        double sa = 2 * ( (l * b) + (l * h) + (b  *h) ); // formula to find surface area
        double d = Math.sqrt((l * l) + (b * b) + (h * h)); // formula to find diagonals
        // printing statements for cuboid
        System.out.printf("\nThe volume of the Cuboid or Rectangular Box or Rectangular Prism is: %.4f cubic units.",v);
        System.out.printf("\nThe surface area of the Cuboid or Rectangular Box or Rectangular Prism is: %.4f square units.",sa);
        System.out.printf("\nThe diagonals of the Cuboid or Rectangular Box or Rectangular Prism is: %.4f units.",d);
    }
    // method to calculate sphere
    static void Sphere(double r){ //radius, height
        double d = 2 * r; // formula to find diameter
        double sa = (4 * Math.PI) * (r * r); // formula to find surface area
        double v = ((4.0/3) * Math.PI * (r * r * r)); // formula to find volume
        // printing statements for sphere
        System.out.printf("\nDiameter of the sphere: %.4f units.",d);
        System.out.printf("\nSurface area of the sphere: %.4f square units.",sa);
        System.out.printf("\nVolume of the sphere: %.4f cubic units.",v);
    }
    // method to calculate cylinder
    static void Cylinder(double r, double h){ //radius, height
        double csa = ( (2 * Math.PI) * (r * h) ); // formula to find curved surface area
        double tsa = (2 * Math.PI * r) * (r + h); // formula to find total surface area
        double v = Math.PI * (r * r * h); // formula to find volume
        // printing statements for cylinder
        System.out.printf("\nCurved surface area of the cylinder: %.4f square units.",csa);
        System.out.printf("\nTotal surface area of the cylinder: %.4f square units.",tsa);
        System.out.printf("\nVolume of the cylinder: %.4f cubic units.",v);
    }
    // method to calculate cone
    static void Cone(double r, double h, double l){ //radius, height
        double v = (1.0/3) * Math.PI * (r * r * h); // formula to find volume
        double tsa = (Math.PI * r) * (l + r); // formula to find area
        // printing statements for cone
        System.out.printf("\nVolume of the cone: %.4f cubic units.",v);
        System.out.printf("\nTotal surface area of the cone: %.4f square units.",tsa);
    }
    // method to calculate hemisphere
    static void Hemisphere(double r){ //radius
        double v = (2.0/3) * Math.PI * (r * r * r); // formula to find volume
        double sa = 3 * Math.PI * (r * r); // formula to find surface area
        // printing statements for hemisphere
        System.out.printf("\nThe volume of the Hemisphere is: %.4f cubic units.",v);
        System.out.printf("\nThe surface area of the Hemisphere is: %.4f square units.",sa);
    }
    // method to calculate rectangularSolid
    static void RectangularSolid(double l, double b, double h){ //length, breadth, height
        double a = 2 * ( (l * b) + (l * h) + (b * h) ); // formula to find the area
        double v = (l * b * h); // formula to find volume
        double d = Math.sqrt( (l * l) + (b * b) + (h * h) ); // formula to find diagonals
        // printing statements for rectangularSolid
        System.out.printf("\nArea of the rectangularSolid: %.4f square units.",a);
        System.out.printf("\nVolume of the rectangularSolid: %.4f cubic units.",v);
        System.out.printf("\nDiagonal of the rectangularSolid: %.4f units.",d);
    }
    // method to calculate squarePyramid
    static void SquarePyramid(double s, double h){
        double sl = Math.sqrt( ( (h * h) + ( (s/2) * (s/2) ) ) ); //slant height
        double ba = s * s; // formula to find base area
        double la = (2 * s * sl); // formula to find lateral area
        double sa = (s * s) + (2 * s * sl); // formula to find surface area
        double v = (1.0/3) * (s * s * h); // formula to find volume
        // printing statements for squarePyramid
        System.out.printf("\nBase area of the squarePyramid: %.4f square units.",ba);
        System.out.printf("\nLateral surface area of the squarePyramid: %.4f square units.",la);
        System.out.printf("\nTotal surface area of the squarePyramid: %.4f square units.",sa);
        System.out.printf("\nVolume of the squarePyramid: %.4f cubic units.",v);
    }
    // method to calculate rectangularPyramid
    static void RectangularPyramid(double l, double b, double h){
        double sl1 = Math.sqrt( ( (h * h) + ( (b/2) * (b/2) ) ) ); // formula to find slant height 1
        double sl2 = Math.sqrt( ( (h * h) + ( (l/2) * (l/2) ) ) ); // formula to find slant height 2
        double ba = l*b; // formula to find base area
        double la = (2 * l * sl1); // formula to find lateral area
        double sa = (l * b) + (l * sl1) + (b * sl2); // formula to find surface area
        double v = (1.0/3) * (l * b * h); // formula to find volume
        // printing statements for rectangularPyramid
        System.out.printf("\nSlant height-1 of the rectangularPyramid: %.4f units.",sl1);
        System.out.printf("\nSlant height-2 of the rectangularPyramid: %.4f units.",sl2);
        System.out.printf("\nBase area of the rectangularPyramid: %.4f square units.",ba);
        System.out.printf("\nLateral surface area of the rectangularPyramid: %.4f square units.",la);
        System.out.printf("\nTotal surface area of the rectangularPyramid: %.4f square units.",sa);
        System.out.printf("\nVolume of the rectangularPyramid: %.4f cubic units.",v);
    }
    // method to calculate tetrahedron
    static void Tetrahedron(double s){ //side
        double v = (s * s * s) / (6 * Math.sqrt(2) ); // formula to find volume
        double sa = Math.sqrt(3 * s * s); // formula to find surface area
        // printing statements for tetrahedron
        System.out.printf("\nThe volume of the Tetrahedron is: %.4f cubic units.",v);
        System.out.printf("\nThe surface area of the Tetrahedron is: %.4f square units.",sa);
    }


    // main method
    public static void main(String[] args) {
        // scanner object
        Scanner sc = new Scanner(System.in);

        // declaration/initialization of variables
        double length, breadth, height, radius, side, side1, side2, side3, side4, diagonal1, diagonal2;

        // declaring a variable to repeat the calculation
        String repeat;

        // execute the body first at least one time
        do{
            // prompt the user for his/her choice
            System.out.println("\nEnter your choice (1 to 20): \n" +
                    "1 - Square\n" +
                    "2 - Rectangle\n" +
                    "3 - Equilateral Triangle\n" +
                    "4 - Right Angle Triangle\n" +
                    "5 - Scalene Triangle\n" +
                    "6 - Parallelogram\n" +
                    "7 - Rhombus\n" +
                    "8 - Trapezoid or Trapezium\n" +
                    "9 - Circle\n" +
                    "10 - Ellipse\n" +
                    "11 - Cube\n" +
                    "12 - Cuboid\n" +
                    "13 - Sphere\n" +
                    "14 - Cylinder\n" +
                    "15 - Cone\n" +
                    "16 - Hemisphere\n" +
                    "17 - Rectangular Solid\n" +
                    "18 - Square Pyramid\n" +
                    "19 - Rectangular Pyramid\n" +
                    "20 - Tetrahedron ");
            int choice = sc.nextInt();

            // switch statement to calculate the geometrical shape based on the user's choice
            switch (choice) {
                case 1:
                    //prompt the user to input the given data for square
                    System.out.print("Enter side of the square : ");
                    side = sc.nextDouble();
                    // calling method
                    Square(side);
                    // terminates the loop after execution
                    break;

                case 2:
                    //prompt the user to input the given data for rectangle
                    System.out.print("Enter length of the rectangle : ");
                    length = sc.nextDouble();
                    System.out.print("Enter breadth of the rectangle : ");
                    breadth = sc.nextDouble();
                    Rectangle(length, breadth);
                    break;

                case 3:
                    //prompt the user to input the given data for equilateral triangle
                    System.out.print("Enter side of the equilateral angle : ");
                    side = sc.nextDouble();
                    EquilateralTriangle(side);
                    break;

                case 4:
                    //prompt the user to input the given data for right angle triangle
                    System.out.print("Enter breadth of the right angle triangle : ");
                    breadth = sc.nextDouble();
                    System.out.print("Enter height of the right angle triangle : ");
                    height = sc.nextDouble();
                    System.out.print("Enter side-1 of the right angle triangle : ");
                    side1 = sc.nextDouble();
                    System.out.print("Enter side-2 of the right angle triangle : ");
                    side2 = sc.nextDouble();
                    RightAngleTriangle(breadth, height, side1, side2);
                    break;

                case 5:
                    //prompt the user to input the given data for scalene triangle
                    System.out.print("Enter breadth of the scalene triangle : ");
                    breadth = sc.nextDouble();
                    System.out.print("Enter height of the scalene triangle : ");
                    height = sc.nextDouble();
                    System.out.print("Enter side-1 of the scalene triangle : ");
                    side1 = sc.nextDouble();
                    System.out.print("Enter side-2 of the scalene triangle : ");
                    side2 = sc.nextDouble();
                    ScaleneTriangle(breadth, height, side1, side2);
                    break;

                case 6:
                    //prompt the user to input the given data for parallelogram
                    System.out.print("Enter breadth of the parallelogram : ");
                    breadth = sc.nextDouble();
                    System.out.print("Enter height of the parallelogram : ");
                    height = sc.nextDouble();
                    System.out.print("Enter side of the parallelogram : ");
                    side = sc.nextDouble();
                    Parallelogram(breadth, height, side);
                    break;

                case 7:
                    //prompt the user to input the given data for rhombus
                    System.out.print("Enter side of the rhombus : ");
                    side = sc.nextDouble();
                    System.out.print("Enter diagonal-1 of the rhombus : ");
                    diagonal1 = sc.nextDouble();
                    System.out.print("Enter diagonal-2 of the rhombus : ");
                    diagonal2 = sc.nextDouble();
                    Rhombus(side, diagonal1, diagonal2);
                    break;

                case 8:
                    //prompt the user to input the given data for Trapezium or trapezoid
                    System.out.print("Enter side-1 of the Trapezium or trapezoid : ");
                    side1 = sc.nextDouble();
                    System.out.print("Enter side-2 of the Trapezium or trapezoid : ");
                    side2 = sc.nextDouble();
                    System.out.print("Enter side-3 of the Trapezium or trapezoid : ");
                    side3 = sc.nextDouble();
                    System.out.print("Enter side-4 of the Trapezium or trapezoid : ");
                    side4 = sc.nextDouble();
                    System.out.print("Enter height of the Trapezium or trapezoid : ");
                    height = sc.nextDouble();
                    Trapezium(side1, side2, side3, side4, height);
                    break;

                case 9:
                    //prompt the user to input the given data for circle
                    System.out.print("Enter radius of the circle : ");
                    radius = sc.nextDouble();
                    Circle(radius);
                    break;

                case 10:
                    //prompt the user to input the given data for ellipse
                    System.out.print("Enter side-1 of the ellipse : ");
                    side1 = sc.nextDouble();
                    System.out.print("Enter side-2 of the ellipse : ");
                    side2 = sc.nextDouble();
                    Ellipse(side1, side2);
                    break;

                case 11:
                    //prompt the user to input the given data for cube
                    System.out.print("Enter side of the cube : ");
                    side = sc.nextDouble();
                    Cube(side);
                    break;

                case 12:
                    //prompt the user to input the given data for cuboid
                    System.out.print("Enter length of the cuboid : ");
                    length = sc.nextDouble();
                    System.out.print("Enter breadth of the cuboid : ");
                    breadth = sc.nextDouble();
                    System.out.print("Enter height of the cuboid : ");
                    height = sc.nextDouble();
                    Cuboid(length, breadth, height);
                    break;

                case 13:
                    //prompt the user to input the given data for sphere
                    System.out.print("Enter radius of the sphere : ");
                    radius = sc.nextDouble();
                    Sphere(radius);
                    break;

                case 14:
                    //prompt the user to input the given data for cylinder
                    System.out.print("Enter radius of the cylinder : ");
                    radius = sc.nextDouble();
                    System.out.print("Enter height of the cylinder : ");
                    height = sc.nextDouble();
                    Cylinder(radius, height);
                    break;

                case 15:
                    //prompt the user to input the given data for cone
                    System.out.print("Enter radius of the cone : ");
                    radius = sc.nextDouble();
                    System.out.print("Enter height of the cone : ");
                    height = sc.nextDouble();
                    System.out.print("Enter length of the cone : ");
                    length = sc.nextDouble();
                    Cone(radius, height, length);
                    break;

                case 16:
                    //prompt the user to input the given data for hemisphere
                    System.out.print("Enter radius of the hemisphere : ");
                    radius = sc.nextDouble();
                    Hemisphere(radius);
                    break;

                case 17:
                    //prompt the user to input the given data for rectangularSolid
                    System.out.print("Enter length of the rectangularSolid : ");
                    length = sc.nextDouble();
                    System.out.print("Enter breadth of the rectangularSolid : ");
                    breadth = sc.nextDouble();
                    System.out.print("Enter height of the rectangularSolid : ");
                    height = sc.nextDouble();
                    RectangularSolid(length, breadth, height);
                    break;

                case 18:
                    //prompt the user to input the given data for squarePyramid
                    System.out.print("Enter side of the squarePyramid : ");
                    side = sc.nextDouble();
                    System.out.print("Enter height of the squarePyramid : ");
                    height = sc.nextDouble();
                    SquarePyramid(side, height);
                    break;

                case 19:
                    //prompt the user to input the given data for rectangularPyramid
                    System.out.print("Enter length of the rectangularPyramid : ");
                    length = sc.nextDouble();
                    System.out.print("Enter breadth of the rectangularPyramid : ");
                    breadth = sc.nextDouble();
                    System.out.print("Enter height of the rectangularPyramid : ");
                    height = sc.nextDouble();
                    RectangularPyramid(length, breadth, height);
                    break;

                case 20:
                    // prompt the user to input the data for tetrahedron
                    System.out.print("Enter side of the tetrahedron : ");
                    side = sc.nextDouble();
                    Tetrahedron(side);
                    break;

                default:
                    // execute this statement if user enter the number below or above the choice range
                    System.out.println("Invalid input");
            } // end of switch statement

            // prompt the user to continue calculation or not
            System.out.print("\n\nDo you want to calculate another shape? (Yes/No): ");
            repeat = sc.next();

        } // do...closing

        // condition to calculate further
        while (repeat.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the Geometric Shape Calculator!");

        // closing scanner to prevent from resources leak
        sc.close();

    }
}
