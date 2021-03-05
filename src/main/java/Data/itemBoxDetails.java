package Data;

public class itemBoxDetails {
    String title;
    String price;
    String numberOfStars;

    public itemBoxDetails(String title, String price, String numberOfStars) {
        this.title = title;
        this.price = price;
        this.numberOfStars = numberOfStars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(String numberOfStars) {
        this.numberOfStars = numberOfStars;
    }
}
