package task1325;

/*
 *
 */

import java.awt.*;

public class Solution {
    public static void main(String[] args) {
        Fox bigFox = new BiFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BiFox extends Fox {
        public Color getColor() {
            return Color.GRAY;
        }
    }

}
