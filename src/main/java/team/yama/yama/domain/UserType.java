package team.yama.yama.domain;

public enum UserType {
    Admin(0), Manager(1), Operator(2), Tenant(3);

    private final Integer code;

    UserType(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
