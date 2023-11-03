
package thogakadeitem;

public class Item {
    private String itemID;
    private String itemName;
    private String unitprice;
    private String stock;

    public Item() {
    }

    public Item(String itemID, String itemName, String unitprice, String stock) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.unitprice = unitprice;
        this.stock= stock;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    
    public String getUnitprice() {
        return unitprice;
    }

    
    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }

    public String getStock() {
        return stock;
    }

    
    public void setStock(String qtyOnHand) {
        this.stock = stock;
    }
    
    
}
