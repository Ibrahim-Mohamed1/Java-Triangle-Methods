// Ibrahim Mohamed

package trianglemethodsibrahimmohamed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TriangleMethodsIbrahimMohamed
{

    public static void main(String[] args)
    {
        double sidea, sideb, sidec, area = 0;
        boolean validity;
        String shape;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter values for sides:");

        sidea = kbd.nextDouble();
        sideb = kbd.nextDouble();
        sidec = kbd.nextDouble();

        validity = isValid(sidea, sideb, sidec);

        if (validity == true)
        {
            shape = triangleType(sidea, sideb, sidec);
            area = triangleArea(sidea, sideb, sidec);
        } else
        {
            shape = "Invalid Triangle";
        }

        System.out.println("\nTriangle type:  " + shape);
        
        if (area > 0.0)
        {
            System.out.println("Area:  " + area);
        } else
        {
            System.out.println("Triangle area: Unable to calculate!");
        }
    }

    public static boolean isValid(double sidea, double sideb, double sidec)
    {
        boolean sum;

        List<Double> nums = new ArrayList<>();

        nums.add(sidea);
        nums.add(sideb);
        nums.add(sidec);

        Collections.sort(nums);

        return sum = nums.get(0) + nums.get(1) > nums.get(2);
    }

    public static double triangleArea(double sidea, double sideb, double sidec)
    {
        double sum = (sidea + sideb + sidec) / 2;

        double sqt = Math.sqrt(sum * (sum - sidea) * (sum - sideb)
                * (sum - sidec));

        double round = Math.round(sqt * 100.00) / 100.00;

        return round;
    }

    public static String triangleType(double a, double b, double c)
    {
        String shape;

        if (a == b)
        {
            shape = "Isosceles";
        } else if (a == c)
        {
            shape = "Equilateral";
        } else
        {
            shape = "Scalene";
        }
        return shape;
    }
}
