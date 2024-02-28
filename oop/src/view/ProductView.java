package view;

import builder.ProductBuilder;
import model.ProductDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {

        List<ProductDto> prodList = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            prodList.add(new ProductBuilder()
                    .productNum(util.createRandomInteger(1,10))
                    .productName(util.createRandomName())
                    .company(util.createRandomTitles())
                    .productPrice(util.createRandomInteger(3000,150000))
                    .build()
            );
        }

        prodList.forEach(i->{
            System.out.println(i.toString());
        });

    }
}
