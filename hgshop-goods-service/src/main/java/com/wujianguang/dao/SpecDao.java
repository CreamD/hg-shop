package com.wujianguang.dao;

import java.util.List;

import com.wujianguang.pojo.Spec;
import com.wujianguang.pojo.SpecOption;

public interface SpecDao {

	List<Spec> list(String name);

	int addSpec(Spec spec);

	int addOption(SpecOption specOption);

	int updateSpec(Spec spec);

	int deleteSpecOtions(int id);

	int deleteSpec(int id);

	Spec get(int id);

	int deleteSpecOtionsBatch(int[] ids);

	int deleteSpecBatch(int[] ids);

}
