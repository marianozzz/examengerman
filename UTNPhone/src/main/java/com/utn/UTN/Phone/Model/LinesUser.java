package com.utn.UTN.Phone.Model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "lines_users")
public class LinesUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idline")
    private Integer idline;
    @Column(name = "linenumber")
    private Integer linenumber;
    @Column( name = "idtype")
    private Integer idtype;
    @Column(name = "iduser")
    private Integer iduser;





    @JoinColumn(name = "idtype", unique = true,insertable=false, updatable=false)

    @OneToOne(cascade = CascadeType.ALL)

    private LineType lineType;

    @JoinColumn(name = "origincall", unique = true,insertable=false, updatable=false)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Call> calls;
}
