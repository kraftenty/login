package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id; // DB 저장과 관리를 위한 ID

    @NotEmpty
    private String loginId; // 로그인 할 때 사용하는 ID
    @NotEmpty
    private String name; // 사용자 이름
    @NotEmpty
    private String password;
}
