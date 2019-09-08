package action02_template_method.template.entity;

import java.sql.ResultSet;

public interface RowMapper<T> {
	public T mapRow(ResultSet rs, int rowNum) throws Exception;

}
