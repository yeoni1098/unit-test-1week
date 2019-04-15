public class UpperCaseCounter {
    public int getNumberOfUpperCaseCharactersInString(String str) {
        if (str == null) { //문자열이 없으면 테스트 안되니까
            return 0;
        }

        int numberOfUpperCaseChars = 0;
        for (int index=0; index < str.length(); index++) {
            char charAt = str.charAt(index);
            if (charAt >= 'A' && charAt <= 'Z') {
                numberOfUpperCaseChars++;
            } //test만드는 방법 커맨드 + 쉬프트 + t
        }
        return numberOfUpperCaseChars;
    }
}

/*

이렇게 테스트 해야하는 상황을 뽑아냄
null일 경우에 리턴이 0인지

소문자 숫자가 포함되어 있으면 어떻게 되는지?
str에 빈값이 들어있으면?
 */
