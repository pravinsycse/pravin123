package com.example.ademo;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

public interface EnquiryDao extends JpaRepository<Enquiry,Serializable>  {

}
