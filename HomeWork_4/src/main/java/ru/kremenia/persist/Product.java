package ru.kremenia.persist;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Product {

    private Long id;
    @NotBlank(message = "can not be empty")
    private String productName;

    @NotBlank(message = "can not be empty")
    private String price;

    @Pattern(regexp = "^(?=.*?\\d)(?=.*?[A-Z]).{8,}$", message = "Password too simple")
    private String password;

    private String matchingPassword;

    public Product(String productName) {
        this.productName = productName;
    }

}