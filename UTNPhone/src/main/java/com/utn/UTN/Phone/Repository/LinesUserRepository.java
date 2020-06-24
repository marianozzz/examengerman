package com.utn.UTN.Phone.Repository;

import com.utn.UTN.Phone.Model.LinesUser;
import com.utn.UTN.Phone.Projection.LinesUserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface LinesUserRepository extends JpaRepository<LinesUser,Integer> {

   // @Query(value = "SELECT * FROM lines_users WHERE NOT EXISTS (SELECT NULL FROM calls WHERE lines_users.idline = calls.origincall)", nativeQuery = true)
    @Query(value = "SELECT linenumber FROM lines_users WHERE NOT EXISTS (SELECT NULL FROM calls WHERE lines_users.idline = calls.origincall)", nativeQuery = true)
    List<LinesUserProjection>  getNumber();
}
