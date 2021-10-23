package com.hendisantika.repository;

import com.hendisantika.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-jpa-relationships
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/10/21
 * Time: 08.05
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
