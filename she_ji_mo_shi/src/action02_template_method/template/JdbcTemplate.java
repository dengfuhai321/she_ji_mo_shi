package action02_template_method.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import action02_template_method.template.entity.RowMapper;

/*
 * 《SPRING技术内幕》里面在讲加载配置文件的时候,就使用了模板模式
 * 文件系统目录加载配置文件（FileSystemXmlApplicationContext），
 * 类路径加载配置文件(ClassPathXmlApplicationContext)，
 * 以及根据项目上下文目录(XmlWebApplicationContext)加载配置文件
 * 
 * 模板模式的理解：通俗点的理解就是 ：完成一件事情，有固定的数个步骤，但是每个步骤根据
 * 对象的不同，而实现细节不同；就可以在父类中定义一个完成该事情的总方法，
 * 按照完成事件需要的步骤去调用其每个步骤的实现方法。每个步骤的具体实现，由子类完成。
 */
public class JdbcTemplate {
	private DataSource datesource;

	public JdbcTemplate(DataSource datesource) {
		this.datesource = datesource;
	}

	private Connection getConnection() throws Exception {
		return this.datesource.getConnection();
	}

	private PreparedStatement createprepareStatement(Connection con, String sql) throws SQLException {
		return con.prepareStatement(sql);
	}

	private ResultSet executeQuery(PreparedStatement ps, Object[] values) throws SQLException {
		for (int i = 0; i < values.length; i++) {
			ps.setObject(i, values[i]);
		}
		return ps.executeQuery();

	}

	private void closeStatement(PreparedStatement ps) throws SQLException {
		ps.close();
	}

	private void closeResult(ResultSet rs) throws SQLException {
		rs.close();
	}

	private void closeConnection(Connection conn) throws SQLException {
		// 通常放到连接池中回收，先不关闭
	}

	private List<?> parseResultSet(ResultSet rs, RowMapper rowmapper) throws Exception {
		List<Object> result = new ArrayList<Object>();
		int rowNumber = 1;
		while (rs.next()) {
			result.add(rowmapper.mapRow(rs, rowNumber++));
		}
		return result;

	}

	public List<?> executeQuery(String sql, RowMapper rowmapper, Object[] values) {
		try {
			// 1.获取连接
			Connection conn = this.getConnection();
			// 2.创建语句集
			PreparedStatement ps = conn.prepareStatement(sql);
			// 3.执行语句集，并获得结果集
			ResultSet rs = this.executeQuery(ps, values);
			// 4.解析语句集
			List<?> result = this.parseResultSet(rs, rowmapper);

			// 5.关闭结果集
			rs.close();
			// 6.关闭语句集
			ps.close();
			// 7.关闭连接
			conn.close();

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
