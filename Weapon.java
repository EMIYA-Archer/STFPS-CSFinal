import java.util.*;
/*
FILE FORMAT:
<a> <b> <c> <d> <e> <f> <g>

all go into equation:
d(x) = ax^6 + bx^5 + cx^4 + dx^3 + ex^2 + fx + g
to get the damage d(x) at a distance x
*/
public class Weapon {
   private double powers[];
   public Weapon(Scanner in){
      powers = new double[7];
      for(int i = 0; i < powers.length; i ++){
         powers[i] = in.nextDouble();
      }
   }
   public double getDamage(double dist){
      double out = 0;
      for(int i = 0; i < powers.length; i ++){
         out += powers[i] * Math.pow(dist, powers.length - i - 2);
      }
      return out;
   }
}