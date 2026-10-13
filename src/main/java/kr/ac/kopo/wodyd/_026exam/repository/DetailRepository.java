package kr.ac.kopo.wodyd._026exam.repository;

import kr.ac.kopo.wodyd._026exam.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
