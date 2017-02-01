package ai.notebook.notebook;


/**
 * Created by web on 2017-01-31.
 */

public class MainMenuItem {

    private String itemName;
    private int headerImage;

    public MainMenuItem(String itemName, int headerImage) {
        this.itemName = itemName;
        this.headerImage = headerImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(int headerImage) {
        this.headerImage = headerImage;
    }

    @Override
    public String toString() {
        return getItemName();
    }
}
