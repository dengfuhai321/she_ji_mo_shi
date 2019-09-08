package action02_template_method.template.dao;

import java.sql.ResultSet;
import java.util.List;

import action02_template_method.template.JdbcTemplate;
import action02_template_method.template.entity.Member;
import action02_template_method.template.entity.RowMapper;

/*
 * 如上就使用模板模式做的查询，父类中做了算法骨架，子类中具体实现算法中的不同部分。
 * 优点：（1）具体细节步骤实现定义在子类中，子类定义详细处理算法是不会改变算法整体结构。

　（2）代码复用的基本技术，在数据库设计中尤为重要。

　（3）存在一种反向的控制结构，通过一个父类调用其子类的操作，通过子类对父类进行扩展增加新的行为，符合“开闭原则”。
 */
public class MemberDao {
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

	public List<?> query() {
		String sql = "select * form t_member";
		return jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {

			@Override
			// 它相当于在执行父类JdbcTemplate总方法executeQuery时,实现了父类的具体某一步骤的具体方法
			public Member mapRow(ResultSet rs, int rowNum) throws Exception {
				Member member = new Member();
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setNickName(rs.getString("nickName"));
				member.setAge(rs.getInt("age"));
				member.setAddr(rs.getString("addr"));
				return member;
			}

		}, null);
	}

}
