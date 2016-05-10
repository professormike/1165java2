package pants;

/**
 *
 * @author Michael Burrell
 * @since 10-May-2016
 */
public class RainPants extends Pants {
    private String material;

    public RainPants(String material, float size) {
        super(size);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean looksCool() {
        return false;
    }

    
}
