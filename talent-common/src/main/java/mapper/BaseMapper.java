package mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

    List<T> selectByInfo(Object o);

    int batchDel(Map<String, Object> map);

}