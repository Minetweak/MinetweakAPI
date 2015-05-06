package io.minetweak.inventory;

public interface IInventory {

    int getSlotCount();

    IItemStack getSlot(int slot);

}
