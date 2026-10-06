package kr.ac.kopo.wodyd._026exam.repository;

import jakarta.transaction.Transactional;
import kr.ac.kopo.wodyd._026exam.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Member3Repository2 extends JpaRepository<Member3, Integer> {

    @Transactional
    @Query(value = "select * from Member3", nativeQuery= true)
//    @Query(value = "select  entity from Member3 entity")
    public List<Member3> selectMembers();

    @Transactional
    @Query(value = "select * from Member3 where id = ?", nativeQuery = true)
//    @Query(value = "select entity from Member3 entity where id = :e_id")
    public Member3 selectById(@Param("e_id")int id);

    @Transactional
    @Modifying
    @Query(value = "insert into Member3(name, age, email) values(?, ?, ?)", nativeQuery = true)
//    @Query(value = "insert into Member3(name, age, email) values(:e_name, :e_age, :e_email)")
    public int insertMember(@Param("e_name") String name, @Param("e_name")int age, @Param("e_name")String email);

    @Transactional
    @Modifying
    @Query(value = "update Member3 set name = ?, age=?, email=? where id = ?", nativeQuery = true)
//    @Query(value = "update Member3 set name = ?, age=?, email=? where id = ?")
    public int updateMember(@Param("e_name") String name, @Param("e_name")int age, @Param("e_name")String email, @Param("e_id")int id);

    @Transactional
    @Modifying
    @Query(value = "delete from Member3 where id = ?", nativeQuery = true)
//    @Query(value = "delete from Member3 where id = :e_id")
    public int deleteMember(@Param("e_id")int id);
}
