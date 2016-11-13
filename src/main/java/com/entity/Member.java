/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author chivas
 */
@Entity @Table(name="member")
public class Member {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(name="name")
	String name;
        @Column(name="sername")
	String sername;
        @Column(name="nickname")
	String nickname;
	@Column(name="email")
	String email;
        @Column(name="password")
	String password;
        @Column(name="address")
	String address;
        @Column(name="tel")
	String tel;
        
        
        public Member(){
            
        }
        
        public Member(Long id, String name, String sername, String nickname, String email, String password, String address, String tel){
                this.id = id;
                this.name = name;
                this.sername = sername;
                this.nickname = nickname;
                this.email = email;
                this.password = password;
                this.address = address;
                this.tel = tel;
        
        }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }        
        
}   
