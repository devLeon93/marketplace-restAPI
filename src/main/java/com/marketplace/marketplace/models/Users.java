package com.marketplace.marketplace.models;
import javax.persistence.*;
import java.util.List;



    @Entity
    @Table(name = "Users")
    public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @Column(name = "username")
        private String username;
        @Column(name = "email")
        private String email;
        @Column(name = "password")
        private String password;

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
        private List<Product> products;


        public Users() {
        }


        public Users(Long id, String username, String email, String password, List<Product> products) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.password = password;
            this.products = products;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }

