package case_study.services;


import case_study.util.ServiceEnum;


public class ProductServicesFactory {
    private ProductServicesFactory(){}
    public static IProductServices getInstance(ServiceEnum serviceEnum){
        switch(serviceEnum){
            case PRODUCT:
                return ProductServices.getInstance();
        }
        return null;
    }
}
