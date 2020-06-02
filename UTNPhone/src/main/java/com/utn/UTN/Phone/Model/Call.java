package com.utn.UTN.Phone.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "Calls")
public class Call {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcall")
    private Integer idcall;
    @Column(name = "origincall")
    private Integer origincall;
    @Column(name = "destinationcall" )
    private Integer destinationcall;
    @Column(name = "origincity")
    private Integer origincity;
    @Column(name = "destinationcity")
    private Integer destinationcity;
    @Column(name ="durationtime")
    private Integer durationtime;
    @Column(name = "price")
    private  Integer price;
    @Column(name = "costprice")
    private  Integer costprice;
    @Column(name = "total" )
    private  Integer total;
    @Column(name = "idinvoice")
    private Integer idinvoice;
    @Column(name = "idrate" )
    private  Integer idrate;

/*

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    private LinesUser linesUser;*/
}
