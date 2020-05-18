package wrapper;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncryptWrapper extends HttpServletRequestWrapper{
	// 암호화 처리를 위해 우선 HttpServletRequestWrapper를 상속
	
	// 부모타입에는 없는 기본생성자 생성
	// 반드시 명시적으로 HttpServletRequest를 매개변수로 하는 생성자를 작성
	public EncryptWrapper(HttpServletRequest request) {
		super(request);
	}
	// ServletRequestWrapper의 getParameter 메소드를 오버라이딩
		@Override
		public String getParameter(String key) {
			String value = "";
			
			if(key != null && key.equals("userPwd")) {
				value = getSha512(super.getParameter(key));
			}else {
				value = super.getParameter(key);
			}
			return value;
		}
		/*
		 * sha512 해쉬 함수를 사용하여 암호화한다.
		 */
		public static String getSha512(String userPwd) {
			String encPwd = null;
			
			MessageDigest md = null;
			
			try {
				md = MessageDigest.getInstance("SHA-512");
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			
			// 전달받은 userPwd를 UTF-8 인코딩 방식의 바이트 배열로 바꿈
			byte[] bytes = userPwd.getBytes(Charset.forName("UTF-8"));
			
			// md 객체에 userPwd 바이트 배열을 전달해서 갱신(인지)
			md.update(bytes);
			
			// java.util.Base64 인코더를 이용해서 암호화된 바이트 배열을 인코딩해서 문자열로 출력
			// digest()가 암호화 되는 것!
			encPwd = Base64.getEncoder().encodeToString(md.digest());
			
			return encPwd;
		}

}
