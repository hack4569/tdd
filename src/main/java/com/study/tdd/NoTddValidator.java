package com.study.tdd;


import com.study.tdd.exception.PasswordException;
import org.springframework.util.StringUtils;

public class NoTddValidator {
    public int validate(String pwd) {
        if (!StringUtils.hasText(pwd)) {
            throw new PasswordException("비밀번호를 입력하세요.");
        }
        int passCnt = 0;
        if (pwd.length() >= 8) {
            passCnt++;
        }
        if (pwd.matches(".*\\d.*")) {
            passCnt++;
        }
        if (pwd.matches(".*[A-Z].*")) {
            passCnt++;
        }
        return passCnt;
    }

    public String getLevel(int validCnt) {
        if (validCnt >= 0) {
            if (validCnt >= 2) {
                if (validCnt >= 3) {
                    return "강함";
                }
                return "중간";
            }
        }
        return "약함";
    }
}
