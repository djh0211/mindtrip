package com.a303.memberms.domain.member.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MemberBulkRepository {

	private final JdbcTemplate jdbcTemplate;

	public void deleteAllMemberBackup() {
		String sql = "delete from member_backup where 1=1";

		jdbcTemplate.batchUpdate(sql);
	}


	public void copyToMemberBackup() {
		String sql = "insert into member_backup select * from member";

		jdbcTemplate.batchUpdate(sql);

	}


}
