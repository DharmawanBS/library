package bit5.team2.library.test;

import bit5.team2.library.entity.Admin;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends PagingAndSortingRepository<Admin,String> {
}
