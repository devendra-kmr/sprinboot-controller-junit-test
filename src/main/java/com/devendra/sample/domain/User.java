package com.devendra.sample.domain;


import lombok.Data;

import java.util.List;

@Data
public class User {
   private String id ;
   private String userId;
   private String firstName;
   private String middleName;
   private String lastName;
   private List<String> primaryContactNo;
   private List<String> contactNo;
   private String address;
}
