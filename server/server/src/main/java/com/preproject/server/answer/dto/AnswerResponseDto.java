package com.preproject.server.answer.dto;

import com.preproject.server.member.dto.MemberDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AnswerResponseDto {
    private long answerId;
    private String answerContent;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private MemberDto.Response memberResponseDto;
}