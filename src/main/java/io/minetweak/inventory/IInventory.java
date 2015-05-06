package io.minetweak.inventory;

/**
 * Represents an inventory in the game.
 *
 * @author Logan Gorence
 */
public interface IInventory {

    /**
     * Get the amount of slots in this inventory.
     * @return Amount of slots in the inventory
     */
    int getSlotCount();

    /**
     * Get an IItemStack for a specified slot.
     * @param slot Slot index
     * @return Slot's item(s)
     */
    IItemStack getSlot(int slot);

}
