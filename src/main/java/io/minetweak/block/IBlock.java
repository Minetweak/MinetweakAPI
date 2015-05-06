package io.minetweak.block;

import io.minetweak.world.IChunk;
import io.minetweak.world.IWorld;

/**
 * Interface that represents a Block inside of a world.
 *
 * @author Logan Gorence
 */
public interface IBlock {

    /**
     * Get the X-coordinate of the block in the world.
     *
     * @return X-coordinate
     */
    int getX();

    /**
     * Get the Y-coordinate of the block in the world.
     *
     * @return Y-coordinate
     */
    int getY();

    /**
     * Get the Z-coordinate of the block in the world.
     *
     * @return Z-coordinate
     */
    int getZ();

    /**
     * Get the position of the block in the world.
     *
     * @return Position object
     */
    PositionBase getPosition();

    /**
     * Get the world that this block is in.
     *
     * @return Block's world
     */
    IWorld getWorld();

    /**
     * Get the chunk that this block is in.
     *
     * @return Block's chunk
     */
    IChunk getChunk();

    /**
     * Determine if the block is air.
     *
     * @return True if block is air
     */
    boolean isAir();

    /**
     * Determine if the block is a liquid.
     *
     * @return True if the block is liquid
     */
    boolean isLiquid();

}
