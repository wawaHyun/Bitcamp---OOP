package model;

public class ProductDto {
    private int username;
    private int productNum;
    private String productName;
    private String company;
    private int productPrice;

    public ProductDto(int productNum, String productName, String company, int productPrice) {
        this.productNum = productNum;
        this.productName = productName;
        this.company = company;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productNum=" + productNum +
                ", ProductName='" + productName + '\'' +
                ", company='" + company + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        productName = productName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

}
