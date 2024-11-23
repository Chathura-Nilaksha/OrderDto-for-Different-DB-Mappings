//check items in testing
/*
1-IN-OrderDto
        when as below-will auto identify the CustomerAndOrderData fields from FE nested obj
    //@Embedded-chat has not inserted this.
    private CustomerAndOrderData customerAndOrderData;

2-IN-OrderEntityEmbd
        Obj type is from entity obj type .
        name is same as dto obj name.
        -check working properly.
    @Embedded
    private ""CustomerAndOrderDataEmbd"" customerAndOrderData;

3-IN-DTO-CustomerAndOrderData
    check whether will it map without above cls ( means Only having
    entity same as Embd and OneTo when from FE name is CustomerAndOrderData )


*/


package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
