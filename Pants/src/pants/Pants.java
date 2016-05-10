package pants;

import java.util.Scanner;

/**
 * Represents a pair of pants
 *
 * @author Michael Burrell
 * @since 10-May-2016
 */
public class Pants {

    private float size;

    public Pants(float size) {
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    /**
     *
     * @return true, because pants are cool by default
     */
    public boolean looksCool() {
        return true;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Pants pants;
        System.out.println(
                "(1) for pants with pockets" +
                "(2) for rain pants" +
                "(3) for a different kind of pants");
        System.out.println("How big? ");
        float sz = kbd.nextFloat();
        switch (kbd.nextInt()) {
            case 1:
                System.out.print("How many pockets? ");
                int pockets = kbd.nextInt();
                pants = new PantsWithPockets(pockets, sz);
                break;
            case 2:
                System.out.print("What material? ");
                String material = kbd.nextLine();
                pants = new RainPants(material, sz);
                break;
            case 3:
            default:
                pants = new Pants(sz);
                break;
        }
        System.out.println("Size " + pants.getSize());
        if (pants.looksCool()) {
            System.out.println("Your pants are cool");
        } else {
            System.out.println("Not cool");
        }
    }
}
