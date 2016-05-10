package pants;

/**
 *
 * @author Michael Burrell
 * @since 10-May-2016
 */
public class PantsWithPockets extends Pants {
    private int numPockets;

    public PantsWithPockets(int numPockets, float size) {
        super(size);
        this.numPockets = numPockets;
    }

    public int getNumPockets() {
        return numPockets;
    }

    public void setNumPockets(int numPockets) {
        this.numPockets = numPockets;
    }

    @Override
    public boolean looksCool() {
        return this.numPockets <= 4;
    }
    
    
}
