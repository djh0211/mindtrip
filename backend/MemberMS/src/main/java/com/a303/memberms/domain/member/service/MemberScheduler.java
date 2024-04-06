package com.a303.memberms.domain.member.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class MemberScheduler {

    private final MemberService memberService;

    @Scheduled(fixedDelay = 10*60000)
    public void backupMember() {
        memberService.backupMemberScheduling();

    }
}
