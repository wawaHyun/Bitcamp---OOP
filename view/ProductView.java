<<<<<<< HEAD
package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main() {

        List<Product> prodList = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            prodList.add(Product.builder()
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
=======
package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main() {

        List<Product> prodList = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            prodList.add(Product.builder()
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
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
