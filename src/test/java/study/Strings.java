package study;

public class Strings {
    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
    // 인풋이 null이면 True or input에서 trim(선행, 후행 공백이 제거된 문자열을 return or 공백이 없다면 자신을 return)값이 공백일 경우
}
