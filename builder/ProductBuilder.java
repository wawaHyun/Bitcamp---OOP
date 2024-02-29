package builder;

import model.ProductDto;

public class ProductBuilder {

    private int productNum;
    private String productName;
    private String company;
    private int productPrice;

    public ProductBuilder productNum(int productNum){
        this.productNum = productNum;
        return this;
    }
    public ProductBuilder productName(String productName){
        this.productName = productName;
        return this;
    }
    public ProductBuilder company(String company){
        this.company = company;
        return this;
    }
    public ProductBuilder productPrice(int productPrice){
        this.productPrice = productPrice;
        return this;
    }
    public ProductDto build(){
        return new ProductDto(productNum,productName,company,productPrice);
    }

}
