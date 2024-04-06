package com.a303.memberms.domain.memberBackup;

import com.a303.memberms.domain.BaseEntity;
import com.a303.memberms.domain.member.Role;
import com.a303.memberms.domain.reportMember.ReportMember;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberBackup extends BaseEntity {

	public static MemberBackup createMember(String id, String password, String nickname) {
		MemberBackup member = new MemberBackup();
		member.setId(id);
		member.setPassword(password);
		member.setNickname(nickname);
		member.setLevel(1);
        member.setRole(Role.USER);

		return member;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private int memberId;

	@Column(length = 24)
	private String id;

	@Column(length = 30)
	private String password;

	@Column(length = 300)
	private String socialId;

	@Column(length = 80)
	private String nickname;

	private Integer villageId;
	private int level;
	private int missionCount;
	private int reportCount;

	@Enumerated(EnumType.STRING)
	private Role role;

}
