package lotto.utils;

public enum LottoMessage {
    INPUT_AMOUNT("구입금액을 입력해 주세요."),
    INPUT_WIN_NUMBERS("지난 주 당첨 번호를 입력해 주세요."),
    INPUT_BONUS_BALL("보너스 볼을 입력해 주세요.");

    private final String message;

    LottoMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
