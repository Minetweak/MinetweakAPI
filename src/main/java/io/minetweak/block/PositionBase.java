package io.minetweak.block;

import io.minetweak.world.IChunk;

/**
 * Represents the position of a block in the world.
 */
public abstract class PositionBase {

    private int x;
    private int y;
    private int z;

    public PositionBase(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public PositionBase(IBlock block) {
        this.x = block.getX();
        this.y = block.getY();
        this.z = block.getZ();
    }

    /*
     TODO @logangorence
     Math formula to calculate distance between
     two positions
     */

    public abstract IChunk getChunk();

    /**
     * Get the X-coordinate of the block in the world.
     *
     * @return X-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get the Y-coordinate of the block in the world.
     *
     * @return Y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Get the Z-coordinate of the block in the world.
     *
     * @return Z-coordinate
     */
    public int getZ() {
        return z;
    }

}
