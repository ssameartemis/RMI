package utils;

import pages.*;


public class Pages {
    private LoginPage loginPage;



//    private Cart cart;
//
//    public Cart car(){
//        if (cart == null) {
//            cart = new Cart();
//        }
//    return cart;
//    }


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }





}
