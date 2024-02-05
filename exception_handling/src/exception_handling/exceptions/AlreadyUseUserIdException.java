package exception_handling.exceptions;

/**
 * 이미 가입된 아이디로 회원가입을 시도할 때 발생할 예외
 */
public class AlreadyUseUserIdException extends RuntimeException {

	private static final long serialVersionUID = 3441049391301641643L;
	
	public AlreadyUseUserIdException(String message) {
		super(message);
	}

	public AlreadyUseUserIdException(String message, Throwable cause) {
		super(message, cause);
	}
}
