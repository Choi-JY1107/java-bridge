package bridge.view;

public enum OutputMessage {
    // Input 관련 멘트
    GAME_START_MESSAGE("다리 건너기 게임을 시작합니다.\n"),
    INPUT_NUMBER_MESSAGE("다리의 길이를 입력해주세요."),
    INPUT_MOVING_MESSAGE("이동할 칸을 선택해주세요. (위: U, 아래: D)"),
    INPUT_RESTART_MESSAGE("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"),
    // Error 멘트
    ERROR_BRIDGE_SIZE("다리 길이는 숫자여야 합니다."),
    ERROR_SIZE_RANGE("다리 길이는 3부터 20 사이의 숫자여야 합니다."),
    ERROR_MOVING("이동할 칸은 U나 D여야 합니다."),
    ERROR_RESTART("게임 재시작 여부 입력은 R이나 Q여야 합니다."),
    // Output 관련 멘트
    START_SQUARE_BRACKET("[ "),
    END_SQUARE_BRACKET(" ]"),
    VERTICAL_BAR(" | ");

    private static final String errorMessagePrefix = "[ERROR] ";
    private final String outputMessage;

    OutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }

    public String getMessage() {
        return outputMessage;
    }

    public String getErrorMessage() {
        return errorMessagePrefix + outputMessage;
    }

}
