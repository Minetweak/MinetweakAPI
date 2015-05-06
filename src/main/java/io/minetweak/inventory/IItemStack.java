package io.minetweak.inventory;

/**
 * Represents a stack of items in an inventory.
 *
 * @author Logan Gorence
 */
public interface IItemStack {

    /**
     * Get the unlocalized name of the item.
     * @return Unlocalized item name
     */
    String getUnlocalizedName();

    /**
     * Get the localized name of the item.
     * @return Localized item name
     */
    String getName();

    /**
     * Get the amount of items in the stack.
     *
     * @return Amount of items in stack
     */
    int getStackCount();

}
