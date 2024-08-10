# Requirements
1. Vending machine should support coins and notes
2. Vending machine should support multile transections
3. Vending machine should return extra money
4. Should update inventory
5. Should collect money


# Entities
1. VendingMachine
2. Payment -
    a) Coins
    b) Notes
3. Inventory
4. Product - CHIP, BISCUIT, DRINK


# Operations
1. getVendigMachine() : it will return a singleton instance of vending machine
2. AddItems(List<Item> items):  this will add items into the inventory
3. 