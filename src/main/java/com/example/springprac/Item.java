package com.example.springprac;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id;

    @Column(columnDefinition = "TEXT") // 컬러타입 지정 가능
    public String Name;

    @Column
    public Integer price;
}


