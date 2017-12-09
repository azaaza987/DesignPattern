package com.cyh.structural.filter.pattern;

import java.util.List;

/**
 * Created by Administrator on 2017/12/9.
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
