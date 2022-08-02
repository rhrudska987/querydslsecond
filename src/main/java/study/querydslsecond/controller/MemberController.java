package study.querydslsecond.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.querydslsecond.dto.MemberSearchCondition;
import study.querydslsecond.dto.MemberTeamDto;
import study.querydslsecond.repository.MemberJpaRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberJpaRepository memberJpaRepository;

    @GetMapping("/v1/members")
    public List<MemberTeamDto> seearchMemberV1(MemberSearchCondition condition) {
        return memberJpaRepository.search(condition);
    }

}
