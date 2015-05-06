package io.minetweak.world;

import io.minetweak.block.IBlock;

public interface IChunk {

    /**
     * Get the X-coordinate for this chunk.
     *
     * @return Chunk X-coordinate
     */
    int getX();

    /**
     * Get the Z-coordinate for this chunk.
     *
     * @return Chunk Z-coordinate
     */
    int getZ();

    // TODO @logangorence IEntity[] getEntities();

    /**
     * Check if the chunk is loaded in the world.
     *
     * @return True if the chunk is loaded.
     */
    boolean isLoaded();

    /**
     * Get a block from this chunk.
     *
     * @param x X-coordinate in this chunk(0-15)
     * @param y Y-coordinate in this chunk(0-255)
     * @param z Z-coordinate in this chunk(0-15)
     * @return Block at specified coordinates
     */
    IBlock getBlock(int x, int y, int z);

    /**
     * Get the world that this chunk is in.
     *
     * @return Chunk's world
     */
    IWorld getWorld();

}
