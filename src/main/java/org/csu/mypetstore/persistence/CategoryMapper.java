package org.csu.mypetstore.persistence;

import org.csu.mypetstore.domain.Category;
import java.util.List;

public interface CategoryMapper {
    List<Category> getCategoryList();
    Category getCategory(String categoryId);
}
