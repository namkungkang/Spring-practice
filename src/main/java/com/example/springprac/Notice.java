package com.example.springprac;
import jakarta.persistence.*;

@Entity
public  class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id;

    @Column
    public String Title;

    @Column
    public String date;
}
