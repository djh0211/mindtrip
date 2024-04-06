package com.a303.memberms.domain.memberBackup.repository;

import com.a303.memberms.domain.member.Member;
import com.a303.memberms.domain.member.repository.MemberRepositoryCustom;
import com.a303.memberms.domain.memberBackup.MemberBackup;
import jakarta.annotation.Nonnull;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberBackupRepository extends JpaRepository<MemberBackup, Integer> {

//	Optional<Member> findByMemberId(int memberId);

//	@Query("SELECT DISTINCT m.memberId FROM Member m")
//	List<Integer> findDistinctMemberId();

//	Optional<Member> findById(@Nonnull String id);

//	boolean existsById(@Nonnull String id);

//	boolean existsByNickname(@Nonnull String nickname);

	@Query("SELECT DISTINCT m.missionCount FROM MemberBackup m where m.memberId=:memberId")
	int findMissionCountByMemberId(@Param("memberId") int memberId);

}

